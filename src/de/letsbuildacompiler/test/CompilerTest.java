package de.letsbuildacompiler.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import jasmin.ClassFile;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import de.letsbuildacompiler.compiler.Main;
import de.letsbuildacompiler.compiler.exceptions.UndeclaredVariableException;
import de.letsbuildacompiler.compiler.exceptions.VariableAlreadyDefinedException;

public class CompilerTest {
	private Path tempDir;
	
	@BeforeMethod
	public void createTempDir() throws IOException{
		tempDir = Files.createTempDirectory("compilerTest");
	}
	
	@AfterMethod
	public void deleteTempDir(){
		deleteRecursive(tempDir.toFile());
	}
	
	private void deleteRecursive(File file) {
		if (file.isDirectory()){
			for(File child: file.listFiles()){
				deleteRecursive(child);
			}
		}
		if(!file.delete()){
			throw new Error("could not delete file <"+file+">");
		}
	}

	@Test(dataProvider = "provide_code_exceptedText")
	public void runningCode_outputsExpectedText(String code, String expectedText) throws Exception {
		// execution
		String actualOutput = compileAndRun(code);

		// evaluation
		Assert.assertEquals(actualOutput, expectedText);
	}

	private String compileAndRun(String code) throws Exception{
		
		code = Main.compile(new ANTLRInputStream(code));
		System.out.println(code);
		ClassFile classFile = new ClassFile();
		classFile.readJasmin(new StringReader(code), "", false);
		Path outputPath = tempDir.resolve(classFile.getClassName()+ ".class");
		try(OutputStream output = Files.newOutputStream(outputPath)){
			classFile.write(output);			
		}
		
		return runJavaClass(tempDir, classFile.getClassName());
	}
	
	@Test(expectedExceptions = UndeclaredVariableException.class,
			expectedExceptionsMessageRegExp = "1:8 undeclared variable <x>")
	public void compilingCode_throwsUndeclaredVariableException_ifReadingUndefinedVariableIsUndefined() throws Exception{
		// execution
		compileAndRun("println(x);");

				// evaluation performed by expected exception
	}
	
	@Test(expectedExceptions = UndeclaredVariableException.class,
			expectedExceptionsMessageRegExp = "1:0 undeclared variable <x>")
	public void compilingCode_throwsUndeclaredVariableException_ifWritingUndefinedVariableIsUndefined() throws Exception{
		// execution
		compileAndRun("x = 5;");

				// evaluation performed by expected exception
	}
	
	@Test(expectedExceptions = VariableAlreadyDefinedException.class,
			expectedExceptionsMessageRegExp = "2:4 variable already defined: <x>")
	public void compilingCode_throwsVariableeAlreadyDefinedException_whenDefiningAlreadyDefinedVariable() throws Exception{
		// execution
		compileAndRun("int x;"+System.lineSeparator()+
					"int x;");

				// evaluation performed by expected exception
	}
	
	@DataProvider
	public Object[][] provide_code_exceptedText(){
		return new Object[][]{
				{"println(1+2);", "3"+System.lineSeparator()},
				{"println(1);", "1"+System.lineSeparator()},
				{"println(1+2+42);", "45"+System.lineSeparator()},
				{"println(1); println(2);",	"1"+System.lineSeparator()+ "2"+System.lineSeparator()},
				{"println(3-2);", "1"+System.lineSeparator()},
				{"println(2*3);", "6"+System.lineSeparator()},
				{"println(6/2);", "3"+System.lineSeparator()},
				{"println(7/2);", "3"+System.lineSeparator()},
				{"println(8/2*4);", "16"+System.lineSeparator()},
				{"println(2+3*3);", "11"+System.lineSeparator()},
				{"println(9-2*3);", "3"+System.lineSeparator()},
				{"println(8-2+5);", "11"+System.lineSeparator()},
				{"println(3/3*3);", "3"+System.lineSeparator()},
				{"println(3*3/3);", "3"+System.lineSeparator()},
				{"println(2*3-2);", "4"+System.lineSeparator()},
				{"println(2+5-6);", "1"+System.lineSeparator()},
				{"println(8/2*2);", "8"+System.lineSeparator()},
				{"println(8/(2*2));", "2"+System.lineSeparator()},
				{"println(4+4*2);", "12"+System.lineSeparator()},
				{"println((4+4)*2);", "16"+System.lineSeparator()},
				{"println(7%3);", "1"+System.lineSeparator()},
				{"println(10%3);", "1"+System.lineSeparator()},
				{"println(5%3);", "2"+System.lineSeparator()},
				
				{"int foo; foo=42; println(foo);", "42"+System.lineSeparator()},
				{"int foo; foo = 42; println(foo+2);", "44"+System.lineSeparator()},
				{"int a; int b; a = 2; b = 5; println(a+b);", "7"+System.lineSeparator()},				
				{"int foo=42; println(foo);", "42"+System.lineSeparator()},
				{"int foo = 42; println(foo+2);", "44"+System.lineSeparator()},
				{"int a; int b = 5; a = 2;a =5; println(a+b);", "10"+System.lineSeparator()},
				{"int randomNumber (){return 322;} \nprintln(randomNumber());", "322"+System.lineSeparator()},
				{"int randomNumber (){int a; a = 322;\nreturn a;}\nprintln(randomNumber());int a; a = 4;println(a);", "322"+System.lineSeparator()+"4"+System.lineSeparator()},
				{"int somar (int a,int b) {return a+b;}\nprintln(somar(111,211));","322"+System.lineSeparator()},
				{"int a = 161;int b = 161;println(b+a == b+a);", "1"+System.lineSeparator()}
		};
	}

	private String runJavaClass(Path dir, String className) throws Exception{
		Process process = Runtime.getRuntime().exec(new String[]{"java","-cp",dir.toString(), className});
		try(InputStream in = process.getInputStream()){
			return new Scanner(in).useDelimiter("\\A").next();
		}
	}
}
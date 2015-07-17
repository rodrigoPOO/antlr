package de.letsbuildacompiler.compiler;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.compiler.Bytecode.Instruction;





import de.letsbuildacompiler.parser.GramaticaLexer;
import de.letsbuildacompiler.parser.GramaticaParser;



public class Main {

	public static void main(String[] args) throws IOException {
		ANTLRInputStream input = new ANTLRFileStream("input.azjt");
		String result = compile(input);
		System.out.println(result);
		char[] r2c = result.toCharArray();
		try(OutputStreamWriter outWriter = new OutputStreamWriter(new FileOutputStream("result.j"),"utf-8")){
			outWriter.write(r2c);
			
		}
	}
	
	public static String compile(ANTLRInputStream input){
		GramaticaLexer lexer = new GramaticaLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		GramaticaParser parser = new GramaticaParser(token);
		
		ParseTree tree = parser.teste();
		MetodosDeclarados metodosDeclarados = DefinicaoMetodo.findMetodoDef(tree);				
		return createJasminFile(new MyVisitor(metodosDeclarados).visit(tree));
			
		
		
		
	}

	private static String createJasminFile(String instructions){
		return "\n.class public Gramatica\n" + 
				".super java/lang/Object\n" + 				
				instructions;
	}
}
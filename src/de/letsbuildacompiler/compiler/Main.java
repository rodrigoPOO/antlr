package de.letsbuildacompiler.compiler;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.compiler.Bytecode.Instruction;

import de.letsbuildacompiler.compiler.exceptions.ExcecaoCompilacao;
import de.letsbuildacompiler.parser.GramaticaLexer;
import de.letsbuildacompiler.parser.GramaticaParser;



public class Main {

	public static void main(String[] args) throws IOException {
		ANTLRInputStream input = new ANTLRFileStream("Texto.txt");
		System.out.println(compile(input));
	}
	
	public static String compile(ANTLRInputStream input){
		GramaticaLexer lexer = new GramaticaLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		GramaticaParser parser = new GramaticaParser(token);
		
		ParseTree tree = parser.teste();
		MyVisitor visitor = new MyVisitor();
		try {
			visitor.visit(tree);
			return createJasminFile(new MyVisitor().visit(tree));
			
		} catch (ExcecaoCompilacao e) {
			e.printStackTrace();
			
			
		}
		return "";
		
	}

	private static String createJasminFile(String instructions){
		return ".class public Gramatica\n" + 
				".super java/lang/Object\n" + 				
				instructions;
	}
}
package de.letsbuildacompiler.compiler.exceptions;
import org.antlr.v4.runtime.Token;


public class ExcecaoCompilacao extends RuntimeException{
	protected int linha;
	protected int coluna;
	
	public ExcecaoCompilacao(Token token) {
		linha = token.getLine();
		coluna = token.getCharPositionInLine();	
	}
	
}

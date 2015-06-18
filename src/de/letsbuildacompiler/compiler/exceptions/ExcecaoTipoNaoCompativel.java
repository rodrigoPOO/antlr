package de.letsbuildacompiler.compiler.exceptions;

import org.antlr.v4.runtime.Token;

public class ExcecaoTipoNaoCompativel extends RuntimeException{
	protected int linha;
	protected int coluna;
	protected String variavel,expressao;
	
	public ExcecaoTipoNaoCompativel(Token token,String exp) {
		linha = token.getLine();
		coluna = token.getCharPositionInLine();
		variavel = token.getText();
		expressao = exp;
	}
	
	@Override
	public String getMessage() {
		return linha + ":" + coluna + " variavel: <"+expressao+"> nao compativel com: <"+variavel+">";
	}
}

package de.letsbuildacompiler.compiler.exceptions;

import org.antlr.v4.runtime.Token;


public class ExcecaoTipoNaoCompativel extends RuntimeException{
	protected int linha,coluna;
	protected String operacao,token1,token2;
	
	public ExcecaoTipoNaoCompativel(String token1,String token2,Token op) {
		this.token1 = token1;
		this.token2 = token2;
		linha = op.getLine();
		coluna = op.getCharPositionInLine();
		operacao = op.getText();
	}
	
	@Override
	public String getMessage() {
		return linha + ":" + coluna + " token <"+token1+"> nao compativel com " +
	" token <"+token2+"> utilizando operador <"+operacao+">";
	}
}

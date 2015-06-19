package de.letsbuildacompiler.compiler.exceptions;

import org.antlr.v4.runtime.Token;

public class ExcecaoTipoRegra extends RuntimeException{
	protected int linha,coluna;
	protected String operacao,token,tipoExperado,tipoEncontrado;
	
	public ExcecaoTipoRegra(String identficador,Token op,String tipoExp, String tipoEnc) {
		token = identficador;
		linha = op.getLine();
		coluna = op.getCharPositionInLine();
		operacao = op.getText();
		tipoExperado = tipoExp;
		tipoEncontrado = tipoEnc;
	}
	
	@Override
	public String getMessage() {
		return linha + ":" + coluna + " erro ao atribuir variavel: <"+token+"> tipo não compativel, tipo experado: <"+
	tipoExperado+"> tipo econtrado: <"+tipoEncontrado+">";
	}
}

package de.letsbuildacompiler.compiler.exceptions;

import org.antlr.v4.runtime.Token;

public class ExcecaoVariavelJaDeclarada extends ExcecaoCompilacao{
private String nomeVar;
	
	public ExcecaoVariavelJaDeclarada(Token token) {
		super(token);
		nomeVar = token.getText();
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getMessage() {
		return linha+ ":" + coluna + " variable already defined: "+nomeVar;
	}
	

}

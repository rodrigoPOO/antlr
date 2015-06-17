package de.letsbuildacompiler.compiler.exceptions;

import org.antlr.v4.runtime.Token;

public class FunctionAlreadyDefinedException extends CompileException {
	private String funcName;
	
	public FunctionAlreadyDefinedException(Token varNameToken) {
		super(varNameToken);
		funcName = varNameToken.getText();
	}
	
	@Override
	public String getMessage() {
		return line + ":" + column + " Function is already defined  <" + funcName + ">";
	}
}

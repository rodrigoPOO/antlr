package de.letsbuildacompiler.compiler;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import de.letsbuildacompiler.compiler.exceptions.UndeclaredVariableException;
import de.letsbuildacompiler.compiler.exceptions.UndefinedFunction;
import de.letsbuildacompiler.compiler.exceptions.VariableAlreadyDefinedException;
import de.letsbuildacompiler.parser.GramaticaBaseVisitor;
import de.letsbuildacompiler.parser.GramaticaParser.AtribuicaoContext;
import de.letsbuildacompiler.parser.GramaticaParser.CarregarValorContext;
import de.letsbuildacompiler.parser.GramaticaParser.ComandoNormalContext;
//import de.letsbuildacompiler.parser.GramaticaParser.ComandoNormalContext;
import de.letsbuildacompiler.parser.GramaticaParser.DeclaracaoVariaveisContext;
import de.letsbuildacompiler.parser.GramaticaParser.DeclararEAtribuirContext;
import de.letsbuildacompiler.parser.GramaticaParser.DivisaoContext;
import de.letsbuildacompiler.parser.GramaticaParser.EquivalenteContext;
import de.letsbuildacompiler.parser.GramaticaParser.MetodcallContext;
//import de.letsbuildacompiler.parser.GramaticaParser.MetodcallContext;
import de.letsbuildacompiler.parser.GramaticaParser.MetoddeclContext;
import de.letsbuildacompiler.parser.GramaticaParser.ModuloContext;
import de.letsbuildacompiler.parser.GramaticaParser.MultiplicacaoContext;
import de.letsbuildacompiler.parser.GramaticaParser.NumeroInteiroContext;
import de.letsbuildacompiler.parser.GramaticaParser.PrintlnContext;
import de.letsbuildacompiler.parser.GramaticaParser.SomaContext;
import de.letsbuildacompiler.parser.GramaticaParser.SubtracaoContext;
import de.letsbuildacompiler.parser.GramaticaParser.TesteContext;

public class MyVisitor extends GramaticaBaseVisitor<String> {

	private Map<String, Integer> variables = new HashMap<>();
	private final Set<String> definedFunctions;
	private int i=0;
	
	public MyVisitor(Set<String> definedFuncitions) {
		if(definedFuncitions == null){
			this.definedFunctions = Collections.emptySet();
			
		}else{
			this.definedFunctions = definedFuncitions;
		}
	}
	@Override
	public String visitPrintln(PrintlnContext ctx) {
		return "	getstatic java/lang/System/out Ljava/io/PrintStream;\n"
				+ visit(ctx.argument) + "\n"
				+ "	invokevirtual java/io/PrintStream/println(I)V\n";
	}
	///////////////////////////////////Vardecl///////////////////////////////////////
	/*Tratado declaracao de variaveis ja existentes*/
	@Override
	public String visitDeclaracaoVariaveis(DeclaracaoVariaveisContext ctx) {
		if(variables.containsKey(ctx.nomeVariavel.getText())){
			throw new VariableAlreadyDefinedException(ctx.nomeVariavel);
		}
		variables.put(ctx.nomeVariavel.getText(), variables.size());
		return "";
	}
	///////////////////////////////////vardeclatrib///////////////////////////////////////
	/*Tratado declaracao de variaveis ja existentes
	 *Tratado atribuicao de variaveis nao declaradas*/
	@Override
	public String visitDeclararEAtribuir(DeclararEAtribuirContext ctx) {
		if(variables.containsKey(ctx.variavel.getText())){
			throw new VariableAlreadyDefinedException(ctx.variavel);
		}
		variables.put(ctx.variavel.getText(), variables.size());
		return visit(ctx.valor) + "\n" + "istore "
				+ requireVariableIndex(ctx.variavel);
	}
	/////////////////////////////////Atrib/////////////////////////////////////////
	/*Tratado atribuicao de variaveis nao declaradas*/
	@Override
	public String visitAtribuicao(AtribuicaoContext ctx) {
		return visit(ctx.expr) + "\n" + "istore "
				+ requireVariableIndex(ctx.variavel);
	}
	/////////////////////////////////////lvalue///////////////////////////////////////
	/*Tratado leitura de variaveis nao declaradas*/
	@Override
	public String visitCarregarValor(CarregarValorContext ctx) {
		return "iload "+requireVariableIndex(ctx.identificador);
	}


	////////////////////////////////////////expressao///////////////////////////////////////
	@Override
	public String visitEquivalente(EquivalenteContext ctx) {
		i = i+2;
		return visitChildren(ctx)+"\n"
								 +"isub"+"\n"
								 +"ifeq "+"Label"+(i-2)+"\n"//if topo igual 0 va para label true
								 //Label false
								 +"ldc 0"+"\n"
								 +"goto Label"+(i-1)+"\n"
								 //Label true
								 +"Label"+(i-2)+":\n"
								 +"ldc 1"+"\n"
								 //label Exit
								 +"Label"+(i-1)+":\n"
								 ;
	}
	// //////////////////////////////////////term///////////////////////////////////////////
	@Override
	public String visitDivisao(DivisaoContext ctx) {
		return visitChildren(ctx) + "\n" + "idiv";
	}

	@Override
	public String visitMultiplicacao(MultiplicacaoContext ctx) {
		return visitChildren(ctx) + "\n" + "imul";
	}

	@Override
	public String visitModulo(ModuloContext ctx) {
		return visitChildren(ctx) + "\n" + "irem";
	}

	@Override
	public String visitSubtracao(SubtracaoContext ctx) {
		return visitChildren(ctx) + "\n" + "isub";
	}

	@Override
	public String visitSoma(SomaContext ctx) {
		return visitChildren(ctx) + "\n" + "iadd";
	}

	// //////////////////////////////////////factor///////////////////////////////////////////
	@Override
	public String visitNumeroInteiro(NumeroInteiroContext ctx) {
		return "ldc " + ctx.numero.getText();
	}

	// ///////////////////////////////////////////////////////////////////////////////////////

	private int requireVariableIndex(Token varNameToken){
		Integer varIndex = variables.get(varNameToken.getText());
		if(varIndex == null){
			throw new UndeclaredVariableException(varNameToken);
		}
		return varIndex;
	}
	
	@Override
	protected String aggregateResult(String aggregate, String nextResult) {
		if (aggregate == null) {
			return nextResult;
		}
		if (nextResult == null) {
			return aggregate;
		}
		return aggregate + "\n" + nextResult;
	}
	@Override
	public String visitMetoddecl(MetoddeclContext ctx) {
		Map<String, Integer> alocatedVariables = variables;
		variables = new HashMap<>();
		
		visit(ctx.parametros);
		String comandos = visit(ctx.comandos());
		int numeroParam = ctx.parametros.decl.size();
		
		
		String resultado= ".method public static "+ctx.nomeMetodo.getText()+"(";
				resultado+=  stringRepeat("I", numeroParam);
		resultado += ")I\n" +		
				"	.limit stack 100\n" + 
				"	.limit locals 100\n" +
				(comandos == null ? "" : comandos +"\n")+				
				visit(ctx.expressao()) + "\n" +  
				"	ireturn\n" +				 
				".end method";
		variables = alocatedVariables;
		return resultado;
		
		
	}
	@Override
	public String visitMetodcall(MetodcallContext ctx) {
		if(!definedFunctions.contains(ctx.nomeMetodo.getText())){
			throw new UndefinedFunction(ctx.nomeMetodo);
		}
		String args = visit(ctx.args);
		String instrucoes = "";
		if(args != null){
			instrucoes += args + "\n"; 
		}
		
		instrucoes +=  "invokestatic Gramatica/"+ctx.nomeMetodo.getText()+"(";
		int numeroArg = ctx.args.exp.size();
		instrucoes += stringRepeat("I", numeroArg);
		instrucoes += ")I\n";
		return instrucoes;

	}
	
	@Override
	public String visitTeste(TesteContext ctx) {
		String comandosClasse = "";
		String instrucoes = "";
		String metodo = "";
		for(int i = 0; i < ctx.getChildCount();i++){
			ParseTree child = ctx.getChild(i);
			instrucoes = visit(child);
			if(child instanceof ComandoNormalContext){
				comandosClasse += instrucoes + "\n";
			}else{
				metodo += instrucoes + "\n";
			}
			
		}
		return metodo + "\n" +
		".method public static main([Ljava/lang/String;)V\n" + 
		"  .limit stack 100\n" + 
		"  .limit locals 100\n" + 
		"  \n" + 
		 comandosClasse + "\n" + 
		"  return\n" + 
		"  \n" + 
		".end method";

	}
	public String stringRepeat(String param, int cont){
		StringBuilder resultado = new StringBuilder();
		for(int i = 0; i < cont; i++){
			resultado.append(param);
		}
		return resultado.toString();
		
	}
	
}
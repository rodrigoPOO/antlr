package de.letsbuildacompiler.compiler;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import de.letsbuildacompiler.compiler.exceptions.ExcecaoTipoNaoCompativel;
import de.letsbuildacompiler.compiler.exceptions.ExcecaoTipoRegra;
import de.letsbuildacompiler.compiler.exceptions.UndeclaredVariableException;
import de.letsbuildacompiler.compiler.exceptions.UndefinedFunction;
import de.letsbuildacompiler.compiler.exceptions.VariableAlreadyDefinedException;
import de.letsbuildacompiler.parser.GramaticaBaseVisitor;
import de.letsbuildacompiler.parser.GramaticaParser.AtribuicaoContext;
import de.letsbuildacompiler.parser.GramaticaParser.CarregarValorContext;
import de.letsbuildacompiler.parser.GramaticaParser.ComandoNormalContext;
import de.letsbuildacompiler.parser.GramaticaParser.DeclaracaoVariaveisContext;
import de.letsbuildacompiler.parser.GramaticaParser.DeclararEAtribuirContext;
import de.letsbuildacompiler.parser.GramaticaParser.DiferenteContext;
import de.letsbuildacompiler.parser.GramaticaParser.DivisaoContext;
import de.letsbuildacompiler.parser.GramaticaParser.EquivalenteContext;
import de.letsbuildacompiler.parser.GramaticaParser.IfCompletoContext;
import de.letsbuildacompiler.parser.GramaticaParser.IfIncompletoContext;
import de.letsbuildacompiler.parser.GramaticaParser.MaiorContext;
import de.letsbuildacompiler.parser.GramaticaParser.MaiorOuEquivalenteContext;
import de.letsbuildacompiler.parser.GramaticaParser.MenorContext;
import de.letsbuildacompiler.parser.GramaticaParser.MenorOuEquivalenteContext;
import de.letsbuildacompiler.parser.GramaticaParser.MetodcallContext;
import de.letsbuildacompiler.parser.GramaticaParser.MetoddeclContext;
import de.letsbuildacompiler.parser.GramaticaParser.ModuloContext;
import de.letsbuildacompiler.parser.GramaticaParser.MultiplicacaoContext;
import de.letsbuildacompiler.parser.GramaticaParser.NumeroInteiroContext;
import de.letsbuildacompiler.parser.GramaticaParser.NumeroRealContext;
import de.letsbuildacompiler.parser.GramaticaParser.PrintlnContext;
import de.letsbuildacompiler.parser.GramaticaParser.SomaContext;
import de.letsbuildacompiler.parser.GramaticaParser.SubtracaoContext;
import de.letsbuildacompiler.parser.GramaticaParser.TesteContext;
import de.letsbuildacompiler.parser.GramaticaParser.WhilestatementContext;

public class MyVisitor extends GramaticaBaseVisitor<String> {

	private Map<String, Integer> variables = new HashMap<>();
	private Map<String, String> tiposDeclarados = new HashMap<>();
	private Stack<String> pilhaTipos = new Stack<String>();
	private final MetodosDeclarados metodosDeclarados;
	private static Map<String, String> mapaOperacoes;
	private int i = 0;

	public MyVisitor(MetodosDeclarados metodosDeclarados) {
		if (metodosDeclarados == null) {
			throw new NullPointerException("eRRRRRo");
		}
		this.metodosDeclarados = metodosDeclarados;
		/*
		 * int f null string boolean + - * \/ %
		 * Operacoes em comentario sao operacoes perigosas melhor deixar desativado
		 */
		mapaOperacoes = new HashMap<>();
		mapaOperacoes.put("int-int", "int");
		mapaOperacoes.put("int+int", "int");
		mapaOperacoes.put("int*int", "int");
		mapaOperacoes.put("int/int", "int");
		mapaOperacoes.put("int%int", "int");

		mapaOperacoes.put("double-double", "double");
		mapaOperacoes.put("double+double", "double");
		mapaOperacoes.put("double*double", "double");
		mapaOperacoes.put("double/double", "double");
		mapaOperacoes.put("double%double", "double");

		mapaOperacoes.put("int-double", "double");
		mapaOperacoes.put("int+double", "double");
		mapaOperacoes.put("int*double", "double");
		//mapaOperacoes.put("int/double", "double");
		//mapaOperacoes.put("int%double", "double");

		mapaOperacoes.put("double-int", "double");
		mapaOperacoes.put("double+int", "double");
		mapaOperacoes.put("double*int", "double");
		mapaOperacoes.put("double/int", "double");
		//mapaOperacoes.put("double%int", "double");
		
		mapaOperacoes.put("int==int", "int");
		mapaOperacoes.put("int!=int", "int");
		mapaOperacoes.put("int>int", "int");
		mapaOperacoes.put("int<int", "int");
		mapaOperacoes.put("int>=int", "int");
		mapaOperacoes.put("int<=int", "int");

		mapaOperacoes.put("double==double", "double");
		mapaOperacoes.put("double!=double", "double");
		mapaOperacoes.put("double>double", "double");
		mapaOperacoes.put("double<double", "double");
		mapaOperacoes.put("double>=double", "double");
		mapaOperacoes.put("double<=double", "double");
		
		mapaOperacoes.put("int==double", "double");
		mapaOperacoes.put("int!=double", "double");
		mapaOperacoes.put("int>double", "double");
		mapaOperacoes.put("int<double", "double");
		mapaOperacoes.put("int>=double", "double");
		mapaOperacoes.put("int<=double", "double");
		
		mapaOperacoes.put("double==int", "double");
		mapaOperacoes.put("double!=int", "double");
		mapaOperacoes.put("double>int", "double");
		mapaOperacoes.put("double<int", "double");
		mapaOperacoes.put("double>=int", "double");
		mapaOperacoes.put("double<=int", "double");
		
		mapaOperacoes.put("doublecomparedouble", "double");
		mapaOperacoes.put("intcomparedouble", "double");
		mapaOperacoes.put("doublecompareint", "double");

		mapaOperacoes.put("string-string", "string");
		mapaOperacoes.put("string+string", "string");
	}

	@Override
	public String visitPrintln(PrintlnContext ctx) {
		String retorno = "	getstatic java/lang/System/out Ljava/io/PrintStream;\n"
				+ visit(ctx.argument) + "\n";
		String tipo = pilhaTipos.pop(); 
		if (tipo.equals("int")) {
			//System.out.println("\n"+pilhaTipos);
			retorno = retorno
					+ "	invokevirtual java/io/PrintStream/println(I)V\n";
		} else if (tipo.equals("double")) {
			//System.out.println("\n"+pilhaTipos);
			retorno = retorno
					+ "	invokevirtual java/io/PrintStream/println(D)V\n";
		}
		System.out.println("\n"+pilhaTipos);
		return retorno;
	}

	// /////////////////////////////////Vardecl///////////////////////////////////////
	/* Tratado declaracao de variaveis ja existentes */
	@Override
	public String visitDeclaracaoVariaveis(DeclaracaoVariaveisContext ctx) {
		if (variables.containsKey(ctx.nomeVariavel.getText())) {
			throw new VariableAlreadyDefinedException(ctx.nomeVariavel);
		}
		variables.put(ctx.nomeVariavel.getText(), variables.size());
		tiposDeclarados.put(ctx.nomeVariavel.getText(), ctx.tipo.getText());
		return "";
	}

	// /////////////////////////////////vardeclatrib///////////////////////////////////////
	/*
	 * Tratado declaracao de variaveis ja existentesTratado atribuicao de
	 * variaveis nao declaradas
	 */
	@Override
	public String visitDeclararEAtribuir(DeclararEAtribuirContext ctx) {
		String retorno;
		if (variables.containsKey(ctx.variavel.getText())) {
			throw new VariableAlreadyDefinedException(ctx.variavel);
		}
		retorno = visit(ctx.valor);
		String tipoEncontrado = pilhaTipos.pop();
		if (!ctx.tipo.getText().equals(tipoEncontrado)) {
			throw new ExcecaoTipoRegra(ctx.variavel.getText(), ctx.operacao,
					ctx.tipo.getText(), tipoEncontrado);
		}
		variables.put(ctx.variavel.getText(), variables.size());
		tiposDeclarados.put(ctx.variavel.getText(), ctx.tipo.getText());
		retorno = retorno + "\n" + "istore " + requireVariableIndex(ctx.variavel);
		return retorno;
	}

	// ///////////////////////////////Atrib/////////////////////////////////////////
	/* Tratado atribuicao de variaveis nao declaradas */
	@Override
	public String visitAtribuicao(AtribuicaoContext ctx) {
		String retorno = visit(ctx.expr) + "\n" + "istore " + requireVariableIndex(ctx.variavel);
		pilhaTipos.pop();//talves isso gere bugs no futuro
		return retorno;
	}

	// ///////////////////////////////////lvalue///////////////////////////////////////
	/* Tratado leitura de variaveis nao declaradas */
	@Override
	public String visitCarregarValor(CarregarValorContext ctx) {
		pilhaTipos.push(tiposDeclarados.get(ctx.identificador.getText()));
		return "iload " + requireVariableIndex(ctx.identificador);
	}

	// //////////////////////////////////////expressao///////////////////////////////////////
	
		@Override
		public String visitMenor(MenorContext ctx) {
			i = i + 2;
			int temp = i;
			String retorno = visitChildren(ctx);
			retorno = retorno + verificarOperacao(ctx.esquerda.getText(), ctx.direita.getText(), ctx.operacao);
			if (pilhaTipos.peek().equals("int")) {
				pilhaTipos.pop();
				pilhaTipos.pop();
				pilhaTipos.push("int");
				return retorno + "\n" + "if_icmplt " + "Label"
						+ (temp - 2) + "\n"// if topo igual 0 va para label true
						// Label false
						+ "ldc 0" + "\n" + "goto Label" + (temp - 1) + "\n"
						// Label true
						+ "Label" + (temp - 2) + ":\n" + "ldc 1" + "\n"
						// label Exit
						+ "Label" + (temp - 1) + ":\n";
			}else{
				pilhaTipos.pop();
				pilhaTipos.pop();
				pilhaTipos.push("int");
				return retorno + "\n" + "dcmpg" + "\n" + "iflt " + "Label"
						+ (temp - 2) + "\n"// if topo igual 0 va para label true
						// Label false
						+ "ldc 1" + "\n" + "goto Label" + (temp - 1) + "\n"
						// Label true
						+ "Label" + (temp - 2) + ":\n" + "ldc 0" + "\n"
						// label Exit
						+ "Label" + (temp - 1) + ":\n";
			}
		}
		
		@Override
		public String visitMaior(MaiorContext ctx) {
			i = i + 2;
			int temp = i;
			String retorno = visitChildren(ctx);
			retorno = retorno + verificarOperacao(ctx.esquerda.getText(), ctx.direita.getText(), ctx.operacao);
			if (pilhaTipos.peek().equals("int")) {
				pilhaTipos.pop();
				pilhaTipos.pop();
				pilhaTipos.push("int");
				return retorno + "\n" + "if_icmpgt " + "Label"
						+ (temp - 2) + "\n"// if topo igual 0 va para label true
						// Label false
						+ "ldc 0" + "\n" + "goto Label" + (temp - 1) + "\n"
						// Label true
						+ "Label" + (temp - 2) + ":\n" + "ldc 1" + "\n"
						// label Exit
						+ "Label" + (temp - 1) + ":\n";
			}else{
				pilhaTipos.pop();
				pilhaTipos.pop();
				pilhaTipos.push("int");
				return retorno + "\n" + "dcmpg" + "\n" + "ifgt " + "Label"
						+ (temp - 2) + "\n"// if topo igual 0 va para label true
						// Label false
						+ "ldc 0" + "\n" + "goto Label" + (temp - 1) + "\n"
						// Label true
						+ "Label" + (temp - 2) + ":\n" + "ldc 1" + "\n"
						// label Exit
						+ "Label" + (temp - 1) + ":\n";
			}
		}
		
		@Override
		public String visitMenorOuEquivalente(MenorOuEquivalenteContext ctx) {
			i = i + 2;
			int temp = i;
			String retorno = visitChildren(ctx);
			retorno = retorno + verificarOperacao(ctx.esquerda.getText(), ctx.direita.getText(), ctx.operacao);
			if (pilhaTipos.peek().equals("int")) {
				pilhaTipos.pop();
				pilhaTipos.pop();
				pilhaTipos.push("int");
				return retorno + "\n" + "if_icmple " + "Label"
						+ (temp - 2) + "\n"// if topo igual 0 va para label true
						// Label false
						+ "ldc 0" + "\n" + "goto Label" + (temp - 1) + "\n"
						// Label true
						+ "Label" + (temp - 2) + ":\n" + "ldc 1" + "\n"
						// label Exit
						+ "Label" + (temp - 1) + ":\n";
			}else{
				pilhaTipos.pop();
				pilhaTipos.pop();
				pilhaTipos.push("int");
				return retorno + "\n" + "dcmpg" + "\n" + "ifle " + "Label"
						+ (temp - 2) + "\n"// if topo igual 0 va para label true
						// Label false
						+ "ldc 0" + "\n" + "goto Label" + (temp - 1) + "\n"
						// Label true
						+ "Label" + (temp - 2) + ":\n" + "ldc 1" + "\n"
						// label Exit
						+ "Label" + (temp - 1) + ":\n";
			}
		}
		
		@Override
		public String visitMaiorOuEquivalente(MaiorOuEquivalenteContext ctx) {
			i = i + 2;
			int temp = i;
			String retorno = visitChildren(ctx);
			retorno = retorno + verificarOperacao(ctx.esquerda.getText(), ctx.direita.getText(), ctx.operacao);
			if (pilhaTipos.peek().equals("int")) {
				pilhaTipos.pop();
				pilhaTipos.pop();
				pilhaTipos.push("int");
				return retorno + "\n" + "if_icmpge " + "Label"
						+ (temp - 2) + "\n"// if topo igual 0 va para label true
						// Label false
						+ "ldc 0" + "\n" + "goto Label" + (temp - 1) + "\n"
						// Label true
						+ "Label" + (temp - 2) + ":\n" + "ldc 1" + "\n"
						// label Exit
						+ "Label" + (temp - 1) + ":\n";
			}else{
				pilhaTipos.pop();
				pilhaTipos.pop();
				pilhaTipos.push("int");
				return retorno + "\n" + "dcmpg" + "\n" + "ifge " + "Label"
						+ (temp - 2) + "\n"// if topo igual 0 va para label true
						// Label false
						+ "ldc 0" + "\n" + "goto Label" + (temp - 1) + "\n"
						// Label true
						+ "Label" + (temp - 2) + ":\n" + "ldc 1" + "\n"
						// label Exit
						+ "Label" + (temp - 1) + ":\n";
			}
		}
		
		@Override
		public String visitEquivalente(EquivalenteContext ctx) {
			i = i + 2;
			int temp = i;
			String retorno = visitChildren(ctx);
			retorno = retorno + verificarOperacao(ctx.esquerda.getText(), ctx.direita.getText(), ctx.operacao);
			if (pilhaTipos.peek().equals("int")) {
				pilhaTipos.pop();
				pilhaTipos.pop();
				pilhaTipos.push("int");
				return retorno + "\n" + "if_icmpeq " + "Label"
						+ (temp - 2) + "\n"// if topo igual 0 va para label true
						// Label false
						+ "ldc 0" + "\n" + "goto Label" + (temp - 1) + "\n"
						// Label true
						+ "Label" + (temp - 2) + ":\n" + "ldc 1" + "\n"
						// label Exit
						+ "Label" + (temp - 1) + ":\n";
			}else{
				pilhaTipos.pop();
				pilhaTipos.pop();
				pilhaTipos.push("int");
				return retorno + "\n" + "dcmpg" + "\n" + "ifeq " + "Label"
						+ (temp - 2) + "\n"// if topo igual 0 va para label true
						// Label false
						+ "ldc 0" + "\n" + "goto Label" + (temp - 1) + "\n"
						// Label true
						+ "Label" + (temp - 2) + ":\n" + "ldc 1" + "\n"
						// label Exit
						+ "Label" + (temp - 1) + ":\n";
			}
		}
		
		@Override
		public String visitDiferente(DiferenteContext ctx) {
			i = i + 2;
			int temp = i;
			String retorno = visitChildren(ctx);
			retorno = retorno + verificarOperacao(ctx.esquerda.getText(), ctx.direita.getText(), ctx.operacao);
			if (pilhaTipos.peek().equals("int")) {
				pilhaTipos.pop();
				pilhaTipos.pop();
				pilhaTipos.push("int");
				return retorno + "\n" + "if_icmpne " + "Label"
						+ (temp - 2) + "\n"// if topo igual 0 va para label true
						// Label false
						+ "ldc 0" + "\n" + "goto Label" + (temp - 1) + "\n"
						// Label true
						+ "Label" + (temp - 2) + ":\n" + "ldc 1" + "\n"
						// label Exit
						+ "Label" + (temp - 1) + ":\n";
			}else{
				pilhaTipos.pop();
				pilhaTipos.pop();
				pilhaTipos.push("int");
				return retorno + "\n" + "dcmpg" + "\n" + "ifeq " + "Label"
						+ (temp - 2) + "\n"// if topo igual 0 va para label true
						// Label false
						+ "ldc 1" + "\n" + "goto Label" + (temp - 1) + "\n"
						// Label true
						+ "Label" + (temp - 2) + ":\n" + "ldc 0" + "\n"
						// label Exit
						+ "Label" + (temp - 1) + ":\n";
			}
		}
		
	//////////////////////////////////////////IF///////////////////////////////////////////
		
	@Override
	public String visitIfIncompleto(IfIncompletoContext ctx){
		i = i + 1;
		int temp = i;
		String retorno = visit(ctx.expressao());
		if (!pilhaTipos.peek().equals("int")) {
			System.out.println("Erro: Instrucoes de desvio verificam apenas condicoes booleanas,"
					+ " e a pilha de tipos nao esta indicando valor booleano.");
		}
		pilhaTipos.pop();
		retorno = "ifeq " + "Label"	+ (temp - 1) + "\n";
		for(int j=0;j<ctx.statement().size();j++)
			retorno = retorno + visit(ctx.statement(j)) + "\n";
		retorno = retorno + "Label" + (temp - 1) + ":\n";
		return retorno;
	}
	
	@Override
	public String visitIfCompleto(IfCompletoContext ctx) {
		i = i + 2;
		int temp = i;
		String retorno = visit(ctx.expressao());
		if (!pilhaTipos.peek().equals("int")) {
			System.out.println("Erro: Instrucoes de desvio verificam apenas condicoes booleanas,"
					+ " e a pilha de tipos nao esta indicando valor booleano.");
		}
		pilhaTipos.pop();
		retorno = retorno + "ifeq " + "Label"	+ (temp - 2) + "\n";
		for(int j=0;j<ctx.statement().size();j++)
			retorno = retorno + visit(ctx.statement(j)) + "\n";
		retorno = retorno + "goto Label" + (temp - 1) + "\n";
		retorno = retorno + "Label" + (temp - 2) + ":\n";//else
		for(int j=0;j<ctx.gambi().size();j++)
			retorno = retorno + visit(ctx.gambi(j)) + "\n";
		retorno = retorno + "Label" + (temp - 1) + ":\n";//exit
		return retorno;
	}
	////////////////////////////////////////while///////////////////////////////////////////
	
	@Override
	public String visitWhilestatement(WhilestatementContext ctx) {
		i = i + 2;
		int temp = i;
		String retorno = "StartWhile"+(i-2)+":\n";
		retorno = retorno + visit(ctx.expressao()) + "\n";
		if (!pilhaTipos.peek().equals("int")) {
			System.out.println("Erro: Instrucoes de desvio verificam apenas condicoes booleanas,"
					+ " e a pilha de tipos nao esta indicando valor booleano.");
		}
		pilhaTipos.pop();
		retorno = retorno + "ifeq " + "ExitWhile"	+ (temp - 1) + "\n";
		for(int j=0;j<ctx.statement().size();j++)
			retorno = retorno + visit(ctx.statement(j)) + "\n";
		retorno = retorno + "goto StartWhile" + (temp - 2) + "\n";
		retorno = retorno + "ExitWhile" + (temp - 1) + ":\n";//exit
		return retorno;
	}
	

	// //////////////////////////////////////term///////////////////////////////////////////
	
	@Override
	public String visitDivisao(DivisaoContext ctx) {
		String retorno = visitChildren(ctx);
		retorno = retorno + verificarOperacao(ctx.esquerda.getText(), ctx.direita.getText(), ctx.operacao);
		String tipo = pilhaTipos.pop();
		if (tipo.equals("int")) {
			retorno = retorno + "\n" + "idiv";
		} else if (tipo.equals("double")) {
			retorno = retorno + "\n" + "ddiv";
		}
		return retorno;
	}

	@Override
	public String visitMultiplicacao(MultiplicacaoContext ctx) {
		String retorno = visitChildren(ctx);
		retorno = retorno + verificarOperacao(ctx.esquerda.getText(), ctx.direita.getText(), ctx.operacao);
		String tipo = pilhaTipos.pop();
		if (tipo.equals("int")) {
			retorno = retorno + "\n" + "imul";
		} else if (tipo.equals("double")) {
			retorno = retorno + "\n" + "dmul";
		}
		return retorno;
	}

	@Override
	public String visitModulo(ModuloContext ctx) {
		String retorno = visitChildren(ctx);
		retorno = retorno + verificarOperacao(ctx.esquerda.getText(), ctx.direita.getText(), ctx.operacao);
		String tipo = pilhaTipos.pop();
		if (tipo.equals("int")) {
			retorno = retorno + "\n" + "irem";
		} else if (tipo.equals("double")) {
			retorno = retorno + "\n" + "drem";
		}
		return retorno;
	}

	@Override
	public String visitSubtracao(SubtracaoContext ctx) {
		String retorno = visitChildren(ctx);
		retorno = retorno + verificarOperacao(ctx.esquerda.getText(), ctx.direita.getText(), ctx.operacao);
		String tipo = pilhaTipos.pop();
		if (tipo.equals("int")) {
			retorno = retorno + "\n" + "isub";
		} else if (tipo.equals("double")) {
			retorno = retorno + "\n" + "dsub";
		}
		return retorno;
	}

	@Override
	public String visitSoma(SomaContext ctx) {
		String retorno = visitChildren(ctx);
		retorno = retorno + verificarOperacao(ctx.esquerda.getText(), ctx.direita.getText(), ctx.operacao);
		String tipo = pilhaTipos.pop();
		if (tipo.equals("int")) {
			retorno = retorno + "\n" + "iadd";
		} else if (tipo.equals("double")) {
			retorno = retorno + "\n" + "dadd";
		}
		return retorno;
	}

	// //////////////////////////////////////factor///////////////////////////////////////////
	@Override
	public String visitNumeroInteiro(NumeroInteiroContext ctx) {
		pilhaTipos.push("int");
		return "ldc " + ctx.numero.getText();
	}

	@Override
	public String visitNumeroReal(NumeroRealContext ctx) {
		pilhaTipos.push("double");
		return "ldc2_w " + ctx.numero.getText();
	}

	// ///////////////////////////////////////////////////////////////////////////////////////

	private int requireVariableIndex(Token varNameToken) {
		Integer varIndex = variables.get(varNameToken.getText());
		if (varIndex == null) {
			throw new UndeclaredVariableException(varNameToken);
		}
		return varIndex;
	}

	// verificar se os tipos são os mesmos caso contrario converta-se
	// possivel(somente se houver mapeamento)
	public String verificarOperacao(String token1, String token2, Token operacao) {
		// verificar se ha mapeamento
		String direita = pilhaTipos.pop();
		String esquerda = pilhaTipos.peek();
		pilhaTipos.push(direita);
		String resultadoOP = mapaOperacoes.get(esquerda + operacao.getText() + direita);
		String retorno = "";
		if (resultadoOP == null) {
			throw new ExcecaoTipoNaoCompativel(token1, token2, operacao);
		}
		// executar conversao caso tipos sejam diferentes
		if (!esquerda.equals(direita)) {
			// converter esquerda para o mesmo tipo da direita
			if (resultadoOP.equals(direita)) {
				
				//convert int to double
				if(esquerda.equalsIgnoreCase("int")&&resultadoOP.equals("double")){
					retorno = "\n"+"dup2_x1"+"\n"+"pop2"+"\n"+"i2d";
					direita = pilhaTipos.pop();
					pilhaTipos.pop();
					pilhaTipos.push(resultadoOP);
					pilhaTipos.push(direita);
				}

				
			// converter direita para o mesmo tipo da esquerda
			} else {
				
				//convert int to double
				if(direita.equalsIgnoreCase("int")&&resultadoOP.equals("double")){
					retorno = "\n"+"i2d";
					pilhaTipos.pop();
					pilhaTipos.push(resultadoOP);
				}
			}
		}
		return retorno;
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

		visit(ctx.parametros); // usado para evitar que excecao de variaveis nao
								// declaradas ocorram.
		String comandos = visit(ctx.comandos());
		int numeroParam = ctx.parametros.decl.size();

		String resultado = ".method public static " + ctx.nomeMetodo.getText()
				+ "(";
		resultado += stringRepeat("I", numeroParam);
		resultado += ")I\n" + "	.limit stack 100\n" + "	.limit locals 100\n"
				+ (comandos == null ? "" : comandos + "\n")
				+ visit(ctx.expressao()) + "\n" + "	ireturn\n" + ".end method";
		variables = alocatedVariables;
		return resultado;

	}

	@Override
	public String visitMetodcall(MetodcallContext ctx) {
		int numeroArg = ctx.args.exp.size();
		if (!metodosDeclarados.contains(ctx.nomeMetodo.getText(), numeroArg)) {
			throw new UndefinedFunction(ctx.nomeMetodo);
		}
		String args = visit(ctx.args);
		String instrucoes = "";
		if (args != null) {
			instrucoes += args + "\n";
		}

		instrucoes += "invokestatic Gramatica/" + ctx.nomeMetodo.getText() + "(";

		instrucoes += stringRepeat("I", numeroArg);
		instrucoes += ")I\n";
		return instrucoes;

	}

	// diferencia comandos de declaracoes de metodo;
	@Override
	public String visitTeste(TesteContext ctx) {
		String comandosClasse = "";
		String instrucoes = "";
		String metodo = "";
		for (int i = 0; i < ctx.getChildCount(); i++) {
			ParseTree child = ctx.getChild(i);
			instrucoes = visit(child);
			if (child instanceof ComandoNormalContext) {
				comandosClasse += instrucoes + "\n";
			} else {
				metodo += instrucoes + "\n";
			}

		}
		return metodo + "\n"
				+ ".method public static main([Ljava/lang/String;)V\n"
				+ "  .limit stack 100\n" + "  .limit locals 100\n" + "  \n"
				+ comandosClasse + "\n" + "  return\n" + "  \n" + ".end method";

	}

	// usado para "concatenar" parametros na hora de gerar o codigo de maquina.
	public String stringRepeat(String param, int cont) {
		StringBuilder resultado = new StringBuilder();
		for (int i = 0; i < cont; i++) {
			resultado.append(param);
		}
		return resultado.toString();
	}
}
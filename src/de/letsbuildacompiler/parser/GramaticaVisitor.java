// Generated from Gramatica.g4 by ANTLR 4.5
package de.letsbuildacompiler.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#teste}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTeste(GramaticaParser.TesteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comandoNormal}
	 * labeled alternative in {@link GramaticaParser#programDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoNormal(GramaticaParser.ComandoNormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoDecl}
	 * labeled alternative in {@link GramaticaParser#programDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoDecl(GramaticaParser.MetodoDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GramaticaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(GramaticaParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#classe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasse(GramaticaParser.ClasseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declclasse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclclasse(GramaticaParser.DeclclasseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#escopoclasse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscopoclasse(GramaticaParser.EscopoclasseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclaracaoVariaveis}
	 * labeled alternative in {@link GramaticaParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoVariaveis(GramaticaParser.DeclaracaoVariaveisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclararEAtribuir}
	 * labeled alternative in {@link GramaticaParser#vardeclatrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararEAtribuir(GramaticaParser.DeclararEAtribuirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atribuicao}
	 * labeled alternative in {@link GramaticaParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CarregarValor}
	 * labeled alternative in {@link GramaticaParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCarregarValor(GramaticaParser.CarregarValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#inicializarArranjo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializarArranjo(GramaticaParser.InicializarArranjoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#metoddecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetoddecl(GramaticaParser.MetoddeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#escopometodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscopometodo(GramaticaParser.EscopometodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(GramaticaParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#listaargumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaargumento(GramaticaParser.ListaargumentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(GramaticaParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Numexpr}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumexpr(GramaticaParser.NumexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Menor}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenor(GramaticaParser.MenorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Maior}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaior(GramaticaParser.MaiorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MenorOuEquivalente}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorOuEquivalente(GramaticaParser.MenorOuEquivalenteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MaiorOuEquivalente}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaiorOuEquivalente(GramaticaParser.MaiorOuEquivalenteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equivalente}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquivalente(GramaticaParser.EquivalenteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Diferente}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiferente(GramaticaParser.DiferenteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChamarMetodo}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamarMetodo(GramaticaParser.ChamarMetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#metodcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodcall(GramaticaParser.MetodcallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplicacao}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacao(GramaticaParser.MultiplicacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fator}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(GramaticaParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtracao}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtracao(GramaticaParser.SubtracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Soma}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoma(GramaticaParser.SomaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Divisao}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisao(GramaticaParser.DivisaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(GramaticaParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumeroInteiro}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroInteiro(GramaticaParser.NumeroInteiroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumeroReal}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroReal(GramaticaParser.NumeroRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(GramaticaParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChamarLvalue}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamarLvalue(GramaticaParser.ChamarLvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(GramaticaParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(GramaticaParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(GramaticaParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#forstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstatement(GramaticaParser.ForstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#whilestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestatement(GramaticaParser.WhilestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#listacomandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListacomandos(GramaticaParser.ListacomandosContext ctx);
}
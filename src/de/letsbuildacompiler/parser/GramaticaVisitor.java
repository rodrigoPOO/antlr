// Generated from Gramatica.g4 by ANTLR 4.4
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
	T visitTeste(@NotNull GramaticaParser.TesteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChamarMetodo}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamarMetodo(@NotNull GramaticaParser.ChamarMetodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comandoNormal}
	 * labeled alternative in {@link GramaticaParser#programDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoNormal(@NotNull GramaticaParser.ComandoNormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(@NotNull GramaticaParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#whilestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestatement(@NotNull GramaticaParser.WhilestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(@NotNull GramaticaParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#escopoclasse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscopoclasse(@NotNull GramaticaParser.EscopoclasseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtracao}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtracao(@NotNull GramaticaParser.SubtracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MenorOuEquivalente}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorOuEquivalente(@NotNull GramaticaParser.MenorOuEquivalenteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Divisao}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisao(@NotNull GramaticaParser.DivisaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(@NotNull GramaticaParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#listaargumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaargumento(@NotNull GramaticaParser.ListaargumentoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumeroReal}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroReal(@NotNull GramaticaParser.NumeroRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fator}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(@NotNull GramaticaParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChamarLvalue}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamarLvalue(@NotNull GramaticaParser.ChamarLvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclaracaoVariaveis}
	 * labeled alternative in {@link GramaticaParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoVariaveis(@NotNull GramaticaParser.DeclaracaoVariaveisContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull GramaticaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(@NotNull GramaticaParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#forstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstatement(@NotNull GramaticaParser.ForstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#listacomandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListacomandos(@NotNull GramaticaParser.ListacomandosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atribuicao}
	 * labeled alternative in {@link GramaticaParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(@NotNull GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CarregarValor}
	 * labeled alternative in {@link GramaticaParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCarregarValor(@NotNull GramaticaParser.CarregarValorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplicacao}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacao(@NotNull GramaticaParser.MultiplicacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#classe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasse(@NotNull GramaticaParser.ClasseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declclasse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclclasse(@NotNull GramaticaParser.DeclclasseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equivalente}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquivalente(@NotNull GramaticaParser.EquivalenteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(@NotNull GramaticaParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(@NotNull GramaticaParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Numexpr}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumexpr(@NotNull GramaticaParser.NumexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(@NotNull GramaticaParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#metodcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodcall(@NotNull GramaticaParser.MetodcallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodoDecl}
	 * labeled alternative in {@link GramaticaParser#programDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoDecl(@NotNull GramaticaParser.MetodoDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamlist(@NotNull GramaticaParser.ParamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comando1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando1(@NotNull GramaticaParser.Comando1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code MaiorOuEquivalente}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaiorOuEquivalente(@NotNull GramaticaParser.MaiorOuEquivalenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#tipoDeclarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDeclarar(@NotNull GramaticaParser.TipoDeclararContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Maior}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaior(@NotNull GramaticaParser.MaiorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(@NotNull GramaticaParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumeroInteiro}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroInteiro(@NotNull GramaticaParser.NumeroInteiroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#escopometodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscopometodo(@NotNull GramaticaParser.EscopometodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Menor}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenor(@NotNull GramaticaParser.MenorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(@NotNull GramaticaParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Soma}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoma(@NotNull GramaticaParser.SomaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclararEAtribuir}
	 * labeled alternative in {@link GramaticaParser#vardeclatrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararEAtribuir(@NotNull GramaticaParser.DeclararEAtribuirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Diferente}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiferente(@NotNull GramaticaParser.DiferenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#metoddecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetoddecl(@NotNull GramaticaParser.MetoddeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#inicializarArranjo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializarArranjo(@NotNull GramaticaParser.InicializarArranjoContext ctx);
}
// Generated from Gramatica.g4 by ANTLR 4.5
package de.letsbuildacompiler.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#teste}.
	 * @param ctx the parse tree
	 */
	void enterTeste(GramaticaParser.TesteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#teste}.
	 * @param ctx the parse tree
	 */
	void exitTeste(GramaticaParser.TesteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comandoNormal}
	 * labeled alternative in {@link GramaticaParser#programDecl}.
	 * @param ctx the parse tree
	 */
	void enterComandoNormal(GramaticaParser.ComandoNormalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comandoNormal}
	 * labeled alternative in {@link GramaticaParser#programDecl}.
	 * @param ctx the parse tree
	 */
	void exitComandoNormal(GramaticaParser.ComandoNormalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code metodoDecl}
	 * labeled alternative in {@link GramaticaParser#programDecl}.
	 * @param ctx the parse tree
	 */
	void enterMetodoDecl(GramaticaParser.MetodoDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code metodoDecl}
	 * labeled alternative in {@link GramaticaParser#programDecl}.
	 * @param ctx the parse tree
	 */
	void exitMetodoDecl(GramaticaParser.MetodoDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GramaticaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GramaticaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#gambi}.
	 * @param ctx the parse tree
	 */
	void enterGambi(GramaticaParser.GambiContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#gambi}.
	 * @param ctx the parse tree
	 */
	void exitGambi(GramaticaParser.GambiContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(GramaticaParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(GramaticaParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GramaticaParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GramaticaParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#classe}.
	 * @param ctx the parse tree
	 */
	void enterClasse(GramaticaParser.ClasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#classe}.
	 * @param ctx the parse tree
	 */
	void exitClasse(GramaticaParser.ClasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declclasse}.
	 * @param ctx the parse tree
	 */
	void enterDeclclasse(GramaticaParser.DeclclasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declclasse}.
	 * @param ctx the parse tree
	 */
	void exitDeclclasse(GramaticaParser.DeclclasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#escopoclasse}.
	 * @param ctx the parse tree
	 */
	void enterEscopoclasse(GramaticaParser.EscopoclasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#escopoclasse}.
	 * @param ctx the parse tree
	 */
	void exitEscopoclasse(GramaticaParser.EscopoclasseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclaracaoVariaveis}
	 * labeled alternative in {@link GramaticaParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVariaveis(GramaticaParser.DeclaracaoVariaveisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclaracaoVariaveis}
	 * labeled alternative in {@link GramaticaParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVariaveis(GramaticaParser.DeclaracaoVariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipoDeclarar}.
	 * @param ctx the parse tree
	 */
	void enterTipoDeclarar(GramaticaParser.TipoDeclararContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipoDeclarar}.
	 * @param ctx the parse tree
	 */
	void exitTipoDeclarar(GramaticaParser.TipoDeclararContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclararEAtribuir}
	 * labeled alternative in {@link GramaticaParser#vardeclatrib}.
	 * @param ctx the parse tree
	 */
	void enterDeclararEAtribuir(GramaticaParser.DeclararEAtribuirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclararEAtribuir}
	 * labeled alternative in {@link GramaticaParser#vardeclatrib}.
	 * @param ctx the parse tree
	 */
	void exitDeclararEAtribuir(GramaticaParser.DeclararEAtribuirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atribuicao}
	 * labeled alternative in {@link GramaticaParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atribuicao}
	 * labeled alternative in {@link GramaticaParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CarregarValor}
	 * labeled alternative in {@link GramaticaParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterCarregarValor(GramaticaParser.CarregarValorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CarregarValor}
	 * labeled alternative in {@link GramaticaParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitCarregarValor(GramaticaParser.CarregarValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#metoddecl}.
	 * @param ctx the parse tree
	 */
	void enterMetoddecl(GramaticaParser.MetoddeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#metoddecl}.
	 * @param ctx the parse tree
	 */
	void exitMetoddecl(GramaticaParser.MetoddeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(GramaticaParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(GramaticaParser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#metodcall}.
	 * @param ctx the parse tree
	 */
	void enterMetodcall(GramaticaParser.MetodcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#metodcall}.
	 * @param ctx the parse tree
	 */
	void exitMetodcall(GramaticaParser.MetodcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(GramaticaParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(GramaticaParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando1}.
	 * @param ctx the parse tree
	 */
	void enterComando1(GramaticaParser.Comando1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando1}.
	 * @param ctx the parse tree
	 */
	void exitComando1(GramaticaParser.Comando1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#escopometodo}.
	 * @param ctx the parse tree
	 */
	void enterEscopometodo(GramaticaParser.EscopometodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#escopometodo}.
	 * @param ctx the parse tree
	 */
	void exitEscopometodo(GramaticaParser.EscopometodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(GramaticaParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(GramaticaParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#listaargumento}.
	 * @param ctx the parse tree
	 */
	void enterListaargumento(GramaticaParser.ListaargumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#listaargumento}.
	 * @param ctx the parse tree
	 */
	void exitListaargumento(GramaticaParser.ListaargumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(GramaticaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(GramaticaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Numexpr}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterNumexpr(GramaticaParser.NumexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Numexpr}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitNumexpr(GramaticaParser.NumexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Menor}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterMenor(GramaticaParser.MenorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Menor}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitMenor(GramaticaParser.MenorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Maior}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterMaior(GramaticaParser.MaiorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Maior}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitMaior(GramaticaParser.MaiorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MenorOuEquivalente}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterMenorOuEquivalente(GramaticaParser.MenorOuEquivalenteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MenorOuEquivalente}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitMenorOuEquivalente(GramaticaParser.MenorOuEquivalenteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MaiorOuEquivalente}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterMaiorOuEquivalente(GramaticaParser.MaiorOuEquivalenteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MaiorOuEquivalente}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitMaiorOuEquivalente(GramaticaParser.MaiorOuEquivalenteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equivalente}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterEquivalente(GramaticaParser.EquivalenteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equivalente}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitEquivalente(GramaticaParser.EquivalenteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Diferente}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterDiferente(GramaticaParser.DiferenteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Diferente}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitDiferente(GramaticaParser.DiferenteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChamarMetodo}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterChamarMetodo(GramaticaParser.ChamarMetodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChamarMetodo}
	 * labeled alternative in {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitChamarMetodo(GramaticaParser.ChamarMetodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplicacao}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacao(GramaticaParser.MultiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplicacao}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacao(GramaticaParser.MultiplicacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fator}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFator(GramaticaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fator}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFator(GramaticaParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtracao}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterSubtracao(GramaticaParser.SubtracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtracao}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitSubtracao(GramaticaParser.SubtracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Soma}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterSoma(GramaticaParser.SomaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Soma}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitSoma(GramaticaParser.SomaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Divisao}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterDivisao(GramaticaParser.DivisaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Divisao}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitDivisao(GramaticaParser.DivisaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterModulo(GramaticaParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitModulo(GramaticaParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumeroInteiro}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumeroInteiro(GramaticaParser.NumeroInteiroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumeroInteiro}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumeroInteiro(GramaticaParser.NumeroInteiroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumeroReal}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumeroReal(GramaticaParser.NumeroRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumeroReal}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumeroReal(GramaticaParser.NumeroRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterString(GramaticaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitString(GramaticaParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChamarLvalue}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterChamarLvalue(GramaticaParser.ChamarLvalueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChamarLvalue}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitChamarLvalue(GramaticaParser.ChamarLvalueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(GramaticaParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(GramaticaParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(GramaticaParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(GramaticaParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfIncompleto}
	 * labeled alternative in {@link GramaticaParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfIncompleto(GramaticaParser.IfIncompletoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfIncompleto}
	 * labeled alternative in {@link GramaticaParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfIncompleto(GramaticaParser.IfIncompletoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfCompleto}
	 * labeled alternative in {@link GramaticaParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfCompleto(GramaticaParser.IfCompletoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfCompleto}
	 * labeled alternative in {@link GramaticaParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfCompleto(GramaticaParser.IfCompletoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void enterForstatement(GramaticaParser.ForstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void exitForstatement(GramaticaParser.ForstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void enterWhilestatement(GramaticaParser.WhilestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void exitWhilestatement(GramaticaParser.WhilestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#listacomandos}.
	 * @param ctx the parse tree
	 */
	void enterListacomandos(GramaticaParser.ListacomandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#listacomandos}.
	 * @param ctx the parse tree
	 */
	void exitListacomandos(GramaticaParser.ListacomandosContext ctx);
}
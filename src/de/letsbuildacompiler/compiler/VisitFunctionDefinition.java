package de.letsbuildacompiler.compiler;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import de.letsbuildacompiler.parser.GramaticaBaseVisitor;
import de.letsbuildacompiler.parser.GramaticaParser.MetoddeclContext;
/*Classe encarregada de verificar as definições das funções.
 * Será executada antes de instanciarmos o MyVisitor;
 * Aggregate concatena as definições conforme percorre o código; 
 * MyVisitor receberá um Set com as funções já definidas, caracterizando a "segunda" passada da verficação da analise semantica.
 * */

public class VisitFunctionDefinition extends GramaticaBaseVisitor<Set<String> >{
	
	
	@Override
	public Set<String> visitMetoddecl(MetoddeclContext ctx) {
		String nomeFunc = ctx.nomeMetodo.getText();
		
		return Collections.singleton(nomeFunc);
	}
	/**/
	@Override
	protected Set<String> aggregateResult(Set<String> aggregate,
			Set<String> nextResult) {
		if(aggregate == null){
			return nextResult;
		}
		if(nextResult == null){
			return aggregate;
		}
		//realiza a junção das funções já definidas com aquelas ainda nao definidas;
		Set<String> combinedFuncDef = new HashSet<String>(aggregate);
		combinedFuncDef.addAll(nextResult);
		return combinedFuncDef;
	}

}

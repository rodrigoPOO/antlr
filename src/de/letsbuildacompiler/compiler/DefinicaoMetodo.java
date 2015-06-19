package de.letsbuildacompiler.compiler;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.tree.ParseTree;

import de.letsbuildacompiler.compiler.exceptions.FunctionAlreadyDefinedException;
import de.letsbuildacompiler.parser.GramaticaBaseVisitor;
import de.letsbuildacompiler.parser.GramaticaParser.MetoddeclContext;
/*Classe encarregada de verificar as definições das funções.
 * Será executada antes de instanciarmos o MyVisitor; *  
 * MyVisitor receberá uma MetodoList com as funções já definidas, caracterizando a "segunda" passada da verficação da analise semantica.
 * 
 * 
 * */

public class DefinicaoMetodo{
	
	public static MetodosDeclarados findMetodoDef(ParseTree tree){
		final MetodosDeclarados funcDef = new MetodosDeclarados();
		new GramaticaBaseVisitor<Void>(){
			public Void visitMetoddecl(MetoddeclContext ctx) {
				String nomeFunc = ctx.nomeMetodo.getText();
				int qntParam = ctx.parametros.decl.size();
				if(funcDef.contains(nomeFunc,qntParam)){
					throw new FunctionAlreadyDefinedException(ctx.nomeMetodo);
				}
				funcDef.add(nomeFunc,qntParam);
				return null;
			};
			
		}.visit(tree);
		return funcDef;
		
	}	
	
	
}

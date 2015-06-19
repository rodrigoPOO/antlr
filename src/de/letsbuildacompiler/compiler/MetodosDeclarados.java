package de.letsbuildacompiler.compiler;

import java.util.ArrayList;
/*Classe responsáve por armazenar os metodos declarados.
 * O fator que decidirá se um método já foi declarado é seu nome e quantidade de parametros.
 * TODO: MUDAR O FATOR. De forma a verificar quantidade e tipo.
 * 
 * */

public class MetodosDeclarados {

	private ArrayList<AssinaturaMetodo> metodos = new ArrayList<>();
	public boolean contains(String nomeMetod, int qntParam){
		for (AssinaturaMetodo assinaturaMetodo : metodos) {
			if(assinaturaMetodo.nomeMetod.equals(nomeMetod) && assinaturaMetodo.qntParam == qntParam){
				return true;
			}
		}
		return false;
	}
	public void add(String nomeMetod, int qntParam){
		metodos.add(new AssinaturaMetodo(qntParam,nomeMetod));
		
	}
	
	private static class AssinaturaMetodo{
		private int qntParam;
		private String nomeMetod;
		
		private AssinaturaMetodo(int qntParam, String nomeMetod) {
			super();
			this.qntParam = qntParam;
			this.nomeMetod = nomeMetod;
		}
		
	}
	
}


package de.letsbuildacompiler.compiler;

import java.util.ArrayList;

public class MetodoList {

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


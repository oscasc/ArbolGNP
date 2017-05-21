package com.neixar.osalgado.apps;

import com.neixar.osalgado.dtStructures.Arbol;


public class appMain {

	public static void main(String[] args) {		
		
		Arbol myTree = new Arbol();
		
		int[] listArbol = {5,4,20,10,60,15};
		
		for(int x : listArbol){
			myTree.add(x);
			System.out.println("con x = " + x +" ::Profundidad actual:" + myTree.getDepth());
		}
		
		System.out.println("Fin");
	}

}

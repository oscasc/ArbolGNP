package com.neixar.osalgado.apps;

import com.neixar.osalgado.dtStructures.Arbol;


public class appMain {

	public static void main(String[] args) {		
		
		Arbol myTree = new Arbol();
		
		System.out.println("Sin nodos :: Profundidad actual: " + myTree.getDepth());
		
		for(int x = 0; x<100; x++){
			myTree.add(x);
			System.out.println("con x = " + x +" ::Profundidad actual:" + myTree.getDepth());
		}
	
		System.out.println("Max Prof: " + myTree.getDepth());
		
	}

}

package com.neixar.osalgado.apps;

import com.neixar.osalgado.dtStructures.Arbol;


public class appMain {

	public static void main(String[] args) {		
		
		Arbol myTree = new Arbol();
		
		//int[] listArbol = {5,4,2010,60,15};
		//int[] listArbol = {20,1,35,7,8,45,1,69,101,84,15,36,88};
		int[] listArbol = {38,70,14,32,96,51,3,9,22,71,66,42,11,21,9,2,90,83,42,33};
				
		
		for(int x : listArbol){
			myTree.add(x);
			System.out.println("con x = " + x +" ::Profundidad actual:" + myTree.getDepth());
		}
		
		System.out.println("Fin");
	}

}

package com.neixar.osalgado.dtStructures;

public class Arbol {

	private Nodo root;
	private int maxDepth = 0;
	
	
	//Mete nodo al árbol, primero izq, luego der
	public void add(Object obj){
		if(this.root == null){
			this.root = new Nodo(); //El árbol, está vacío
			root.setContenido(obj);
 		}else{
 			Nodo nodo = new Nodo();
 			nodo.setContenido(obj);
 			add(root, nodo); 			
 		}
	}
	
	/*
	 * Dado un nodoPadre, si no tiene izq, lo agregamos a la izq
	 * Si no tiene derecho, lo agregamos a la derecha
	 * Si ya tiene ambos obtenemos el nodo hijo izq e iteramos
	 * */
	
	private void add(Nodo nodoPadre, Nodo nodoHijo){
		if(nodoPadre.getLeft() == null){
			nodoPadre.setLeft(nodoHijo);
		} else if(nodoPadre.getRight()==null){
			nodoPadre.setRight(nodoHijo);
		} else{
			add(nodoPadre.getLeft(),nodoHijo);
		}
	}
	
	public int getDepth(){
		int depth = 0;
		if(this.root == null){
			return 0;
		}else{
			depth = this.getDepth(this.root, ++depth);
		}
		return depth;
	}
	
	private int getDepth(Nodo nodo, int curDepth){
		if(nodo.getLeft() != null){
			maxDepth = getDepth(nodo.getLeft(),++curDepth);
		}else if(nodo.getRight() != null){
			maxDepth = getDepth(nodo.getRight(),++curDepth);
		}else{
			if(maxDepth < curDepth){
				maxDepth = curDepth;
			}	
		}
		
		return maxDepth;
	}
}

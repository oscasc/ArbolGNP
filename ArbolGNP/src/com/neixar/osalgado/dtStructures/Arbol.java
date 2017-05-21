package com.neixar.osalgado.dtStructures;


public class Arbol {

	private Nodo root;
	private int maxDepth = 0;
	
	
	//Mete nodo al árbol, primero izq, luego der
	public void add(int numero){
		if(this.root == null){
			this.root = new Nodo(); //El árbol, está vacío (Sólo metemos datos en Root)
			root.setContenido(numero);
 		}else{
 			Nodo nodo = new Nodo();	//El árbol, ya tiene nodo Root
 			nodo.setContenido(numero);
 			add(root, nodo); 			
 		}
	}
	
	/*
	 * Dado un nodoPadre, si no tiene izq, lo agregamos a la izq
	 * Si no tiene derecho, lo agregamos a la derecha
	 * Si ya tiene ambos obtenemos el nodo hijo izq e iteramos
	 * 
	 * Ver 1.1: Consideramos para la inserción, el valor mayor o menor
	 */
	

	/*
	 * Evaluamos: 
	 * 		Si valor hijo menor al padre insertamos en nodo izq. (Caso 1)
	 * 		Si valor hijo mayor al padre insertamos en nodo derecho. (Caso 2)
	 * 		Si valor hijo tiene el mismo valor que el padre, no hacer nada  (Caso 3)
	 */
	
	private void add(Nodo nodoPadre, Nodo nodoHijo){
		
		if(nodoHijo.getContenido() < nodoPadre.getContenido()){	//Caso 1
			//Si Padre carece de hijo izq, lo insertamos
			//En caso contrario, el nodo hijo izq será el nuevo nodo padre y repetimos (recursivo)
			if(nodoPadre.getLeft()==null){ //Insertamos hijo, sin problema
				nodoPadre.setLeft(nodoHijo);
				nodoHijo.setPadre(nodoPadre);
			}else{
				//Ya existe un nodo hijo, hacemos inserción recursiva (usamos el hijo, ahora como padre)
				add(nodoPadre.getLeft(),nodoHijo);
			}
		} else if(nodoHijo.getContenido() > nodoPadre.getContenido()){	//Caso 2
			//Si Padre carece de hijo derecho, lo insertamos como nodo derecho
			//En caso contrario, el nodo hijo derecho será el nuevo nodo padre y repetimos (recursivo)
			if(nodoPadre.getRight()==null){ //Insertamos hijo, sin problema
				nodoPadre.setRight(nodoHijo);
				nodoHijo.setPadre(nodoPadre);
			}else{
				//Ya existe un nodo hijo, hacemos inserción recursiva (usamos el hijo, ahora como padre)
				add(nodoPadre.getRight(),nodoHijo);
			}			
		} else 
			return;	//Caso 3
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

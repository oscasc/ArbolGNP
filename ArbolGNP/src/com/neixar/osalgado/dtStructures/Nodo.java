package com.neixar.osalgado.dtStructures;

class Nodo {
	private Nodo left;		//Nodo hijo izquierdo
	private Nodo right;		//Nodo hijo derecho
	private Object contenido;	//Contenido del Nodo (un objeto)
	
	
	public Nodo getLeft() {
		return left;
	}
	public void setLeft(Nodo left) {
		this.left = left;
	}
	public Nodo getRight() {
		return right;
	}
	public void setRight(Nodo right) {
		this.right = right;
	}
	public Object getContenido() {
		return contenido;
	}
	public void setContenido(Object contenido) {
		this.contenido = contenido;
	}
	
	
	
	
}

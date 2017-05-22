package com.neixar.osalgado.dtStructures;

/*
 * Clase protected, sólo clases del paquete la accederán
 * 
 * */

class Nodo {
	private Nodo left; // Nodo hijo izquierdo
	private Nodo right; // Nodo hijo derecho
	private Nodo padre; // Recordamos al nodo padre
	private int contenido; // Contenido del Nodo (cambiamos para esta versión,
							// el uso exclusivo de datos tipo int)

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

	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

	// Versión 1.1
	public void setPadre(Nodo padre) {
		this.padre = padre;
	}

	public Nodo getPadre() {
		return padre;
	}

}

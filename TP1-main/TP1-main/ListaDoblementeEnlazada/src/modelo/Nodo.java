package modelo;

import interfaces.INodo;


public class Nodo implements INodo {
    //private int dato;
	private Vehiculo dato;
    private INodo siguiente; //INodo
    private INodo anterior; 

  //el constructor del nodo siempre lo hacemos asi no necesitamos el nodo siguiente en los parametros y abajo le ponemos null
  	
  	//Tambien existen los destructores para desalojar memoria q vienen incluidos en la JVM
  	
  	
  	public INodo getSiguiente() {
  		return siguiente;
  	}
  	public Nodo(Vehiculo dato) {
	super();
	this.dato = dato;
	this.siguiente = null;
	this.anterior = null;
}
	public INodo getAnterior() {
		return anterior;
	}

	public void setAnterior(INodo anterior) {
		this.anterior = anterior;
	}

	public void setSiguiente(INodo siguiente) {
  		this.siguiente = siguiente;
  	}


	

	public Vehiculo getDato() {
		return dato;
	}
	public void setDato(Vehiculo dato) {
		this.dato = dato;
	}


	@Override
	public String toString() {
		return "Nodo [dato=" + dato + ", siguiente=" + siguiente + ", anterior=" + anterior + "]";
	}
	
	
  	
  	
  	
  	
}




//iriarte
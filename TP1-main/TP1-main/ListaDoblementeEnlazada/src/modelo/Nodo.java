package modelo;

import interfaces.INodo;

// Clase Nodo que implementa la interfaz INodo
public class Nodo implements INodo {
	private Vehiculo dato;        // Dato del nodo (un vehículo)
	private INodo siguiente;      // Referencia al siguiente nodo
	private INodo anterior;       // Referencia al nodo anterior

	// Constructor
	public Nodo(Vehiculo dato) {
		this.dato = dato;
		this.siguiente = null;
		this.anterior = null;
	}

	// Métodos de la interfaz INodo

	@Override
	public Vehiculo getDato() {
		return dato;
	}

	@Override
	public void setDato(Vehiculo dato) {
		this.dato = dato;
	}

	@Override
	public INodo getSiguiente() {
		return siguiente;
	}

	@Override
	public void setSiguiente(INodo siguiente) {
		this.siguiente = siguiente;
	}

	@Override
	public INodo getAnterior() {
		return anterior;
	}

	@Override
	public void setAnterior(INodo anterior) {
		this.anterior = anterior;
	}

	// Para mostrar el nodo como string
	@Override
	public String toString() {
		return dato.toString();
	}
}

package modelo;

import interfaces.ILista;
import interfaces.INodo;

// Clase Lista que implementa ILista usando nodos doblemente enlazados
public class Lista implements ILista {
	private INodo primero; // Nodo inicial de la lista

	// Constructor
	public Lista() {
		this.primero = null;
	}

	@Override
	public INodo getPrimero() {
		return primero;
	}

	@Override
	public void setPrimero(INodo primero) {
		this.primero = primero;
	}

	// Inserta un vehículo al principio de la lista
	@Override
	public void insertarPrimero(Vehiculo d) {
		INodo nuevo = new Nodo(d);
		if (primero != null) {
			nuevo.setSiguiente(primero);
			primero.setAnterior(nuevo);
		}
		primero = nuevo;
	}

	// Inserta un vehículo al final de la lista
	@Override
	public void insertarUltimo(Vehiculo d) {
		INodo nuevo = new Nodo(d);
		if (primero == null) {
			primero = nuevo;
		} else {
			INodo actual = primero;
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(nuevo);
			nuevo.setAnterior(actual);
		}
	}

	// Devuelve el dato del primer nodo
	@Override
	public Vehiculo obtenerPrimero() {
		return (primero != null) ? primero.getDato() : null;
	}

	// Verifica si la lista está vacía
	@Override
	public boolean estaVacia() {
		return primero == null;
	}

	// Cuenta la cantidad de elementos en la lista
	@Override
	public int cantidadElementos() {
		int count = 0;
		INodo actual = primero;
		while (actual != null) {
			count++;
			actual = actual.getSiguiente();
		}
		return count;
	}

	// Muestra la lista de principio a fin
	@Override
	public void mostrarLista() {
		INodo actual = primero;
		while (actual != null) {
			System.out.println(actual.getDato());
			actual = actual.getSiguiente();
		}
	}

	// Extra: Buscar vehículo por patente
	public Vehiculo buscarVehiculoPorPatente(String patente) {
		INodo actual = primero;
		while (actual != null) {
			if (actual.getDato().getPatente().equalsIgnoreCase(patente)) {
				return actual.getDato();
			}
			actual = actual.getSiguiente();
		}
		return null;
	}

	// Extra: Eliminar vehículo por patente
	public boolean eliminarVehiculoPorPatente(String patente) {
		INodo actual = primero;

		while (actual != null) {
			if (actual.getDato().getPatente().equalsIgnoreCase(patente)) {
				// Si es el primero
				if (actual == primero) {
					primero = actual.getSiguiente();
					if (primero != null) primero.setAnterior(null);
				} else {
					// Nodo en el medio o final
					INodo anterior = actual.getAnterior();
					INodo siguiente = actual.getSiguiente();
					anterior.setSiguiente(siguiente);
					if (siguiente != null) siguiente.setAnterior(anterior);
				}
				return true;
			}
			actual = actual.getSiguiente();
		}
		return false;
	}

	// Extra: Mostrar lista al revés (último al primero)
	public void mostrarReversa() {
		INodo actual = primero;
		if (actual == null) return;

		// Ir al último
		while (actual.getSiguiente() != null) {
			actual = actual.getSiguiente();
		}

		// Volver mostrando desde el último al primero
		while (actual != null) {
			System.out.println(actual.getDato());
			actual = actual.getAnterior();
		}
	}

	// Devuelve la lista como un String
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		INodo actual = primero;
		while (actual != null) {
			sb.append(actual.getDato().toString()).append("\n");
			actual = actual.getSiguiente();
		}
		return sb.toString();
	}


	///  Obtener genérico
	public Vehiculo obtenerGenerico(int pos) {
		int cont = 0;
		INodo actual = primero;
		while (actual != null) {
			if (cont == pos) {
				return actual.getDato();
			}
			cont++;
			actual = actual.getSiguiente();
		}
		// Si la posición no existe
		System.out.println("Error: Posición fuera de rango.");
		return null;
	}


	/// Eliminar genérico, quiero que me devuelva true o false en base a si
	/// se eliminó o no exitosamente...
	public boolean eliminarGenerico(Vehiculo v) {
		if (primero == null) return false;

		INodo actual = primero;

		// Caso especial: es el primero
		if (actual.getDato().equals(v)) {
			primero = actual.getSiguiente();
			if (primero != null) {
				primero.setAnterior(null);
			}
			return true;
		}

		while (actual != null) {
			if (actual.getDato().equals(v)) {
				INodo anterior = actual.getAnterior();
				INodo siguiente = actual.getSiguiente();

				if (anterior != null) anterior.setSiguiente(siguiente);
				if (siguiente != null) siguiente.setAnterior(anterior);

				return true;
			}
			actual = actual.getSiguiente();
		}

		return false;
	}



	/// ordenar
	public void ordenar() {
		if (estaVacia() || primero.getSiguiente() == null) return;

		boolean huboCambios;
		do {
			huboCambios = false;
			INodo actual = primero;

			while (actual.getSiguiente() != null) {
				Vehiculo v1 = actual.getDato();
				Vehiculo v2 = actual.getSiguiente().getDato();

				if (v1.getPatente().compareToIgnoreCase(v2.getPatente()) > 0) {
					// Intercambio de datos
					actual.setDato(v2);
					actual.getSiguiente().setDato(v1);
					huboCambios = true;
				}
				actual = actual.getSiguiente();
			}
		} while (huboCambios);
	}




}
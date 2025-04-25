package modelo;

public class Persona {

	private int dni;
	private String nombre;
	// Si no se pasa una lista, se crea una lista vacía.
	private Lista listaVehiculos;

	// Constructor con lista
	public Persona(int dni, String nombre, Lista listaVehiculos) {
		this.dni = dni;
		this.nombre = nombre;
		// Si la lista es nula, se crea una lista vacía
		this.listaVehiculos = (listaVehiculos != null) ? listaVehiculos : new Lista();
	}

	// Constructor sin lista, también se crea una lista vacía.
	public Persona(int dni, String nombre) {
		this(dni, nombre, new Lista());
	}

	// Getters y setters
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Lista getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(Lista listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}

	public void mostrarPersona() {
		System.out.println(this);
		listaVehiculos.mostrarLista();
	}
}
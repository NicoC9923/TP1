package modelo;

import interfaces.INodo;

public class Vehiculo {

	private String patente;
	private String modelo;


	///  getters y setters
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", modelo=" + modelo + "]";
	}
	public Vehiculo(String patente, String modelo) {
		super();
		this.patente = patente;
		this.modelo = modelo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		Vehiculo otro = (Vehiculo) obj;
		return this.patente.equalsIgnoreCase(otro.patente); // o cualquier campo que defina identidad
	}



}

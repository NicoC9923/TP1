package interfaces;

import modelo.Vehiculo;

public interface INodo {

	public Vehiculo getDato();
	public void setDato(Vehiculo dato);
	public INodo getSiguiente();
	public void setSiguiente(INodo siguiente);
	@Override
	public String toString();
	public INodo getAnterior();
	public void setAnterior(INodo anterior);
	
}
	
	
	


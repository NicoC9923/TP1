package interfaces;

import modelo.Vehiculo;
//contrato de trabajo para las listas creadas en el programa
public interface ILista {

public INodo getPrimero();
	
	public void setPrimero(INodo primero);
	

	@Override
	public String toString();
	
	//procedimientos de inserción en la lista
	public void insertarPrimero(Vehiculo d);
	public void insertarUltimo(Vehiculo d);//cola y pila
	
	
	
	//OBTENER para rescatar un nodo
	
	public Vehiculo obtenerPrimero();//cola
	
	
	//metodos extras(no primitivos)
	 public boolean estaVacia();
	 public   int cantidadElementos();
	 public void mostrarLista();
	
	 
	
	
	
	
}

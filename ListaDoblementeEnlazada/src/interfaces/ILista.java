package interfaces;

public interface ILista {

public INodo getPrimero();
	
	public void setPrimero(INodo primero);
	public INodo getAnterior();
	public void setAnterior(INodo anterior);

	@Override
	public String toString();
	
	//primitivas: metodos elementales de la estrutura q nunca pueden faltar!!!
	//INSERTAR - AGREGAR
	//para insertar se necesita el dato y en el caso generico la posicion tambien
	public void insertarPrimero(int d);
	public void insertarUltimo(int d);//cola y pila
	
	
	
	//OBTENER para rescatar un nodo
	
	public int obtenerPrimero();//cola
	
	
	//metodos extras(no primitivos)
	 public boolean estaVacia();
	 public   int cantidadElementos();
	 public void mostrar();
	
	 
	
	
	
	
}

package modelo;

import interfaces.ILista;
import interfaces.INodo;

//Saque la implementación implements ILista, OJO ustedes la mantienen
public class Lista implements ILista {
	
    private INodo primero;
    private INodo ultimo;
    

    
    
    

//Nuestras listas siempre empiezan/se inicializan vacias por lo tanto utilizamos el constructor vacio 

	public Lista(INodo primero, INodo ultimo) {
		super();
		this.primero = null;
		this.ultimo = null;
	}




	public INodo getPrimero() {
		return primero;
	}




	public void setPrimero(INodo primero) {
		this.primero = primero;
	}




	



	public INodo getUltimo() {
		return ultimo;
	}




	public void setUltimo(INodo ultimo) {
		this.ultimo = ultimo;
	}




	public boolean estaVacia() {
		boolean respuesta;//DECLARO UNA VARIABLE RESPUESTA PARA ASIGNARLE LOS VALORES BOOLEANOS
		if(primero == null) {
			respuesta = true;}
			else {
				respuesta = false;
			}
			return respuesta;
		}
    
    
    
    
    
	
	public void insertarPrimero(Vehiculo dato) {
	    Nodo nuevo = new Nodo(dato);
	    if (!estaVacia()) {
	        nuevo.setSiguiente(primero);
	        primero.setAnterior(nuevo);
	        primero = nuevo;
	    } else {
	        primero = nuevo;
	        ultimo = nuevo;
	    }
	}
	
	
	
	
	public void insertarUltimo(Vehiculo dato) {
	    Nodo nuevoNodo = new Nodo(dato); // Se crea el nodo con el dato

	    if (!estaVacia()) {
	        INodo actual = primero;
	        while (actual.getSiguiente() != null) {
	            actual = actual.getSiguiente(); // Hacemos recorrido para llegar al ultimo de todos
	        }
	        actual.setSiguiente(nuevoNodo);     // El último nodo apunta al nuevo
	        nuevoNodo.setAnterior(actual);      // El nuevo apunta al anterior
	        ultimo = nuevoNodo;                 // Actualizamos el último
	    } else {//caso contrario, si la lista ya se encuentra vacia simplemente se asigna el nuevo nodo al primero y ultimo
	        primero = nuevoNodo;
	        ultimo = nuevoNodo;
	    }
	}
 
    
 // Método para obtener el primer elemento (sin eliminarlo)
    public Vehiculo obtenerPrimero() {
        if (estaVacia()) throw new IllegalStateException("Lista vacía"); //es otra forma creando una excepcion personalizada en vez de
        return primero.getDato();                                       
    }
    
    
    
    
    
    
    
    
    
    //Metodo insertarPrimero sin doble enlace
    
  /* public void insertarPrimero(Vehiculo dato) {
        Nodo nuevo = new Nodo(dato);
    	if(!esVacia()) {
        nuevo.setSiguiente(primero);
        primero = nuevo;
    	}else {
    		primero = nuevo;
    	}
    }
*/
    //insertarUltimo sin doble enlace
    /*
    public void insertarUltimo(Vehiculo dato) {
        Nodo nuevo = new Nodo(dato);
        if (esVacia()) {
            primero = nuevo;
        } else {
            INodo actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }
*/
  


   
    public int cantidadElementos() {
        int contador = 0;
        INodo actual = primero;

        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }

        return contador;
    }

 
    public void mostrarLista() {
        INodo actual = primero;
        while (actual != null) {
        	//getDato --- Del Nodo ---- Vehiculo!!!
            System.out.print(actual.getDato() +"\n");
            actual = actual.getSiguiente();
        }
        
    }
}
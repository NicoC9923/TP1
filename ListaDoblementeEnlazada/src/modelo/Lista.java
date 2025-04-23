package modelo;

import interfaces.ILista;
import interfaces.INodo;

//Saque la implementación implements ILista, OJO ustedes la mantienen
public class Lista implements ILista {
	
    private INodo primero;
    private INodo anterior;
    

    
    public Lista(INodo primero, INodo anterior) {
		super();
		this.primero = null;
		this.anterior = null;
    }
    



	public INodo getPrimero() {
		return primero;
	}




	public void setPrimero(INodo primero) {
		this.primero = primero;
	}




	public INodo getAnterior() {
		return anterior;
	}




	public void setAnterior(INodo anterior) {
		this.anterior = anterior;
	}




	public boolean esVacia() {
        return primero == null;
    }

    
    
    
    
    
	
    public void insertarPrimero(Vehiculo dato) {
        Nodo nuevo = new Nodo(dato);
        if (!esVacia()) {
            nuevo.setSiguiente(primero);  // El nuevo nodo apunta al primero
            primero.setAnterior(nuevo);   // El primero apunta atrás al nuevo nodo
            primero = nuevo;  // El primero ahora es el nuevo nodo
        } else {
            primero = nuevo;  // Si la lista está vacía, el nuevo nodo es el primero
            ultimo = nuevo;   // Y también el último
        }
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

  
   
    public Vehiculo obtenerPrimero() {
        if (esVacia()) throw new IllegalStateException("Lista vacía");
        return primero.getDato();
    }


   
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
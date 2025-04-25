package test;

import modelo.Lista;
import modelo.Persona;
import modelo.Vehiculo;

///Listas simplemente enlazadas N - > sig,  ant
///Listas doblemete enlazadas (int)
///Persona que tiene una lista de Vehiculos!!!!

public class TestPersonaVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Persona p = new Persona(11111, "Nico Perez");//Se crea la lista nula!!
		Vehiculo v = new Vehiculo("11AA222", "Fiat Uno");
		
		//Dos formas de insertar en la lista
		//La primera por parametos, la segunda por referencia
		p.getListaVehiculos().insertarPrimero(new Vehiculo("xxx111", "Toyota"));
		p.getListaVehiculos().insertarPrimero(v);

		//Muestro la persona, y sus vehiculos concatenados
		//Atentos a cómo manejo el toString de ambos y los
		//procedimientos de mostrar. 
		p.mostrarPersona();
		///Notar que toda la información quedó guardada en la persona
		///
		System.out.println("-------------------------");
		p.getListaVehiculos().mostrarLista();
		System.out.println("-------------------------");
		// Obtener vehículo por posición
		System.out.println("Vehículo en posición 1: " + p.getListaVehiculos().obtenerGenerico(1));
		System.out.println("Vehículo en posición 0: " + p.getListaVehiculos().obtenerGenerico(0));
		// Eliminar, devolverá true o false si se eliminó...
		System.out.println("Intentando eliminar vehículo con patente 11AA222...");
		boolean eliminado = ((Lista) p.getListaVehiculos()).eliminarVehiculoPorPatente("11AA222");
		System.out.println("¿Se eliminó?: " + eliminado);

		System.out.print(".");
		System.out.println("-------------------------");
		System.out.println("Lista después de eliminar por patente:");
		p.getListaVehiculos().mostrarLista();

		// Ordenar lista
		System.out.println("Lista ordenada por patente:");
		p.getListaVehiculos().ordenar();
		p.getListaVehiculos().mostrarLista();



		System.out.println("---------------------------------------");

		// Buscar vehículo por patente
		String patenteBuscada = "xxx111";
		Vehiculo buscado = ((Lista) p.getListaVehiculos()).buscarVehiculoPorPatente(patenteBuscada);
		if (buscado != null) {
			System.out.println("Vehículo encontrado con patente " + patenteBuscada + ": " + buscado);
		} else {
			System.out.println("No se encontró vehículo con patente " + patenteBuscada);
		}

		// Ordenar lista
		System.out.println("Lista ordenada por patente:");
		p.getListaVehiculos().ordenar();
		p.getListaVehiculos().mostrarLista();

		// Mostrar lista en orden inverso (antes de eliminar)
		System.out.println("Lista en orden inverso:");
		((Lista) p.getListaVehiculos()).mostrarReversa();


		// Eliminar vehículo por patente
		boolean eliminadoPorPatente = ((Lista) p.getListaVehiculos()).eliminarVehiculoPorPatente("xxx111");
		System.out.println("Se eliminó el vehículo con patente xxx111: " + eliminadoPorPatente);
		System.out.println("Lista después de eliminar por patente:");
		p.getListaVehiculos().mostrarLista();

		// Mostrar lista en orden inverso
		System.out.println("Lista en orden inverso:");
		((Lista) p.getListaVehiculos()).mostrarReversa();

		///NOTAS: 
		///esto es una ayuda para el tp1, pero tienen muchas cosas que mejorar
		///1 - Hacer y usar una lista doblemente enlazada
		///2 - Testear más metodos, incluso algunos sofisticados como 
		///ordenar y buscar vehiculos
		///3 - El nodo tiene que tener el anterior, ojo que eso modifica los métodos
		///4 - Yo omiti las interfaces para hacer más rapido el ejemplo
		///Ustedes tienen que poner las interfaces y usarlas bien
		///Ningún items es obligatorio, pero cuanto más completo más nota. 
		

	}

}

package ejerciciosTema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class act01 {

	public static void main (String[] args) {
		
		/*
		 * Crea una aplicación que use un ArrayList para almacenar números enteros 
		 * y añade variosvalores
		 */
		
		
		// Creo un ArrayList de enteros (Integer)
		ArrayList<Integer> valoresEnteros = new ArrayList<Integer>();
		
		// Añado valores al ArrayList
		valoresEnteros.add(3);
		valoresEnteros.add(69);
		valoresEnteros.add(2, 29); // El primer valor es la posicion y el segundo es el valor
		
		
		/*
		 * Muestra el número total de elementos del ArrayList, y recórrelo
		 */
		
		// Muestro el numero total de elementos con el metodo size()
		int contenidoTamanio = valoresEnteros.size();
		System.out.println("Los elementos que contiene son: " + contenidoTamanio + "\n");
		
		// Recorro el ArrayList con un bucle for each
		for (Integer enteros : valoresEnteros) { // Variable del tipo del ArrayList : ArrayList valoresEnteros
			System.out.println("Estoy recorriendo el ArrayList: " + enteros);
		}
		
		/*
		 * Pide al usuario que introduzca un valor para buscarlo en el ArrayList. 
		 * Si lo encuentra, el programa preguntará si se quiere cambiar el valor.
		 * Si el usuario contesta
		 * afirmativamente, se le pedirá el nuevo valor y se introducirá en el ArrayList modificando el anterior
		 */
		
		// Pido por consola al usuario que introduzca un valor
		System.out.println("Introduce un valor para buscarlo dentro del ArrayList 'valoresEnteros':");
		
		// Creo una variable de clase Scanner para poder recoger el valor
		Scanner sc = new Scanner(System.in);
		// Guardo el valor introducido por el usuario con el metodo nextInt()
		Integer valorUsuario = sc.nextInt();
		
		// Consumo el caracter de salto de linea restante para asegurar que la siguiente entrada del usuario se recoge correctamente
		// utilizando el metodo nextLine()
		sc.nextLine();
		
		// Compruebo si el valor existe buscandolo dentro del ArrayList valoresEnteros usando el metodo contains() 
		// pasandole como parametro el objeto con el valor introducido por el usuario
		if(valoresEnteros.contains(valorUsuario) == true) { // Si devuelve true
			// Pregunto al usuario si desea cambiar el valor
			System.out.println("Perfecto el valor existe. \n ¿Deseas cambiar el valor?");
			System.out.println("	Responde con una S si deseas cambiarlo o una N si no deseas cambiarlo.");
			
			String respuesta = sc.nextLine(); // Guardo la respuesta del usuario
			
			switch(respuesta.toUpperCase()) { // Transformo la respuesta a mayuscula del usuario por si acaso la introduce en minusculas
				case "S": 
					System.out.println("Introduce el nuevo valor:");
					Integer nuevoValor = sc.nextInt();
					
					// Obetengo la posicion del objeto dentro del ArrayList con el metodo indexOf()
					int posicion = valoresEnteros.indexOf(valorUsuario);
					
					// Sustituyo el valor antiguo por el nuevo con el metodo set(posicion, nuevoValor)
					valoresEnteros.set(posicion, nuevoValor);
				break;
				
				case "N":
					System.out.println("Gracias por utilizar el programa.");
				break;
				
				default:
					System.out.println("Respuesta NO valida.");
				break;
			}
			
		} else {
			System.out.println("El valor no existe.");
		}
		
		/*
		 * Al final, se debe volver a mostrar el número total de elementos del ArrayList, y cuáles son.
		 */
		
		// Muestro por consola el número total de elementos
		System.out.println("Número total de elementos del ArrayList 'valoresEnteros':" + valoresEnteros.size());
		
		// Recorro el ArrayList para mostrar cuales son
		System.out.println("Valores dentro del ArrayList 'valoresEnetros' actualizado:");
		for(Integer entero : valoresEnteros) {
			System.out.println(entero);
		}
		
	}
}

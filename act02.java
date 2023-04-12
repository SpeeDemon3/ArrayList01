package ejerciciosTema10;

import java.util.HashMap;

import java.util.Iterator;

/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class act02 {

	public static void main (String[] args) {
		
		/*
		 * Crea una aplicación que use un HashMap para almacenar los alumnos (clave) 
		 * y el curso al que van (valor).
		 */
		
		// Creo 4 objetos de la clase alumno
		Alumno alumno1 = new Alumno("Antonio", "Ruiz", 36);
		Alumno alumno2 = new Alumno("Arya", "Ruiz", 4);
		Alumno alumno3 = new Alumno("Patricia", "Luengo", 39);
		Alumno alumno4 = new Alumno("Chula", "Ruiz", 9);
		
		// Creo un HashMap -> String = Alumnos  -> String = Curso
		HashMap<Alumno, Integer> universidad = new HashMap<Alumno, Integer>();
		
		/*
		 * Añade varios alumnos al HashMap y luego muestra el número total de alumnos y sus
		 * valores (datos del alumno y curso al que van).
		 */
		
		// Añado alumnos al HashMap
		universidad.put(alumno1, 1);
		universidad.put(alumno2, 2);
		universidad.put(alumno3, 3);
		universidad.put(alumno4, 4);

		// Muestro el numero total de alumnos con el metodo size()
		int totalAlumnos = universidad.size();
		
		System.out.println("El total de alumnos en el centro son: " + totalAlumnos + " alumnos.");
		
		// Muestro los valores de los alumnos recorriendo el HashMap
		// Creo una variable iterator para acceder secuencialmente a los objetos de la coleccion
		// El metodo keySet() devuelve el conjunto de claves que hay en el HashMap
		// Realizo un cast explicito del objeto Iterator devuelto a Iterator para guardarlo en la variable
		Iterator<Alumno> it = universidad.keySet().iterator(); 
		
		// Creo un bucle while para recorrer el HashMap
		while (it.hasNext()) {
			Alumno clave = it.next(); // Guardo la clave como alumno
			// Con el metodo getNombre() obtengo el nombre de cada alumno y con el metodo get() obtengo el valor asociado a la clave
			System.out.println("Alumno: " + clave.getNombre() + " Curso: " + universidad.get(clave));
		}
		
		/*
		 * Crea un nuevo alumno cuyos datos coincidan con alguno de los ya dados de alta en el
		 * HashMap, pero en un curso diferente, e intenta insertarlo.
		 */
		
		// Creo un nuevo alumno Arya con distinto curso
		Alumno alumno5 = new Alumno("Arya", "Ruiz", 4);
		
		// Añado el nuevo alumno al HashMap
		universidad.put(alumno5, 9);
		
		/*
		 * Comprueba que el HashMap sigue teniendo el mismo tamaño 
		 * y muestra todos los datos que contiene.
		 */
		
		// Compruebo el tamaño del HashMap universidad
		System.out.println("Actualización alumnos totales " + universidad.size());
		
		Iterator<Alumno> ite = universidad.keySet().iterator(); 
		
		while(ite.hasNext()) {
			Alumno clave = ite.next(); // Guardo la clave como alumno
			// Con el metodo getNombre() obtengo el nombre de cada alumno y con el metodo get() obtengo el valor asociado a la clave
			System.out.println("Alumno: " + clave.getNombre() + " Curso: " + universidad.get(clave));			
		}
		
		
	}
}

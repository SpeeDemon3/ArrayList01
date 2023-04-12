package ejerciciosTema10;
/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class Alumno {

	/*
	 * Crea la clase Alumno con los atributos nombre, apellidos y edad. Deberás implementar el
	 * constructor, todas los getters y setters, el método toString y los métodos hashCode y
	 * equals. El código hash de cada alumno se calculará sumando el código hash del nombre, el
	 * código hash del apellido y la edad. Por otro lado, dos alumnos se consideran iguales si
	 * tienen el mismo valor en sus atributos.
	 */
	
	// Atributos de la clase Alumno
	private String nombre;
	private String apellidos;
	private Integer edad;
	
	// Constructor de la clase Alumno
	public Alumno(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	
	// Setters y Getters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// Metodo sobrescrito toString() para obtener informacion del objeto
	@Override
	public String toString() {
		return "Nombre: " + nombre + " - Apellidos: " + apellidos + " - Edad: " + edad;
	}
	
	// Metodo sobrescrito hashCode() para comprovar si dos elementos son iguales 
	// para la comparacion utiliza un numero entero de manera que lo hace de forma mas rapida que el metodo equals()
	@Override
	public int hashCode() {
		// La variable resultado alojara el valor de sumar el numero hash de cada atributo usando el metodo hashCode() para obtener el valor
		// hash de cada atributo
		int resultado = this.nombre.hashCode() + this.apellidos.hashCode() + this.edad.hashCode();
		return resultado; // Retorno el resultado
	}
	
	// Metodo sobrescrito equals() para saber si 2 objetos son iguales
	@Override
	public boolean equals(Object obj) {
		// Comparo el objeto actual con el objeto 'obj'
		if (this == obj) return true;
		// // Compruebo si el objeto es null
		if (obj == null) return false;
		// Compruebo si las clases son diferentes obteniendo la informacion con el metodo getClass()
		if (getClass() != obj.getClass()) return false;
		// Realizo un cast explicito del objeto 'obj'
		Alumno prototipo = (Alumno) obj;
		// Compruebo si el nombre del objeto es igual a null
		if (nombre == null) {
			if (prototipo.nombre != null) return false; // Compruebo si el nombre del prototipo no es igual a null
		} else if(!nombre.equals(prototipo.nombre)) return false; // Compruebo si el nombre del objeto no es igual al nombre del prototipo
		// Compruebo si los apellidos del objeto son nulos
		if (apellidos == null) {
			if(prototipo.apellidos != null) return false; // Compruebo si los apellidos del prototipo no son iguales a null
		} else if (!apellidos.equals(prototipo.apellidos)) return false;
		// Compruebo si la edad del objeto es nula
		if (edad == null) {
			if(prototipo.edad != null) return false; // Compruebo si la edad del prototipo no es nula
		} else if (!edad.equals(prototipo.edad)) return false;
		
		return true; // Si llega hasta el final del metodo depues de todas las comprobaciones retornara true
	}
	
	
	
	
	
	
	
	
	
	
}

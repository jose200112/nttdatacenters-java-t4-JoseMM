package nttdata.javat4.business;

/**
 * Clase Estudiante
 * 
 * @author jose
 *
 */
public class Student {
	private String dni;
	private String name;
	private String englishLevel;

	/**
	 * Constructor para registrar un estudiante
	 * 
	 * @param dni          (DNI)
	 * @param name         (nombre de estudiante)
	 * @param englishLevel (nivel de ingles)
	 */
	public Student(String dni, String name, String englishLevel) {
		this.dni = dni;
		this.name = name;
		this.englishLevel = englishLevel;

	}

	/**
	 * Metodo toString personalizado para la clase estudiante
	 */
	@Override
	public String toString() {
		return "dni: " + dni + ", nombre: " + name + ", nivel de ingles: " + englishLevel;
	}

}

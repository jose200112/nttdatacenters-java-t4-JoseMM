package nttdata.javat4.business;

/**
 * Interfaz ManagementServiceI con metodos para la gestion de centros y estudiantes
 * @author jose
 *
 */
public interface ManagementServiceI {
	/**
	 * Metodo para agregar o actualizar estudiantes
	 * @param dni (DNI)
	 * @param name (Nombre de estudiante)
	 * @param englishLevel (Nivel de ingles)
	 */
	public void addOrUpdateStudent(String dni,String name, String englishLevel);
	
	/**
	 * Metodo para agregar o actualizar un centro educativo
	 * @param name (Nombre del centro)
	 * @param mode (Modalidad)
	 * @param city (Ciudad)
	 */
	public void addOrUpdateSchool(String name, String mode, String city);
	
	/**
	 * Metodo para asignar un estudiante a una escuela
	 * @param dni (DNI)
	 * @param name (Nombre del centro)
	 */
	public void addStudentToSchool(String dni, String name);
	
	/**
	 * Metodo para borrar un estudiante
	 * @param dni (DNI)
	 */
	public void removeStudentFromSchool(String dni);
	
	/**
	 * Metodo para borrar un centro educativo
	 * Para borrar al centro primero habra que borrar los estudiantes
	 * @param name (Nombre del centro)
	 */
	public void removeSchool(String name);
	
	/**
	 * Metodo para mostrar todos los estudiantes de un determinado centro
	 * @param name (Nombre del centro)
	 */
	public void showAllStudentsFromSchool(String name);
		
}

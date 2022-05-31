package nttdata.javat4;

import nttdata.javat4.business.ManagementServiceImpl;

/**
 * Clase con metodo main
 * @author jose
 *
 */
public class T4MainJMM {
	
	/**
	 * Metodo main
	 * @param args (main)
	 */
	public static void main(String[] args) {
		
		//Se crea la instancia
		ManagementServiceImpl m = new ManagementServiceImpl();
		
		//Se agregan colegios
		m.addOrUpdateSchool("Sotero", "DAW", "Sevilla");
		m.addOrUpdateSchool("Campanillas", "DAW", "Malaga");
		
		
		//Se agregan estudiantes
		m.addOrUpdateStudent("3754834S", "Lucas", "B2");
		m.addOrUpdateStudent("3857453S", "Raul", "A1");
		m.addOrUpdateStudent("4593405E", "Sara", "A2");
		m.addOrUpdateStudent("5748329F", "Marta", "C1");
		m.addOrUpdateStudent("5784534Y", "Ramon", "C1");

		//Se pueden actualizar tanto colegios como estudiantes
		m.addOrUpdateSchool("Campanillas", "DAM", "Malaga");
		m.addOrUpdateStudent("3857453S", "Raul", "B2");
		
		
		//Se asigna a cada estudiante un centro
		m.addStudentToSchool("3754834S", "Sotero");
		m.addStudentToSchool("3857453S", "Sotero");
		m.addStudentToSchool("4593405E", "Campanillas");
		m.addStudentToSchool("5748329F","Sotero");
		m.addStudentToSchool("5784534Y", "Sotero");
		
		
		//Se borra el estudiante Ramon (asignado a Sotero)
		m.removeStudentFromSchool("5784534Y");
		
		//Al igual que en una BBDD si un centro tiene estudiantes no se borrara
		m.removeSchool("Campanillas");
		
		
		//Al no existir el centro o el alumno saldra una advertencia
		m.addStudentToSchool("3857453S", "Alixar");
		m.addStudentToSchool("dni erroneo", "Sotero");
		
		
		//Se muestran los estudiantes del centro Sotero (Raul se actualiza y Ramon no aparece)
		m.showAllStudentsFromSchool("Sotero");

	}
}

package nttdata.javat4.business;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase ManagementServiceImpl que implementa la interfaz de ManagementServiceI
 * 
 * @author jose
 *
 */
public class ManagementServiceImpl implements ManagementServiceI {
	private static final Logger LOG = LoggerFactory.getLogger(ManagementServiceImpl.class);
	private Map<String, Student> map2 = new HashMap<>();
	private Map<String, School> map3 = new HashMap<>();

	/**
	 * El metodo lanzara un mensaje diferente si se actualiza o agrega un estudiante
	 */
	public void addOrUpdateStudent(String dni, String name, String englishLevel) {
		Student s = new Student(dni, name, englishLevel);
		if (map2.containsKey(dni)) {
			map2.put(dni, s);
			LOG.info("El estudiante {} se ha actualizado con exito", name);
		} else {
			map2.put(dni, s);
			LOG.info("El estudiante {} se ha agregado con exito", name);
		}
	}

	/**
	 * El metodo lanzara un mensaje diferente si se actualiza o agrega un centro
	 */
	public void addOrUpdateSchool(String name, String mode, String city) {
		School sc = new School(name, mode, city);
		if (map3.containsKey(name)) {
			map3.put(name, sc);
			LOG.info("El centro {} se ha actualizado con exito", name);
		} else {
			map3.put(name, sc);
			LOG.info("El centro {} se ha agregado con exito", name);
		}
	}

	/**
	 * Comprueba si existe el centro y el alumno y los asigna
	 */
	public void addStudentToSchool(String dni, String name) {
		if (map2.containsKey(dni) && map3.containsKey(name)) {
			School.map1.put(map2.get(dni), map3.get(name));
			LOG.info("Estudiante asignado al centro {}", name);
		} else {
			LOG.warn("Centro o estudiante no encontrado");
		}
	}

	/**
	 * Borra un estudiante si existe
	 */
	public void removeStudentFromSchool(String dni) {
		if (map2.containsKey(dni)) {
			School.map1.remove(map2.get(dni));
			map2.remove(dni);
			LOG.info("Estudiante dado de baja con exito");
		} else {
			LOG.warn("Estudiante no encontrado");
		}
	}

	/**
	 * Borra un centro siempre y cuando no tenga alumnos
	 */
	public void removeSchool(String name) {
		int count = Collections.frequency(map3.keySet(), name);
		if (count == 0) {
			LOG.info("Centro {} dado de baja con exito", name);
			map3.remove(name);
		} else {
			LOG.warn("Este centro tiene {} alumnos y no se puede borrar", count);
		}
	}

	/**
	 * Comprueba si existe el centro e imprime los estudiantes
	 */
	public void showAllStudentsFromSchool(String name) {
		if (map3.containsKey(name)) {
			for (Map.Entry<Student, School> entry : School.map1.entrySet()) {

				if (entry.getValue().equals(map3.get(name))) {
					System.out.println(entry.getKey());
				}
			}
		} else {
			LOG.warn("Centro no encontrado");
		}
	}

}

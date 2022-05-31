package nttdata.javat4.business;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase centro educativo
 * 
 * @author jose
 *
 */
public class School {
	private String name;
	private String mode;
	private String city;
	protected static Map<Student, School> map1 = new HashMap<>();

	/**
	 * Constructor con parametros necesarios para registrar un centro
	 * 
	 * @param name (nombre del centro)
	 * @param mode (modalidad)
	 * @param city (ciudad)
	 */
	public School(String name, String mode, String city) {
		this.name = name;
		this.mode = mode;
		this.city = city;
	}

	/**
	 * Metodo toString personalizado para la clase centro educativo
	 */
	@Override
	public String toString() {
		return "Centro educativo: " + name + ", modalidad: " + mode + ", ciudad: " + city;
	}

}

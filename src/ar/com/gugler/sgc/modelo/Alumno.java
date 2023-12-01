package ar.com.gugler.sgc.modelo;

import java.time.LocalDate;

/**
 * Clase que representa a un Alumno y extiende la clase Persona.
 * Esta clase incluye atributos y métodos específicos para un Alumno.
 * 
 * @author Fabrizio Aguilar
 * @version 1.0
 */
public class Alumno extends Persona {

	private String legajo;

	/**
	 * Constructor que inicializa un objeto Alumno con los datos proporcionados.
	 * 
	 * @param numeroDocumento   Número de Documento del Alumno.
	 * @param apellido          Apellido del Alumno.
	 * @param nombres           Nombres del Alumno.
	 * @param fechaNacimiento   Fecha de Nacimiento del Alumno.
	 * @param domicilio         Domicilio del Alumno.
	 * @param telefono          Teléfono del Alumno.
	 * @param correoElectronico Correo Electrónico del Alumno.
	 * @param legajo            Legajo del Alumno.
	 */
	public Alumno(String numeroDocumento, String apellido, String nombres, LocalDate fechaNacimiento, String domicilio,
			String telefono, String correoElectronico, String legajo) {

		super(numeroDocumento, apellido, nombres, fechaNacimiento, domicilio, telefono, correoElectronico);
		this.legajo = legajo;

	}

	/**
	 * Constructor vacío de Alumno.
	 */
	public Alumno() {
		super();
	}

	/**
	 * Método que devuelve el Legajo del Alumno.
	 * 
	 * @return Legajo del Alumno.
	 */
	public String getLegajo() {
		return legajo;
	}

	/**
	 * Método que establece el Legajo del Alumno.
	 * 
	 * @param legajo Legajo del Alumno.
	 */
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	/**
	 * Implementación del método mostrarInformación de la clase Persona.
	 * Devuelve los datos del Alumno en una cadena.
	 */
	@Override
	public String mostrarInformacion() {
		return "Alumno: " + super.getNombres() + " " + super.getApellido() + " - DNI: " + super.getNumeroDocumento();
	}
}

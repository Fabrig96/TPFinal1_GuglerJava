package ar.com.gugler.sgc.modelo;

import java.time.LocalDate;

/**
 * Clase que representa a un Profesor y extiende la clase Persona.
 * Esta clase incluye atributos y métodos específicos para un Profesor.
 * 
 * @author Fabrizio Aguilar
 * @version 1.0
 */
public class Profesor extends Persona {

	private String cuil;
	private LocalDate fechaIngreso;

	/**
	 * Constructor que inicializa a un objeto Profesor con los datos proporcionados.
	 * 
	 * @param numeroDocumento   Número de Documento del Profesor.
	 * @param apellido          Apellido del Profesor.
	 * @param nombres           Nombres del Profesor.
	 * @param fechaNacimiento   Fecha de Nacimiento del Profesor.
	 * @param domicilio         Domicilio del Profesor.
	 * @param telefono          Teléfono del Profesor.
	 * @param correoElectronico Correo Electrónico del Profesor.
	 * @param cuil              CUIL del Profesor.
	 * @param fechaIngreso      Fecha de ingreso del Profesor.
	 */
	public Profesor(String numeroDocumento, String apellido, String nombres, LocalDate fechaNacimiento,
			String domicilio, String telefono, String correoElectronico, String cuil, LocalDate fechaIngreso) {
		super(numeroDocumento, apellido, nombres, fechaNacimiento, domicilio, telefono, correoElectronico);

		this.cuil = cuil;
		this.fechaIngreso = fechaIngreso;

	}

	/**
	 * Constructor vacío del Profesor.
	 */
	public Profesor() {
		super();
	}

	/**
	 * Método que devuelve el CUIL del Profesor.
	 * 
	 * @return CUIL del Profesor.
	 */
	public String getCuil() {
		return cuil;
	}

	/**
	 * Método que establece el CUIL del Profesor.
	 * 
	 * @param cuil CUIL del Profesor.
	 */
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	/**
	 * Método que devuelve la Fecha de ingreso del Profesor.
	 * 
	 * @return Fecha de ingreso del Profesor.
	 */
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * Método que establece la Fecha de ingreso del Profesor.
	 * 
	 * @param fechaIngreso Fecha de Ingreso del Profesor.
	 */
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * Implementación del método mostrarInformación de la clase Persona. 
	 * Devuelve los datos del Profesor en una cadena.
	 */
	@Override
	public String mostrarInformacion() {
		return "Profesor: " + super.getNombres().toUpperCase() + " " + super.getApellido().toUpperCase() + " - CUIL: "
				+ this.cuil;
	}

}

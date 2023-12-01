package ar.com.gugler.sgc.modelo;


import java.time.LocalDate;
import java.util.Objects;

/**
 * Clase que representa a una Persona. 
 * Esta clase incluye atributos y métodos específicos para una Persona.
 * 
 * @author Fabrizio Aguilar
 * @version 1.0
 */
public abstract class Persona {

	private String numeroDocumento;
	private String apellido;
	private String nombres;
	private LocalDate fechaNacimiento;
	private String domicilio;
	private String telefono;
	private String correoElectronico;

	/**
	 * Constructor que inicializa a un objeto Persona con los datos proporcionados.
	 * 
	 * @param numeroDocumento   Número de Documento de la Persona.
	 * @param apellido          Apellido de la Persona.
	 * @param nombres           Nombres de la Persona.
	 * @param fechaNacimiento   Fecha de Nacimiento de la Persona.
	 * @param domicilio         Domicilio de la Persona.
	 * @param telefono          Teléfono de la Persona.
	 * @param correoElectronico Correo Electrónico de la Persona.
	 */
	public Persona(String numeroDocumento, String apellido, String nombres, LocalDate fechaNacimiento, String domicilio,
			String telefono, String correoElectronico) {
		this.numeroDocumento = numeroDocumento;
		this.apellido = apellido;
		this.nombres = nombres;
		this.fechaNacimiento = fechaNacimiento;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
	}

	/**
	 * Constructor vacío de la Persona.
	 */
	public Persona() {

	}

	/**
	 * Método que devuelve el Número de Documento de la Persona.
	 * 
	 * @return Número de Documento de la Persona.
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	/**
	 * Método que establece el Número de Documento de la Persona.
	 * 
	 * @param numeroDocumento Número de Documento de la Persona.
	 */
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * Método que devuelve el Apellido de la Persona.
	 * 
	 * @return Apellido de la Persona.
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Método que establece el Apellido de la Persona.
	 * 
	 * @param apellido Apellido de la Persona.
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Método que devuelve los Nombres de la Persona.
	 * 
	 * @return Nombres de la Persona.
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * Método que establece los Nombres de la Persona.
	 * 
	 * @param nombres Nombres de la Persona.
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * Método que devuelve la Fecha de Nacimiento de la Persona.
	 * 
	 * @return Fecha de Nacimiento de la Persona.
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Método que establece la Fecha de Nacimiento de la Persona.
	 * 
	 * @param fechaNacimiento Fecha de Nacimiento de la Persona.
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Método que devuelve el Domicilio de la Persona.
	 * 
	 * @return Domicilio de la Persona.
	 */
	public String getDomicilio() {
		return domicilio;
	}

	/**
	 * Método que establece el Domicilio de la Persona.
	 * 
	 * @param domicilio Domicilio de la Persona.
	 */
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	/**
	 * Método que devuelve el Teléfono de la Persona.
	 * 
	 * @return Teléfono de la Persona.
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Método que establece el Teléfono de la Persona.
	 * 
	 * @param telefono Teléfono de la Persona.
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Método que devuelve el Correo Electrónico de la Persona.
	 * 
	 * @return Correo Electrónico de la Persona.
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * Método que establece el Correo Electrónico de la Persona.
	 * 
	 * @param correoElectronico Correo Electrónico de la Persona.
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	/**
	 * Método Abstracto que permite mostrar datos de la persona. Este método debe
	 * ser implementado por las clases que extiendan de Persona.
	 * 
	 * @return Cadena con datos de la Persona.
	 */
	public abstract String mostrarInformacion();

	/**
	 * Devuelve un valor hash para el objeto Persona.
	 * 
	 * @return Valor hash del objeto Persona.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(numeroDocumento, apellido, nombres, fechaNacimiento, domicilio, telefono,
				correoElectronico);
	}

	/**
	 * Compara este objeto Persona con otro objeto para determinar si son iguales.
	 *
	 * @param obj El objeto a comparar con este objeto Persona.
	 * @return true si los objetos son iguales, false en caso contrario.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Persona persona = (Persona) obj;

		if (!Objects.equals(numeroDocumento, persona.numeroDocumento))
			return false;
		if (!Objects.equals(apellido, persona.apellido))
			return false;
		if (!Objects.equals(nombres, persona.nombres))
			return false;
		if (!Objects.equals(fechaNacimiento, persona.fechaNacimiento))
			return false;
		if (!Objects.equals(domicilio, persona.domicilio))
			return false;
		if (!Objects.equals(telefono, persona.telefono))
			return false;
		if (!Objects.equals(correoElectronico, persona.correoElectronico))
			return false;

		return true;
	}

	/**
	 * Devuelve una representación en formato de cadena del objeto Persona. Esta
	 * representación puede ser utilizada para imprimir o depurar el estado del
	 * objeto.
	 *
	 * @return Representación en formato de cadena del objeto Persona.
	 */
	@Override
	public String toString() {
		return "Persona{numeroDocumento= " + numeroDocumento + ", apellido= '" + apellido + "', nombres= '" + nombres
				+ "', fechaNacimiento= " + fechaNacimiento + ", domicilio= '" + domicilio + "', telefono= " + telefono
				+ ", correoElectronico= '" + correoElectronico + "}";
	}

}

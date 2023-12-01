package ar.com.gugler.sgc.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Clase que representa a una Asignatura. 
 * Esta clase incluye atributos y métodos específicos para una Asignatura.
 * 
 * @author Fabrizio Aguilar
 * @version 1.0
 */
public class Asignatura {
	private int codigo;
	private String nombre;
	private List<Alumno> alumnos;
	private Profesor profesor;

	/**
	 * Constructor que inicializa un objeto Asignatura con los datos proporcionados.
	 * 
	 * @param codigo   Número de código de la Asignatura.
	 * @param nombre   Nombre de la Asignatura.
	 * @param profesor Profesor de la Asignatura.
	 */
	public Asignatura(int codigo, String nombre, Profesor profesor) {

		this.codigo = codigo;
		this.nombre = nombre;
		this.profesor = profesor;
		this.alumnos = new ArrayList<>();
	}

	/**
	 * Constructor vacío de la Asignatura.
	 */
	public Asignatura() {
		this.alumnos = new ArrayList<>();
	}

	/**
	 * Método que devuelve el Número de Código de la Asignatura.
	 * 
	 * @return Número de código de la Asignatura.
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Método que establece el Número de Código de la Asignatura.
	 * 
	 * @param codigo Número de Código de la Asignatura.
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Método que devuelve el Nombre de la Asignatura.
	 * 
	 * @return Nombre de la Asignatura.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método que establece el Nombre de la Asignatura.
	 * 
	 * @param nombre Nombre de la Asignatura.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que devuelve la lista de Alumnos de la Asignatura.
	 * 
	 * @return Lista de Alumnos de la Asignatura.
	 */
	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	/**
	 * Método que devuelve información del Profesor de la Asignatura.
	 * 
	 * @return Información del Profesor de la Asignatura.
	 */
	public String getProfesor() {
		return profesor.mostrarInformacion();
	}

	/**
	 * Método que establece el Profesor de la Asignatura.
	 * 
	 * @param profesor Profesor de la Asignatura.
	 */
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	/**
	 * Devuelve un valor hash para el objeto Asignatura.
	 * 
	 * @return Valor hash del objeto Asignatura.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(alumnos, codigo, nombre, profesor);
	}

	/**
	 * Compara este objeto Asignatura con otro objeto para determinar si son iguales.
	 *
	 * @param obj El objeto a comparar con este objeto Asignatura.
	 * @return true si los objetos son iguales, false en caso contrario.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asignatura other = (Asignatura) obj;
		return Objects.equals(alumnos, other.alumnos) && codigo == other.codigo && Objects.equals(nombre, other.nombre)
				&& Objects.equals(profesor, other.profesor);
	}

	/**
	 * Devuelve una representación en formato de cadena del objeto Asignatura. 
	 * Esta representación puede ser utilizada para imprimir o depurar el estado del objeto.
	 *
	 * @return Representación en formato de cadena del objeto Asignatura.
	 */
	@Override
	public String toString() {
		return "Asignatura {codigo=" + codigo + ", nombre=" + nombre + ", alumnos=" + alumnos + ", profesor=" + profesor
				+ "}";
	}

}

package ar.com.gugler.sgc.modelo;

/**
 * Clase que representa a una Materia y extiende de la clase Asignatura. 
 * Esta clase incluye atributos y métodos específicos para una Materia.
 * 
 * @author Fabrizio Aguilar
 * @version 1.0
 */
public class Materia extends Asignatura{
	
	private int anio;

	/**
	 * Constructor que inicializa a un objeto Materia con los datos proporcionados.
	 * 
	 * @param codigo   Número de Código de la Materia.
	 * @param nombre   Nombre de la Materia.
	 * @param profesor Profesor de la Materia.
	 * @param anio     Año de la Materia.
	 */
	public Materia(int codigo, String nombre, Profesor profesor, int anio) {
		super(codigo, nombre, profesor);
		this.anio = anio;
	}

	/**
	 * Constructor vacío de la Materia.
	 */
	public Materia() {
		super();
	}

	/**
	 * Método que devuelve el Año de la Materia.
	 * 
	 * @return Año de la Materia.
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * Método que establece el Año de la Materia.
	 * 
	 * @param anio Año de la Materia.
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}

}

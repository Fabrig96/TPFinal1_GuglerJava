package ar.com.gugler.sgc.modelo;

import java.util.List;

import ar.com.gugler.sgc.interfaces.Administrable;

/**
 * Clase que representa a un Curso y extiende de la clase Asignatura. 
 * Esta clase incluye atributos y métodos específicos para un Curso.
 * 
 * @author Fabrizio Aguilar
 * @version 1.0
 */
public class Curso extends Asignatura implements Administrable {

	private int cupo;

	/**
	 * Constructor que inicializa un objeto Curso con los datos proporcionados.
	 * 
	 * @param codigo   Número de Código del Curso.
	 * @param nombre   Nombre del Curso.
	 * @param profesor Profesor del Curso.
	 * @param cupo     Cupo del Curso.
	 */
	public Curso(int codigo, String nombre, Profesor profesor, int cupo) {
		super(codigo, nombre, profesor);
		this.cupo = cupo;
	}

	/**
	 * Constructor vacío del Curso.
	 */
	public Curso() {
		super();
	}

	/**
	 * Método que devuelve el Cupo del Curso.
	 * 
	 * @return Cupo del Curso.
	 */
	public int getCupo() {
		return cupo;
	}

	/**
	 * Método que establece el Cupo del Curso.
	 * 
	 * @param cupo Cupo del Curso.
	 */
	public void setCupo(int cupo) {
		this.cupo = cupo;
	}

	/**
	 * Método que permite agregar un alumno a la lista de Alumnos del Curso. 
	 * Por medio del método {{@link #admiteInscripciones()}, permitirá agregar un alumno
	 * si este devuelve true.
	 * 
	 * @param alumno Objeto Alumno.
	 */
	public void agregarAlumno(Alumno alumno) {
		if (this.admiteInscripciones()) {
			super.getAlumnos().add(alumno);
			System.out.println("-Alumno inscripto correctamente-");
		} else {
			System.out.println("-El curso no admite más inscripciones-");
		}
	}

	/**
	 * Método que permite eliminar un alumno de la lista de Alumnos del Curso.
	 * Verifica si la lista no está vacía y si el alumno existe en la lista para
	 * poder eliminarlo.
	 * 
	 * @param alumno Objeto Alumno.
	 */
	public void eliminarAlumno(Alumno alumno) {
		List<Alumno> listaAlumnos = super.getAlumnos();

		if (!listaAlumnos.isEmpty()) {
			boolean alumnoEliminado = listaAlumnos.remove(alumno);

			if (alumnoEliminado) {
				System.out.println("-Alumno eliminado correctamente-");
			} else {
				System.out.println("-Error al eliminar: El alumno no existe en la lista-");
			}
		} else {
			System.out.println("-Error al eliminar: La lista de alumnos está vacía-");
		}

	}

	/**
	 * Implementación del método admiteIncripciones de la interface Administrable.
	 * Se verifica si el conteo de alumnos de la lista del curso es menor al cupo
	 * establecido. Si es menor devuelve true, de lo contrario false.
	 */
	@Override
	public boolean admiteInscripciones() {

		List<Alumno> alumnos = this.getAlumnos();

		if (alumnos == null) {
			throw new IllegalStateException("-La lista de alumnos no ha sido inicializada correctamente-");
		}

		return alumnos.size() < this.cupo;
	}
	
}

package ar.com.gugler.sgc.principal;

import java.util.List;

import ar.com.gugler.sgc.modelo.Alumno;

/**
 * Clase que representa a Rutinas.
 * Esta clase incluye método estático {@link #listarAlumnos(List)}
 * 
 * @author Fabrizio Aguilar
 * @version 1.0
 */
public class Rutinas {
	
	/**
	 * Método estático que permite listar los elementos de una lista de objetos
	 * Alumno. Se imprime los datos de cada Alumno de la lista por medio del metodo
	 * mostarInformación de la clase Alumno.
	 * 
	 * @param listA Lista de objetos Alumno.
	 */
	public static void listarAlumnos(List<Alumno> listA) {
		for (Alumno a : listA) {
			System.out.println(a.mostrarInformacion());
		}
	}
}

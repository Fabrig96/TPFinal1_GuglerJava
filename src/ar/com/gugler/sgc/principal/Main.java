package ar.com.gugler.sgc.principal;

import java.time.LocalDate;
import java.time.Month;
import ar.com.gugler.sgc.modelo.*;

/**
 * Clase Principal.
 * 
 * @author Fabrizio Aguilar
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {

		// Instancias de Profesor y Alumnos
		Profesor prof1 = new Profesor("42955671", "Perez", "Juan Esteban", LocalDate.of(1982, Month.MARCH, 3),
				"Urquiza 211", "992999", "juesteb@gmail.com", "20429556718", LocalDate.of(2016, Month.OCTOBER, 8));

		Alumno alum1 = new Alumno("47499102", "Rossi", "Matias", LocalDate.of(1999, Month.AUGUST, 22), "Belgrano 300",
				"408777", "mat_ross10@gmail.com", "11147499102000");

		Alumno alum2 = new Alumno("49194855", "Fernandez", "Agustina", LocalDate.of(1998, Month.FEBRUARY, 2),
				"San Martin 102", "505662", "feragusf2@gmail.com", "11149194855000");

		// Llamada al método estatico mostrarDatos de Universidad para cada instancia.
		System.out.println("Mostrar Datos: ");
		Universidad.mostrarDatos(prof1);
		Universidad.mostrarDatos(alum1);
		Universidad.mostrarDatos(alum2);

		// Instancia de Curso 
		Curso cursoProgramacionJava = new Curso(220, "Programación en Java", prof1, 24); //Cupo de inscripciones = 24

		// Agregar alumnos al Curso
		cursoProgramacionJava.agregarAlumno(alum1);
		cursoProgramacionJava.agregarAlumno(alum2);

		// Listar alumnos del Curso
		System.out.println("Lista de Alumnos: ");
		Rutinas.listarAlumnos(cursoProgramacionJava.getAlumnos());

		// Obtener datos del Profesor del Curso
		System.out.println("Profesor del Curso: ");
		System.out.println(cursoProgramacionJava.getProfesor());
		
		
	}

}

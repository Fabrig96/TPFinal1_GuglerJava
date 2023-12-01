package ar.com.gugler.sgc.modelo;

/**
 * Clase que representa a una Universidad.
 * Esta clase incluye atributos y métodos específicos para una Universidad.
 * 
 * @author Fabrizio Aguilar
 * @version 1.0
 */
public class Universidad {
	
	/**
	 * Método que imprime los datos de un Objeto Persona pasado por parámetro.
	 * Usando los método de Get de Persona, imprime cadenas concatenadas con sus datos.
	 * @param person Objeto Persona.
	 */
	public static void mostrarDatos(Persona person) {
			
		System.out.println("----------------------------------------");
		System.out.println("Nro Documento: "+person.getNumeroDocumento());
		System.out.println("Apellido: "+person.getApellido());
		System.out.println("Nombres: "+person.getNombres());
		System.out.println("Fecha de nacimiento: "+person.getFechaNacimiento());
		System.out.println("Domicilio: "+person.getDomicilio());
		System.out.println("Telefono: "+person.getTelefono());
		System.out.println("Correo Electronico: "+person.getCorreoElectronico());
		System.out.println("----------------------------------------");
	}
	
}

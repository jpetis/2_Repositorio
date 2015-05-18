/**
 * 
 */
package com.ejerciciorepasocompleto.curso703;

/**
 * @author Jaime Gpetis
 *
 * 
 */
import java.io.Serializable;

public class Persona implements Serializable {
	
	private int edad;
	private String nombre;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object arg0) {
		Persona persona = (Persona) arg0;
		/**
		 * TODO TENGO QUE MIARR QUE THIS.NOMBRE Y THIS . EDAD SEAN IGUAL A PERSONA.NOMBRE Y PERSONA.EDAD
		 * SI SE CUMPLES ESTO, DEVUELVO TRUE
		 * SI NO, DEVUELVO FALSE
		 */
		if (this.nombre == persona.nombre && this.edad == persona.edad) {
			return true;
		}
		
	return false;
	}

	public Persona(String nombre, int edad) {
		this.edad = edad;
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return this.nombre + " " + this.edad;
	}
	
	

	
}
/**
 * 
 */
package com.ejerciciorepasocompleto.curso703;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class NotaException extends Exception {
	
	public static final String mensaje = "NOTA FUERA DEL RANGO PERMITIDO. Introduzca una nota de 0 a 10";
	
	public NotaException ()
	{
		super(mensaje);
	}

}
/**
 * 
 */
package com.ejerciciorepasocompleto.curso703;

import java.util.ArrayList;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class MainArrayListDePersonas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Juana", 14);
		Persona p2 = new Persona("Manolo", 15);
		Persona p3 = new Persona("Pedro", 16);
		Persona p4 = new Persona("Fofo", 17);
		Persona p5 = new Persona("Ester", 18);
		
		ArrayList<Persona> al = new ArrayList<Persona>();
		al.add(p5);
		al.add(p4);
		al.add(p3);
		al.add(p2);
		al.add(p1);
		int contador = 0;
		for (Persona persona : al) {
			System.out.println(persona);
				contador++;
		}
		al.remove(p4);
		System.out.println(al +" "+ contador);
		
	}

}

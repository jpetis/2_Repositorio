/**
 * 
 */
package com.ejerciciorepasocompleto.curso703;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Properties;

/**
 * @author Jaime Gpetis
 *
 * 
 */

public class ListaPersonas implements Serializable{
	
	public static final int CAPACIDAD = 10;
	
	private Persona[] array_personas;
	private int numPersonas;
	
	
	/**
	 * Es muy posible que haga falta añadir algún campo más
	 */
	
	public ListaPersonas()
	{
		//TODO HAY QUE HACER UN CONSTRUCTOR
		//RECUERDA QUE EL CONSTRUCTOR SIRVE PARA
			//RESERVAR MEMORIA
			//INICIALIZAR EL ESTADO DEL OBJETO Y SUS ATRIBUTOS
		/**CREO UN ESPACIO DE MEMORIA PARA EL ARRAY DE LISTA PERSONAS*/
		
		this.array_personas = new Persona[CAPACIDAD];
		this.numPersonas = 0;
		
		
	}
	
	public Persona[] getListaPersonas ()
	{
		//TODO HAY QUE DEVOLVER EL ARRAY DE PERSONAS QUE CONFORMAN LA LISTA
		/**devuelvo el array de personas*/
		
		return this.array_personas;
	}
	
	public Persona buscarPersona (String nombre)
	{
		//TODO BUSCAR PERSONA POR NOMBRE Y DEVOLVERLA
		//SI NO ESTÁ, DEVOLVER NULO
		
		/**CREO UNA PERSONA Y DOS VARIABLES PARA PONER CONDICIÓN EN EL RECORRER DEL ARRAY_PERSONAS*/
		Persona personaDev = null;
		boolean encontrado = false;
		boolean finall = false;
		
		/**SU CONTADOR*/
		int contador = 0;
		
		/**HAGO LA CONDICION DE RECORRIDO CON UN WHILE*/
		while ((!encontrado) && (!finall)) {
		
			/**COMPRUEBO LA SEGUNDA CONDICIÓN ¿HE LLEGADO AL FINAL?*/
			if (contador<numPersonas) {
				/**SI NO HE LLEGADO AL FINAL ENTRO A BUSCAR EN LA LISTA DE PERSONAS*/
				
				/**PREGUNTO LA PRIMERA CONDICIÓN ¿LO HE ENCONTRADO?*/
				if (array_personas[contador].getNombre().equals(nombre)) {
					encontrado = true;/**LO HE ENCONTRADO*/
					personaDev = array_personas[contador];/**LO GUARDO EN personasDev*/
					
					/**SI NO LO HE ENCONTRADO SIGO RECORRIENDOLO*/
				}else{contador++;}
				
			} else {
				/**SI LLEGASE AL FINAL SIN ENCONTRARLO ME SALDRIA DEL BUCLE Y DEVOLVERIA NULL*/
				finall=true; 
			}
			
		}
			/**SI HE ENCONTRADO LA PERSONA LA DEVUELVO*/
		return personaDev;
	}
	
	public Persona busarPersona (int edad)
	{
		//TODO BUSCAR PERSONA POR EDAD Y DEVOLVERLA
		//SI NO ESTÁ, DEVOLVER NULO
		
		/**CREO UNA PERSONA Y DOS VARIABLES PARA PONER CONDICIÓN EN EL RECORRER DEL ARRAY_PERSONAS*/
		Persona personaDev = null;
		boolean encontrado = false;
		boolean finall = false;
		
		/**SU CONTADOR*/
		int contador = 0;
		
		/**HAGO LA CONDICION DE RECORRIDO CON UN WHILE*/
		while ((!encontrado)&&(!finall)) {
			
			/**COMPRUEBO LA SEGUNDA CONDICIÓN ¿HE LLEGADO AL FINAL?*/
			if(contador>numPersonas){
				/**SI NO HE LLEGADO AL FINAL ENTRO A BUSCAR EN LA LISTA DE PERSONAS*/
				
				/**PREGUNTO LA PRIMERA CONDICIÓN ¿LO HE ENCONTRADO?*/
				if (edad == array_personas[contador].getEdad()) {
					encontrado = true;
					personaDev = array_personas[contador];
				
					/**PREGUNTO LA PRIMERA CONDICIÓN ¿LO HE ENCONTRADO?*/
				}else {contador++;}
					
			
			}else{/**AQUI VENIMOS DEL PRIMER IF*/
				/**SI LLEGASE AL FINAL SIN ENCONTRARLO ME SALDRIA DEL BUCLE Y DEVOLVERIA NULL*/
				finall = true;
			}
			
		}
		
		return personaDev;
	}
	
	public boolean serializar ()
	{
		//Hacer uso del fichero de propiedades serializa.properties,
		//para obtener de él el valor de la clave destino, 
		//que representa el nombre del fichero de salida
		
		/*ME CREO UN OBJETO DE LA CLASE  -FileInputStream-  PARA LEER EL ARCHIVO  -serializa.properties- */
		FileInputStream fis;
		try {
			fis = new FileInputStream("serializa.properties");
			/*ME CREO UN OBJETO DE LA CLASE  -Properties-  PARA CARGAR EL ARCHIVO  -Properties-*/
			Properties propiedades = new Properties();
			/*ME CREO UN OBJETO DE LA CLASE -ObjectOutputStream-  PARA CARGAR EL ARCHIVO  -Properties-*/
			ObjectOutputStream oos = null;
			/*CREO UN ARCHIVO VACIO SIN INICIALIZAR*/
			File fi = null;
			try {
			/*CARGO LAS PROPIEDADES DEL ARCHIVO PROPERTIES DENTRO DEL FIS PARA LEERLO*/	
				propiedades.load(fis);
			/*INSERTO EN EL NUEVO File -fi- LA CLABE DEL NOMBRE DE DESTINO PARA CREAR UN ARCHIVO*/	
				 fi = new File(propiedades.getProperty("destino"));
			/*CREO EL NUEVO ARCHIVO*/
				 fi.createNewFile();
			/*CARGO Y PREPARO  EN EL OBJETO LA ESCRITURA DEL MISMO EN EL ARCHIVO DE SALIDA -destino-*/	 
				 oos = new ObjectOutputStream(new FileOutputStream(fi));
				 oos.writeObject(array_personas);
				 } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		return false;
	}
	
	public boolean deserializar()
	{
		return false;
	}
	
	public void insertarPersona (Persona p) throws InsertarPersonaException
	{
		/**1 - COMPRUEBO QUE EL ARRAY NO ESTA LLENO
		 * 2 - COMPRUEBO QUE LA PERSONA NO ESTA REPETIDA
		 * 3 - INSERTO UNA NUEVA PERSONA EN EL ARRAY  
		 * */
		if (!estaLlena() && equals(false)) {
//			Persona persona = new Persona(nombre, edad);
			
		}
	}
	
	public int numeroPersonas()
	{
		
		for (int i = 0; i < array_personas.length; i++) {
			
		}
		return 0;
	}
	
	public boolean estaLlena()
	{
		
		return this.numPersonas==CAPACIDAD;
	}
	
	public void mostrar()
	{
		//TODO MOSTRAR LA LISTA DE PERSONAS
		// pista: ayudarse del método toString de persona
	}
	public boolean estaVacia(){

		return this.numPersonas == 0;
	}
	public void eliminar(){
		
	}
	public ListaPersonas combinarListas(){
		return null;
			
	}
	public  boolean compareTo() {
		for (int i = 0; i < array_personas.length; i++) {
			
		}
		return false;

}
}
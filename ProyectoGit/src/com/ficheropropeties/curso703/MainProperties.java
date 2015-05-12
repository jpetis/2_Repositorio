/**
 * 
 */
package com.ficheropropeties.curso703;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class MainProperties {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	public static void imprimirPropiedades(FileInputStream fis) throws IOException {
		Properties propiedad = new Properties();
		File fi = null;
		FileWriter fw = null;
		//cargamos las propiedades
		propiedad.load(fis);

		
		fi = new File(propiedad.getProperty("outfile"));
		fi.createNewFile();
		fw = new FileWriter(fi);
		fw.write(propiedad.getProperty("start")+"\n");
		fw.write(propiedad.getProperty("body")+"\n");
		fw.write(propiedad.getProperty("en")+"\n");
		fw.close();
		

	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		
		
		
		switch (args[0]) {
		case "it":
			fis= new FileInputStream("story_it.properties.txt");
			break;
		case "en":
			fis= new FileInputStream("story_en.properties.txt");

			break;
			
		default: //es:
			fis= new FileInputStream("story_es.properties.txt");

			break;
		}
		
		
		System.out.println();

		imprimirPropiedades(fis);
	
	}


}

package es.mdc;

import javax.swing.JOptionPane;

/**
 * Aplicación que realiza la misma tarea que el comando type 
 * de Windows (o cat en Unix).
 * 
 * @author josema
 * @version 1.2
 */
public class jtype {
	
    /**
     * jtype command-line application
     *  
     * @param args Command-line arguments.
     * El primer argumento será un nombre de fichero
     */
	public static void main(String[] args) {
        String filename = null;
		// Examinar los argumentos de la linea de órdenes
		if (args.length>0) {
			// Command-line mode
			if (!args[0].isBlank()) {
				filename = args[0];
				System.out.printf("> Leido en la linea de órdenes %s%n",args[0]);	
			}
		}
		else {
			// Interactive mode
			filename = JOptionPane.showInputDialog("Nombre del Fichero");			
			System.out.printf("> Leido en Ventana %s%n",filename);
		}
		System.out.printf("  Nombre de fichero: %s%n",filename);

		// TODO: 
		// Leer fichero para mostrar contenido en consola
		// No olvides Usar la sentencia try-with-resources
		// ¡Buena suerte!	
		
	}

}

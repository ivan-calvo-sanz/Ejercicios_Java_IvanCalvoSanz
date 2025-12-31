package _5_Ficheros_ejercicio_01_File;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        try {
            File carpeta = new File("Carperta");                // CREO UN OBJETO File en JAVA CON LA RUTA DE UNA CARPETA
            File fichero = new File(carpeta, "example.txt"); // CREO UN OBJETO File en JAVA CON LA RUTA DE UN ARCHIVO

            carpeta.mkdir();            // CREO FISICAMENTE LA CARPETA
            fichero.createNewFile();    // CREO FISICAMENTE EL FICHERO

            // COMPRUEBO LA EXISTENCIA DE LA CARPETA Y EL ARCHIVO
            System.out.println("¿Existe la carpeta: " + carpeta.getName() + " ? " + carpeta.exists());
            System.out.println("¿Existe el fichero: " + fichero.getName() + " ? " + fichero.exists());

            // TAMAÑO DEL ARCHIVO EN BYTES
            System.out.println("El fichero ocupa: " + fichero.length() + "bytes");

            // LISTADO DE LOS ARCHIVOS EXISTENTES DENTRO DE LA CARPETA
            System.out.println("FICHEROS DENTRO DE: " + carpeta.getName());
            for (String nombreFichero : carpeta.list()) {
                File ficheroAux = new File(carpeta, nombreFichero);
                if (ficheroAux.isFile()) {
                    System.out.println(nombreFichero);
                }
            }

            // BORRAR
            //fichero.delete();
            //carpeta.delete(); // solo se pueden borrar directorios que estan vacios
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

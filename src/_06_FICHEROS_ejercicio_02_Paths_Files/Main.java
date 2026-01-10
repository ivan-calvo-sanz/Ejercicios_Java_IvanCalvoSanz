package _06_FICHEROS_ejercicio_02_Paths_Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        try {
            // Paths es una interface por lo tanto mediante el metodo get
            Path carpeta = Paths.get("Carpeta");                                // CREO UN OBJETO Path a traves de la Interface Paths para una carpeta
            Path fichero = Paths.get(carpeta.toString(), "example.txt");    // CREO UN OBJETO Path a traves de la Interface Paths para un archivo

            Files.createDirectories(carpeta);    // CREO FISICAMENTE LA CARPETA
            Files.createFile(fichero);          // CREO FISICAMENTE EL FICHERO

            // COMPRUEBO LA EXISTENCIA DE LA CARPETA Y EL ARCHIVO
            System.out.println("¿Existe el directorio " + carpeta.toString() + " ? " + Files.exists(carpeta));
            System.out.println("¿Existe el fichero " + fichero.toString() + " ? " + Files.exists(fichero));

            // TAMAÑO DEL ARCHIVO EN BYTES
            System.out.println("Bytes del fichero " + Files.size(fichero));

            // LISTADO DE LOS ARCHIVOS EXISTENTES DENTRO DE LA CARPETA
            for (Path path : Files.newDirectoryStream(carpeta)) {
                if (Files.isRegularFile(path)) {
                    System.out.println(path.getFileName().toString());
                }
            }

            // BORRAR
            //Files.delete(fichero);
            //Files.delete(carpeta);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

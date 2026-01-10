package _06_FICHEROS_ejercicio_03_Paths_Files;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        try {
            // Paths es una interface por lo tanto mediante el metodo get
            Path carpeta = Paths.get("pruebas");
            if (Files.exists(carpeta)) {
                // PARA BORRAR LOS DATOS DE FORMA RECURSIVA
                Files.walkFileTree(carpeta, new SimpleFileVisitor<Path>() {
                    @Override
                    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                        Files.delete(file);
                        return FileVisitResult.CONTINUE;
                    }

                    @Override
                    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                        Files.delete(dir);
                        return FileVisitResult.CONTINUE;
                    }
                });
                System.out.println("Directorio borrado");
            }

            // CREO LA CARPETA
            Files.createDirectory(carpeta);
            System.out.println("Directorio creado");

            // CREO LOS FICHEROS
            for (int i = 1; i <= 10; i++) {
                Path fichero = Paths.get(carpeta.toString(), "file-" + i + ".txt");
                Files.createFile(fichero);
            }
            System.out.println("FICHEROS CREADOS");

            // LISTAR FICHEROS
            for (Path path : Files.newDirectoryStream(carpeta)) {
                System.out.println(path.getFileName().toString());
            }

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

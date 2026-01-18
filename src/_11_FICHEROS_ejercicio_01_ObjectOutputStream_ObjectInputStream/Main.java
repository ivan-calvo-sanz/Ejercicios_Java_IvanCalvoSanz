package _11_FICHEROS_ejercicio_01_ObjectOutputStream_ObjectInputStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        sn.useLocale(Locale.US);
        boolean salir = false;
        int opcion;

        Path ruta = Paths.get("D:\\00_ICALVO_ESCRITORIO\\ICSProgramacion\\0_Java\\0_Ejercicios_Java_CalvoSanzIvan\\00_PRUEBAS\\productos.ser");

        while (!salir) {
            try {
                System.out.println("1.Guardar Producto");
                System.out.println("2.Mostrar Productos");
                System.out.println("3.Borrar fichero");
                System.out.println("4.Salir");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Introduce ID:");
                        int id = sn.nextInt();
                        System.out.println("Introduce un nombre:");
                        String nombre = sn.next();
                        System.out.println("Introduce un precio:");
                        float precio = sn.nextFloat();

                        Producto producto = new Producto(id, nombre, precio);
                        guardarProducto(ruta, producto);
                        break;
                    }
                    case 2 -> {
                        mostrarProductos(ruta);
                        break;
                    }
                    case 3 -> {
                        borrarFichero(ruta);
                        break;
                    }
                    case 4 -> {
                        System.out.println("HA SALIDO DE LA APLICACION");
                        salir = true;
                    }
                    default -> {
                        System.out.println("Debes escribir un numero entre 1 y 4");
                    }
                }
            } catch (InputMismatchException e) {
                sn.next();
                System.out.println("Debes introducir un numero.");
            }
        }
    }

    public static void guardarProducto(Path path, Producto producto) {
        if (!Files.exists(path)) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path.toString()))) {
                // Aqui estamos utilizando ObjectOutputStream por lo tanto nos crea la cabecera en el archivo, ya no podemos crear nuevas cabeceras en ese archivo o nos dara error al leerlo
                oos.writeObject(producto);   // SERIALIZACIÓN
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (MyObjectOutputStream oos = new MyObjectOutputStream(new FileOutputStream(path.toString(), true))) {
                // Aqui utilizo MyObjectOutputStream que NO crea nueva cabecera en el archivo
                oos.writeObject(producto);   // SERIALIZACIÓN
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void mostrarProductos(Path path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path.toString()))) {
            while (true) {
                Producto p = (Producto) ois.readObject();
                System.out.println(p);
            }
        } catch (EOFException ex) {
            // Fin del archivo: salida normal del bucle
            // System.out.println("Se lanza la excepcion EOFException cuando se terminado de leer");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void borrarFichero(Path path) {
        try {
            Files.delete(path);
            System.out.println("Se ha borrado el fichero");

        } catch (IOException ex) {
            Logger.getLogger(Main.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

}

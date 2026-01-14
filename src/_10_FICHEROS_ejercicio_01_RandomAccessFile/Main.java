package _10_FICHEROS_ejercicio_01_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {

        sn.useDelimiter("\n");
        sn.useLocale(Locale.US);
        boolean salir = false;
        int opcion;

        // ============================================================
        // DEFINICIÓN DEL TAMAÑO DEL REGISTRO (FIJO)
        // ============================================================
        final int NOMBRE_CHARS = 20;       // 20 chars -> 40 bytes
        final int saltoBytes = Integer.BYTES + (NOMBRE_CHARS + Character.BYTES) + Float.BYTES + 1;  // ID(Integer)+Nombre(Chars*2)+Precio(Float)+Descuento(Boolean)

        Path path = Paths.get("D:\\00_ICALVO_ESCRITORIO\\ICSProgramacion\\0_Java\\0_Ejercicios_Java_CalvoSanzIvan\\00_PRUEBAS\\productos.dat");

        while (!salir) {
            try {
                System.out.println("1.Crear Producto");
                System.out.println("2.Buscar Producto");
                System.out.println("3.Mostrar Productos");
                System.out.println("4.Salir");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1 -> {
                        crearProducto(path, saltoBytes);
                        break;
                    }
                    case 2 -> {
                        System.out.println("Introduce el ID del producto:");
                        int idBuscado = sn.nextInt();
                        buscarProducto(path, saltoBytes, idBuscado);
                        break;
                    }
                    case 3 -> {
                        mostrarProductos(path);
                        break;
                    }
                    case 4 -> {
                        System.out.println("HA SALIDO DE LA APLICACION");
                        salir = true;
                        break;
                    }
                    default -> {
                        System.out.println("Debes escribir un numero entre 1 y 4");
                    }
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void crearProducto(Path path, int saltoBytes) throws IOException {
        sn.useDelimiter("\n");
        sn.useLocale(Locale.US);

        int ultimoID = ultimoID(path, saltoBytes);

        System.out.println("Introduce el nombre del producto:");
        String nombre = sn.next();

        System.out.println("Introduce el precio del produto:");
        float precio = sn.nextFloat();

        System.out.println("Introduce si tiene descuento o no (TRUE/FALSE):");
        boolean descuento = sn.nextBoolean();

        try (RandomAccessFile raf = new RandomAccessFile(path.toString(), "rw")) {
            raf.seek(raf.length());
            raf.writeInt(ultimoID + 1);
            raf.writeUTF(String.format("%-20.20s", nombre));
            raf.writeFloat(precio);
            raf.writeBoolean(descuento);
        }
    }

    public static void buscarProducto(Path path, int saltoBytes, int idBuscado) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(path.toString(), "rw")) {
            long posicion = saltoBytes * (idBuscado - 1);
            if (posicion >= 0 && posicion < Files.size(path)) {
                raf.seek(posicion);
                System.out.println("ID: " + raf.readInt());
                System.out.println("Nombre: " + raf.readUTF());
                System.out.println("Precio: " + raf.readFloat());
                System.out.println("¿Descuento?: " + raf.readBoolean());
            } else {
                System.out.println("El registro Buscado NO existe en el archivo");
            }
        }
    }

    public static void mostrarProductos(Path path) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(path.toString(), "rw")) {
            while (raf.getFilePointer() < raf.length()) {
                System.out.println("ID: " + raf.readInt());
                System.out.println("Nombre: " + raf.readUTF());
                System.out.println("Precio: " + raf.readFloat());
                System.out.println("¿Descuento?: " + raf.readBoolean());
            }
        }
    }

    public static int ultimoID(Path path, int saltoBytes) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(path.toString(), "rw")) {
            if (!Files.exists(path) || Files.size(path) == 0) {
                return 0;
            } else {
                System.out.println("entra");
                raf.seek(Files.size(path) - saltoBytes);
                System.out.println("sale");
                return raf.readInt();
            }
        }
    }

}

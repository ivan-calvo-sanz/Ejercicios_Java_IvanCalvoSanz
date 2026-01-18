package _000_Plantillas;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class _000_Menu_Basico {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        sn.useLocale(Locale.US);
        boolean salir = false;
        int opcion;

        while (!salir) {
            try {
                System.out.println("1.Guardar Producto");
                System.out.println("2.Mostrar Productos");
                System.out.println("3.Borrar fichero");
                System.out.println("4.Salir");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1 -> {
                        guardarProducto();
                        break;
                    }
                    case 2 -> {
                        mostrarProductos();
                        break;
                    }
                    case 3 -> {
                        borrarFichero();
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

    public static void guardarProducto() {
    }

    public static void mostrarProductos() {
    }

    public static void borrarFichero() {
    }
}

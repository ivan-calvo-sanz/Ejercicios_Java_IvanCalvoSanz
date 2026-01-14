package _000_Plantillas;

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
            System.out.println("1.Crear Producto");
            System.out.println("2.Buscar Producto");
            System.out.println("3.Mostrar Productos");
            System.out.println("4.Salir");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1 -> {

                    break;
                }
                case 2 -> {

                    break;
                }
                case 3 -> {

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
        }
    }

}

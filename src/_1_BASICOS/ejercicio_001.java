package _1_BASICOS;

import java.util.Scanner;

/**
 * Ejercicio 01
 * https://www.youtube.com/watch?v=IVIAZN561LU&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=51
 *
 * @author ivanc
 *
 * Leer una cantidad "N" y luego introducir "N" numeros enteros Se pide imprimir
 * el mayor y el menor y las veces que aparece cada uno.
 *
 * Ejemplo para entrada N=5 ---3,3,8,1,8 Salida: El mnimo es 1 y aparece 1 vez
 * El máximo es 8 y aparece 2 veces
 *
 */

public class ejercicio_001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros que quiere añadir: ");
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, cantidadMax = 0, cantidadMin = 0, num = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Introduce numero: ");
            num = sc.nextInt();

            //numevo maximo
            if (num > max) {
                max = num;
                cantidadMax = 1;
                //mismo maximo
            } else if (num == max) {
                cantidadMax++;
                //nuevo minimo
            } else if (num < min) {
                min = num;
                cantidadMin = 1;
                //mismo minimo
            } else if (num == min) {
                cantidadMin++;
            }
        }

        sc.close();

        System.out.println("El mnimo es " + min + " y aparece " + cantidadMin + (cantidadMin == 1 ? " vez" : " veces"));
        System.out.println("El máximo es " + max + " y aparece " + cantidadMax + (cantidadMax == 1 ? " vez" : " veces"));
    }

}

package _1_BASICOS;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ejercicio 14
 * https://www.youtube.com/watch?v=QIdiaJcDBHI&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=68
 *
 * @author ivanc
 */
/**
 * 1- Crea un metodo que dado un Array de enteros y un valor entero, muestre la
 * cantidad de veces que aparec el entero
 */
/**
 * 2-Crea un metodo que reciba un array de Strings y muestre la String mas larga
 */
/**
 * 3-Crea un metodo que recba un Array de String y un char. Deberá mostrar todas
 * las Strings cuya primera letra sea el char
 */
/**
 * 4-Crea un metodo que reciba dos Arrays como parametros, y devuelva un array
 * con los valores maximo en cada una de las posiciones. los arrays ppodrán ser
 * de tamaños diferentes
 */
public class ejercicio_011_Array {

    public static void main(String[] args) {
        int[] array = {5, 8, 9, 10, 8, 8, 8};
        int n = 8;
        System.out.println(ejercicio1(array, n));

        String[] array2 = {"a", "abc", "ab", "ebcdefgh", "ebcdefgha"};
        System.out.println(ejercicio2(array2));

        ejercicio3(array2, 'a');

        int[] array41 = {11, 22, 3, 4, 5};
        int[] array42 = {10, 20, 30, 40, 50, 60};
        int[] arrayMayoresElementos = ejercicio4(array41, array42);

        //int[] copia42 = Arrays.copyOf(array42, array42.length);
        for (int i = 0; i < arrayMayoresElementos.length; i++) {
            System.out.println(arrayMayoresElementos[i]);
        }
    }

    static int ejercicio1(int[] array, int n) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                contador++;
            }
        }
        return contador;
    }

    static String ejercicio2(String[] array) {
        String devuelve = "";
        int caracteresMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > caracteresMax) {
                devuelve = array[i];
                caracteresMax = array[i].length();
            }
        }
        return devuelve;
    }

    static void ejercicio3(String[] array, char letra) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0) == letra) {
                System.out.println(array[i]);
            }
        }
    }

    static int[] ejercicio4(int[] a1, int[] a2) {
        int[] arrayMayorLong, arrayMenorLong;
        if (a1.length > a2.length) {
            arrayMayorLong = Arrays.copyOf(a1, a1.length);
            arrayMenorLong = Arrays.copyOf(a2, a2.length);
        } else {
            arrayMayorLong = Arrays.copyOf(a2, a2.length);
            arrayMenorLong = Arrays.copyOf(a1, a1.length);
        }

        int[] devuelve = new int[arrayMayorLong.length];

        for (int i = 0; i < arrayMayorLong.length; i++) {
            if (i < arrayMenorLong.length && arrayMenorLong[i] > arrayMayorLong[i]) {
                devuelve[i] = arrayMenorLong[i];
            } else {
                devuelve[i] = arrayMayorLong[i];
            }
        }
        return devuelve;
    }

}

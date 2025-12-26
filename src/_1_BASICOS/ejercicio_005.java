package _1_BASICOS;

import java.util.Scanner;

/**
 * Ejercicio 05
 * https://www.youtube.com/watch?v=D5rLwK2a0H4&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=52
 *
 * @author ivanc
 *
 * Programa que recibe 5 palabras y luego nos muestre la que tiene una longitud
 * mayor. Si hay más de una palabra con la longitud mayor, se deberá mostrar la
 * primera que aparezca.
 *
 * Ejemplo para entrada: casa, mesa, ab, c, Ana Salida: casa
 */
public class ejercicio_005 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palabra = "", palabraMax = "";

        for (int i = 0; i < 5; i++) {
            System.out.println("Inserta palabra " + (i + 1) + " de 5: ");

            palabra = sc.nextLine();
            if (palabra.length() > palabraMax.length()) {
                palabraMax = palabra;
            }
        }

        sc.close();
        System.out.println("Salida: " + palabraMax);
    }
}

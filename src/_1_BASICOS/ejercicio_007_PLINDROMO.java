package _1_BASICOS;

import java.util.Scanner;

/**
 * Ejercicio 07
 * https://www.youtube.com/watch?v=D5rLwK2a0H4&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=52
 *
 * @author ivanc
 *
 * PALINDROMO Recibe una palabra por teclado e indica si es un palindromo
 * Palindromo es una palabra que se lee igual de derecha a izquierda, que de
 * izquierda a derecha
 *
 * ejemplo Entrada: [reconocer] Salida: [es un palindromo]
 *
 *
 */
public class ejercicio_007_PLINDROMO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la palabra: ");
        String palabra = sc.nextLine().toLowerCase();
        boolean palindromo = true;
        int i = 0;

        do {
            if (palabra.charAt(i) == palabra.charAt(palabra.length() - i - 1)) {
                i++;
            } else {
                palindromo = false;
            }
        } while (palindromo && (i < palabra.length() - 1));

        sc.close();
        System.out.println((palindromo ? "es un palindromo" : "NO es un palindromo"));
    }
}

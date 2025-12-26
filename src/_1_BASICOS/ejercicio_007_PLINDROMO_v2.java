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
public class ejercicio_007_PLINDROMO_v2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la palabra: ");
        String palabra = sc.nextLine().toLowerCase();
        boolean palindromo = true;

        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                palindromo = false;
                break;
            }
        }

        sc.close();
        System.out.println((palindromo ? "es un palindromo" : "NO es un palindromo"));
    }
}

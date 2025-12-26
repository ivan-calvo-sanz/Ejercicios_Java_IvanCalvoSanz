package _1_BASICOS;

import java.util.Scanner;

/**
 * Ejercicio 08
 * https://www.youtube.com/watch?v=D5rLwK2a0H4&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=52
 *
 * @author ivanc
 *
 * Programa que dibuje un rectangulo formado por asteriscos (*) Se deben pedir
 * base y altura por teclado Además, añade codigo adicional para que dibuje
 * dicho rectangulo son relleno
 *
 * Ejemplo Entrada: base=10,altura=5
 *
 *
 */
public class ejercicio_008 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        int base = sc.nextInt();
        System.out.println("Introduce la altura: ");
        int altura = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == (altura - 1) || j == 0 || j == (base - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}

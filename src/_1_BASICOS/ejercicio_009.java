package _1_BASICOS;

import java.util.Scanner;

/**
 * Ejercicio 09
 * https://www.youtube.com/watch?v=D5rLwK2a0H4&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=52
 *
 * @author ivanc
 *
 * Programa que dibuje un triangulo rectangulo formado por asteriscos (*) Se
 * deben pedir la altura del triangulo por teclado Añade el código adicional
 * para que dibuje dicho triangulo sin relleno
 *
 * Ejemplo de entrada: altura=5
 *
 *    *
 *    * *
 *    * * *
 *    * * * *
 *    * * * * *
 *
 */
public class ejercicio_009 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura del triangulo");
        int altura = sc.nextInt();

        //TRIANGULO CON RELLENO
        System.out.println("TRIANGULO CON RELLENO");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        //TRIANGULO SIN RELLENO
        System.out.println("TRIANGULO SIN RELLENO");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}

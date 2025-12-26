package _1_BASICOS;

import java.util.Scanner;

/**
 * Ejercicio 10
 * https://www.youtube.com/watch?v=D5rLwK2a0H4&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=52
 *
 * @author ivanc
 *
 * Programa que dibuje un triangulo equilatero formado por asteriscos. Se deben
 * pedir altura del triangulo por teclado Crear codigo adicional que dibuje
 * dicho triangulo sin relleno
 *
 * Ejemplo Entrada: 5 Salida:
 *
 * ----*---- ---***--- --*****-- -*******- ********
 *
 * ----*---- ---*-*--- --*---*-- -*-----*- *********
 *
 */
public class ejercicio_010 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura del triangulo");
        int altura = sc.nextInt();
        int base = altura * 2 - 1;

        //TRIANGULO EQUILATERO CON RELLENO
        System.out.println("TRIANGULO EQUILATERO CON RELLENO");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                // altura - 1 (es la posición central del triangulo)
                if (j >= altura - 1 - i && j <= altura - 1 + i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        //TRIANGULO EQUILATERO SIN RELLENO
        System.out.println("TRIANGULO EQUILATERO SIN RELLENO");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura * 2 - 1; j++) {
                // altura - 1 (es la posición central del triangulo)
                if (j == altura - 1 - i || j == altura - 1 + i || i == altura - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}

package _1_BASICOS;

import java.util.Scanner;

/**
 * Ejercicio 02
 * https://www.youtube.com/watch?v=IVIAZN561LU&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=51
 *
 * @author ivanc
 *
 * Dado un numero positivo, determinar cuantos digitos tiene. No se pueden
 * utilizar ni variables, ni funciones de tipo String
 *
 * Ejemplo para entrada: 12343 Salida: El numero introducido tiene 5 cifras
 *
 */
public class ejercicio_002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero:");
        int num = sc.nextInt();

        int cifras = 1;

        if (num < 0) {
            System.out.println("NO se pueden introducir numeros negativos. El programa ha finalizado");
        } else {
            while (num > 9) {
                num = num / 10;
                cifras++;
            }
            System.out.println("El numero introducido tiene: " + cifras + (cifras > 1 ? " cifras" : " cifra"));
            sc.close();
        }
    }

}

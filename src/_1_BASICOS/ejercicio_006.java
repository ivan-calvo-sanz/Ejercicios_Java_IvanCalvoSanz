package _1_BASICOS;

import java.util.Scanner;

/**
 * Ejercicio 06
 * https://www.youtube.com/watch?v=D5rLwK2a0H4&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=52
 *
 * @author ivanc
 *
 * Programa que lea una cadena de texto e indique la cantidad de palabras que
 * tiene De la clase String, unicamente se pueden utilizar los metodos charAt(),
 * trim() y length()
 *
 * Ejemplo de entrada: [ Hoy es viernes, 27 de octubre de 2022 ] Salida: La
 * frase tiene 8 palabras
 */
public class ejercicio_006 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la frase: ");

        String frase = sc.nextLine().trim();
        int palabras = 1;

        for (int i = 0; i < frase.length() - 1; i++) {
            if (frase.charAt(i) == ' ' && frase.charAt(i + 1) != ' ') {
                palabras++;
            }
        }

        sc.close();
        if (frase.equals("")) {
            System.out.println("La frase no tiene ninguna palabra");
        } else {
            System.out.println("La frase tiene " + palabras + " palabra" + (palabras > 1 ? "s." : "."));
        }
    }
}

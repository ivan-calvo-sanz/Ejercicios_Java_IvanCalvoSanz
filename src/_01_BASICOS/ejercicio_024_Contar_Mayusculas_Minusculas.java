package _01_BASICOS;

import java.util.Scanner;

/*
Pide una frase por teclado y cuenta cuantas mayúsculas y minúsculas hay.
 */
public class ejercicio_024_Contar_Mayusculas_Minusculas {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        System.out.println("Introduce una frase: ");
        String frase = sn.next();
        int contMayusculas = 0, contMinusculas = 0, letra;

        for (int i = 0; i < frase.length(); i++) {
            letra = (int) frase.charAt(i);
            if (letra >= 'A' && letra <= 'Z') {
                contMayusculas++;
            } else if (letra >= 'a' && letra <= 'z') {
                contMinusculas++;
            }
        }
        System.out.println("La frase: " + frase + " tiene " + contMayusculas + " MAYUSCULAS y " + contMinusculas + " minusculas.");
    }
}

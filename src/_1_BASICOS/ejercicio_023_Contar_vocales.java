package _1_BASICOS;

import java.util.Locale;
import java.util.Scanner;

/*
Pide una frase por teclado y cuenta cuentas vocales tiene.
 */
public class ejercicio_023_Contar_vocales {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useLocale(Locale.US);
        sn.useDelimiter("\n");
        System.out.println("Escibe la frase: ");
        String frase = sn.next().toLowerCase();

        int contador = 0;
        char caracter;
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            switch (caracter) {
                case 'a', 'e', 'i', 'o', 'u' ->
                    contador++;
            }
        }
        System.out.println("La frase: " + frase + " tiene " + contador + " vocales");
    }
}

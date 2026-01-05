package _01_BASICOS;

import java.util.Scanner;

/*
Pide una frase por teclado, elimina los espacios y guardarlos en otra variable.
 */
public class ejercicio_025_Eliminar_espacios {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        System.out.println("Escriba la frase:");
        String frase = sn.next();
        String fraseSinEspacios = "";
        char caracter;

        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            if (caracter != ' ') {
                fraseSinEspacios += caracter;
            }
        }
        System.out.println("La frase sin espacios es: " + fraseSinEspacios);
    }
}

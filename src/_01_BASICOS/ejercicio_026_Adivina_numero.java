package _01_BASICOS;

import java.util.Scanner;

/*
Dado un numero generado aleatorio entre 1 y 100 (incluidos) pide al usuario que lo adivine dándole pistas diciéndole si es mayor o menor. 
El usuario solo tiene 5 intentos. Si se acaban los intentos o se acierta el numero, el juego se acaba.
 */
public class ejercicio_026_Adivina_numero {

    public static void main(String[] args) {

        int numeroAAdivinar, numeroUsuario, intentos = 0;
        boolean acertado = false;
        numeroAAdivinar = generaNumeroAleatorio(1, 100);
        System.out.println("numero aleatorio: " + numeroAAdivinar);

        Scanner sn = new Scanner(System.in);
        do {
            System.out.println("Llevas " + intentos + " intentos.");
            System.out.println("Introduce numero: ");
            numeroUsuario = sn.nextInt();
            if (numeroUsuario == numeroAAdivinar) {
                acertado = true;
                System.out.println("HAS ACERTADO!!!");
                break;
            } else if (numeroUsuario < numeroAAdivinar) {
                System.out.println("El numero es mayor");
            } else {
                System.out.println("El numero es menor");
            }
            intentos++;
            if (intentos == 5) {
                System.out.println("Se acabaron los intentos");
            }
        } while (!acertado && intentos < 5);

    }

    /**
     * 02-Genera un numero aleatorio entre dos valores
     */
    public static int generaNumeroAleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }
}

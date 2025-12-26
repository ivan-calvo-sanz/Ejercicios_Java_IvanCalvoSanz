package _1_BASICOS;

import java.util.Scanner;

/*
Crea una función que genere un password de una longitud con números, letras mayúsculas y letras minúsculas combinadas.
 */
public class ejercicio_028_Genera_Password {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Introduce la longitud de tu password");
        int longuitud = sn.nextInt();

        String password = generaPassword(longuitud);
        System.out.println("La contraseña es: " + password);
    }

    /**
     * 02-Genera un numero aleatorio entre dos valores
     */
    public static int generaNumeroAleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }

    public static String generaPassword(int longitud) {
        String password = "";
        int tipo;
        char caracter = ' ';
        for (int i = 0; i < longitud; i++) {
            tipo = generaNumeroAleatorio(1, 3);
            switch (tipo) {
                case 1 ->
                    caracter = (char) generaNumeroAleatorio('0', '9');
                case 2 ->
                    caracter = (char) generaNumeroAleatorio('a', 'z');
                case 3 ->
                    caracter = (char) generaNumeroAleatorio('A', 'Z');
            }
            password = password + caracter;
        }
        return password;
    }
}

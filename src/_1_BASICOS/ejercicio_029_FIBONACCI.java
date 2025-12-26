package _1_BASICOS;

import java.util.Scanner;

/*
Crea una función dado un parámetro obtenga el numero de la serie fibonacci. 
La serie fibonacci, empieza en 1 1 y el siguiente se obtiene sumando los dos anteriores. 
Por ejemplo, 1 1 2 3 5 8 13 21 34 55 ... Valida que la posición es mayor o igual que 1.
 */
public class ejercicio_029_FIBONACCI {

    public static void main(String[] args) {

        int posicion;
        Scanner sn = new Scanner(System.in);
        do {
            System.out.println("Introduce la posición: ");
            posicion = sn.nextInt();
            if (posicion < 1) {
                System.out.println("Debes introducir un numero mayor que 0");
            }
        } while (posicion < 1);

        String serieFIBONACCI = serieFibonacci(posicion);
        System.out.println("La serie FIBONACCI es: " + serieFIBONACCI);
    }

    public static String serieFibonacci(int posicion) {
        String serie = "1 1 ";
        int num2 = 1, num1 = 1, suma;
        for (int i = 0; i < posicion - 2; i++) {
            suma = num1 + num2;
            serie += suma + " ";
            num2 = num1;
            num1 = suma;
        }
        return serie;
    }
}

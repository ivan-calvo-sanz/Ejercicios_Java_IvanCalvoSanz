package _1_BASICOS;

import java.util.Scanner;

/*
Pide un numero por teclado y saca su factorial. 
El factorial se obtiene de multiplicar los números de n a 1. 
Por ejemplo, 5!=5*4*3*2*1=120
 */
public class ejercicio_027_Factorial {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Introduce el numero:");
        int num = sn.nextInt();

        System.out.println("El factorial de: " + num + " es= " + factorial(num));
    }

    static int factorial(int n) {
        int factorial = n;
        for (int i = n - 1; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }
}

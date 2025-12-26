package _1_BASICOS;

import java.util.Scanner;

/*
Pide dos números por teclado e indica si el segundo es divisible por el primero 
Por ejemplo, si numero1 = 10 y numero2 = 5 debería mostrar: "El numero 5 es divisible de 10"
 */
public class ejercicio_019 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int num1 = sn.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int num2 = sn.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("El numero: " + num2 + " es divisible de: " + num1);
        } else {
            System.out.println("El numero: " + num2 + " NO es divisible de: " + num1);
        }
    }
}

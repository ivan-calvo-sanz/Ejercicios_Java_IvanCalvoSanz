package _1_BASICOS;

import java.util.Scanner;

/*
Pide un numero por teclado y muestra su tabla de multiplicar hasta 10.
 */
public class ejercicio_022_Tabla_Multiplicar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de la Tabla que quieres realizar:");
        int numTabla = sc.nextInt();
        int resultado;
        
        for (int i = 0; i <= 10; i++) {
            resultado=numTabla * i;
            System.out.println(numTabla + "*" + i + "=" + resultado);
        }
    }
}

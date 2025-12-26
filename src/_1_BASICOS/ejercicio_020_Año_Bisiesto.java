package _1_BASICOS;

import java.util.Scanner;

/*
Pide un año por teclado e indica si es bisiesto o no. 
Un año es bisiesto cuando es divisible entre 4 y no divisible por 100 o es divisible por 400.

ejemplos:
2004 es Bisiesto
2000 es Bisiesto
1900 NO es Bisiesto
 */
public class ejercicio_020_Año_Bisiesto {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Introduce el año:");
        int anio = sn.nextInt();

        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            System.out.println("Año " + anio + " es Bisiesto");
        } else {
            System.out.println("Año " + anio + " NO es Bisiesto");
        }
    }
}

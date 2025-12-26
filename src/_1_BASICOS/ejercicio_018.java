package _1_BASICOS;

import java.util.Locale;
import java.util.Scanner;

/*
Pide el precio de un producto sin IVA y calcula su precio con IVA. 
El IVA es del 21%. 
Formatea el resultado para que se muestre con dos decimales.
 */
public class ejercicio_018 {

    public static void main(String[] args) {

        final double IVA = 1.21;
        Scanner sn = new Scanner(System.in);
        sn.useLocale(Locale.US);
        System.out.println("Introduce el precio sin IVA: ");
        double precio = sn.nextDouble();
        double precioConIVA = precio * IVA;

        System.out.printf("El precio final es %.2f €", precioConIVA);
    }
}

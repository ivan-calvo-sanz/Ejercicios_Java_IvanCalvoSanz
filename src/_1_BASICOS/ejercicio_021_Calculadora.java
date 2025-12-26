package _1_BASICOS;

import java.util.Locale;
import java.util.Scanner;

/*
Pide 2 operandos, un operador (+ - * /) y realiza la operación correspondiente. 
Si el operador es invalido o el 2º operando es 0 en el caso de la división, debes indicar que no se puede realizar la operación.
 */
public class ejercicio_021_Calculadora {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useLocale(Locale.US);
        sn.useDelimiter("\n");

        System.out.println("Introduce el primer operando:");
        double operando1 = sn.nextDouble();
        System.out.println("Introduce el operador (+ - * /):");
        String operador = sn.next();
        System.out.println("Introduce el segundo operando:");
        double operando2 = sn.nextDouble();
        double resultado=0;
        boolean correcto = true;

        switch (operador) {
            case "+" ->
                resultado = operando1 + operando2;
            case "-" ->
                resultado = operando1 - operando2;
            case "*" ->
                resultado = operando1 * operando2;
            case "/" -> {
                if (operando2 != 0) {
                    resultado = operando1 / operando2;
                } else {
                    System.out.println("No se puede dividir entre 0");
                    correcto = false;
                }
            }
            default -> {
                System.out.println("El operador no es correcto");
                correcto = false;
            }
        }
        if (correcto) {
            System.out.println("El resultado de " + operando1 + " " + operador + " " + operando2 + " = " + resultado);
        }
    }
}

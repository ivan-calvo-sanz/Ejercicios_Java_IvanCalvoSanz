package _1_BASICOS;

import java.util.Scanner;

/**
 * Ejercicio 04
 * https://www.youtube.com/watch?v=IVIAZN561LU&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=51
 *
 * @author ivanc
 *
 * Dada una secuencia de numeos enteros positivos acabada en 0 Obtener la suma
 * de aquellos numeros tales que su numero de cifras sea igual a la suma de las
 * mismas No se puede utilizar Arrays
 *
 * Ejemplo de entrada: 1, -111, 5, 111, 66, 201, 27, 0 Salida: 1+111+201=313
 *
 */
public class ejercicio_004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los numeos, pulsa 0 para finalizar");
        int num, sumaTotal = 0;
        String textoSuma = "";

        do {
            System.out.println("Introduce numero: ");
            num = sc.nextInt();

            if (num > 0) {
                int sumParcial = 0;
                int numParcial = num;
                int i = 0;
                while (numParcial >= 1) {
                    sumParcial += numParcial % 10;
                    numParcial /= 10;
                    i++;
                }
                if (sumParcial == i) {
                    sumaTotal += num;
                    textoSuma += num + "+";
                }
            }
        } while (num != 0);

        sc.close();
        System.out.println("Salida: " + textoSuma + "\b=" + sumaTotal);
    }
}

package _1_BASICOS;

import java.util.Scanner;

/**
 * Ejercicio 03
 * https://www.youtube.com/watch?v=IVIAZN561LU&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=51
 *
 * @author ivanc
 *
 * Escribir numeros enteros positivos hasta que se introduzca un cero Debe
 * mostrar la suma total de dichos numeros Se deben incluir todos los numeos
 * positivos que hemos introducido por teclado No se pueden utilizar arrays
 *
 * Ejemplo para entrada: 3,4,5,6,-2,8,0 Salida: 3+4+5+6+8=26
 *
 */
public class ejercicio_003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe los numeros deseados. Pulsa 0 paa salir");

        int num, suma = 0;
        String textoSuma = "";
        do {
            System.out.println("Introduce el numero: ");
            num = sc.nextInt();
            if (num > 0) {
                suma += num;
                textoSuma += num + "+";
            }

        } while (num != 0);

        sc.close();
        // \b caracter Scape que retrocede sobre el String un caracter
        System.out.println("RESULTADO: " + textoSuma + "\b=" + suma);
    }

}

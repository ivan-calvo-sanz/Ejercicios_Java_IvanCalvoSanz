package _1_BASICOS;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ejercicio 15
 * https://www.youtube.com/watch?v=TuoUO2Nd4tA&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=73
 *
 * @author ivanc
 */
/**
 * 1- Crea una matriz columnas 4 filas 4 con la diagonal con X
 */
public class ejercicio_012_Matrices {

    public static void main(String[] args) {
        imprimirMatriz_v1(crearMatriz(4));
        imprimirMatriz_v2(crearMatriz(4));
    }

    static int[][] crearMatriz(int n) {
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 88;
                } else {
                    matriz[i][j] = 45;
                }
            }
        }
        return matriz;
    }

    static void imprimirMatriz_v1(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print((char) m[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static void imprimirMatriz_v2(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print((char) m[(i)][(m.length - j - 1)] + " ");
            }
            System.out.println("");
        }
    }

}

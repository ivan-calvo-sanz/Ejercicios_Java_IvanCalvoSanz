package _1_BASICOS;

import java.util.Arrays;

/**
 * Ejercicio 17
 * https://www.youtube.com/watch?v=03CCpdROuMo&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=76
 *
 * https://symbl.cc/es/unicode-table/
 *
 * @author ivanc
 */
/**
 * 17-
 */
public class ejercicio_014_String_Bordes {

    static final char LINEA_VERTICAL = '‖';
    static final char LINEA_HORIZONTAL = '̳';
    static final char ESQUINA_SUP_IZQ = '‖';
    static final char ESQUINA_INF_IZQ = '‖';
    static final char ESQUINA_SUP_DER = '‖';
    static final char ESQUINA_INF_DER = '‖';
    static final char SEPARADOR_SUP = '‖';
    static final char SEPARADOR_INF = '‖';

    public static void main(String[] args) {

        int[][] a = {{1, 10, 1}, {2, 2, 20}, {30, 3, 3}};
        int[][] b = {{4, 4, 4}, {5, 5, 5}, {6, 6, 6}};
        int[][] c = {{1, 1}, {2}, {3, 3}};
        int[][] d = {{1, 10}, {5, 60, 8}, {30, 3}, {5}};

        int[][] z = matrizMayorElemento_3(c, d);

        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                System.out.print(z[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < args.length; i++) {
            System.out.print("Hola");
            System.out.print(args[i]);
            System.out.println(" Mundo");

        }

    }

    static int[][] matrizMayorElemento(int[][] a, int[][] b) {
        int[][] devuelve;

        if (esMismoTamañoMatrices(a, b)) {
            devuelve = new int[a.length][];
            for (int i = 0; i < a.length; i++) {
                int[] aux = new int[a[i].length];
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] > b[i][j]) {
                        aux[j] = a[i][j];
                    } else {
                        aux[j] = b[i][j];
                    }
                }
                devuelve[i] = aux;
            }
            return devuelve;
        }
        devuelve = new int[1][1];
        return devuelve;
    }

    static int[][] matrizMayorElemento_2(int[][] a, int[][] b) {
        int[][] devuelve;

        devuelve = new int[a.length][];
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                devuelve[i] = arrayValoresMax(a[i], b[i]);
            }
            return devuelve;
        }
        System.out.println("Las Matrices tienen que tener la misma cantidad de Arrays");
        devuelve = new int[1][1];
        return devuelve;
    }

    public static int[][] matrizMayorElemento_3(int[][] a, int[][] b) {
        int[][] devuelve;
        if (a.length > b.length) {
            System.out.println("entra a.length > b.length");
            devuelve = new int[a.length][];
        } else {
            System.out.println("entra else");
            devuelve = new int[b.length][];
        }
        //devuelve = new int[a.length][];
        if (a.length == b.length) {
            System.out.println("a.length == b.length");
            for (int i = 0; i < a.length; i++) {
                devuelve[i] = arrayValoresMax(a[i], b[i]);
            }
        }
        if (a.length > b.length) {
            System.out.println("a.length > b.length");
            for (int i = 0; i < b.length; i++) {
                devuelve[i] = arrayValoresMax(a[i], b[i]);
            }
            for (int i = b.length; i < a.length; i++) {
                devuelve[i] = Arrays.copyOf(a[i], a[i].length);
            }
        }
        if (b.length > a.length) {
            System.out.println("b.length > a.length");
            for (int i = 0; i < a.length; i++) {
                devuelve[i] = arrayValoresMax(a[i], b[i]);
                System.out.println("i=" + i);
            }
            for (int i = a.length; i < b.length; i++) {
                devuelve[i] = Arrays.copyOf(b[i], b[i].length);
            }
        }
        return devuelve;

    }

    public static boolean esMismoTamañoMatrices(int[][] a, int[][] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) {
                return false;
            }
        }
        return true;
    }

    /**
     * 20-Devuelve un array con los valores maximo de cada una de las posiciones
     * de dos arrays pasados por parametros
     */
    public static int[] arrayValoresMax(int[] a1, int[] a2) {
        int[] arrayMayorLong, arrayMenorLong;
        if (a1.length > a2.length) {
            arrayMayorLong = Arrays.copyOf(a1, a1.length);
            arrayMenorLong = Arrays.copyOf(a2, a2.length);
        } else {
            arrayMayorLong = Arrays.copyOf(a2, a2.length);
            arrayMenorLong = Arrays.copyOf(a1, a1.length);
        }

        int[] devuelve = new int[arrayMayorLong.length];

        for (int i = 0; i < arrayMayorLong.length; i++) {
            if (i < arrayMenorLong.length && arrayMenorLong[i] > arrayMayorLong[i]) {
                devuelve[i] = arrayMenorLong[i];
            } else {
                devuelve[i] = arrayMayorLong[i];
            }
        }
        return devuelve;
    }

}

package _20_POO_ejercicio_09_Alumnos_Profesores;

public class MetodosSueltos {

    /**
     * 02-Genera un numero aleatorio entre dos valores
     */
    public static int generaNumeroAleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }

}



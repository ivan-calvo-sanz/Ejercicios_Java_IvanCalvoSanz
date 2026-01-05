package _01_BASICOS_ENUMERADOS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio_001 {

    // https://www.youtube.com/watch?v=VNHTcdlRL7M 
    /**
     * Crea un enumerado con todos los meses del año. Dado un mes, indica el numero de días que tiene. En el caso de
     * febrero, pediremos el año, ya que si el año es bisiesto tendrá 29 días sino tendrá 28 días. Debes validar si se
     * inserta un mes valido o si se inserta los datos correctos. Los meses que tienen 31 días son: Enero, Marzo, Mayo,
     * Julio, Agosto, Octubre y Diciembre. Los meses que tienen 30 días son: Abril, Junio, Septiembre y Noviembre.
     */
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");

        try {
            System.out.println("Introduce el mes a comprobar:");
            for (Meses m : Meses.values()) {
                System.out.println(m.name().toLowerCase());
            }
            Meses mes = Meses.valueOf(sn.next().toUpperCase());

            int numDias = 0;
            switch (mes) {
                case ENERO, MARZO, MAYO, JULIO, AGOSTO, OCTUBRE, DICIEMBRE:
                    numDias = 31;
                    break;
                case ABRIL, JUNIO, SEPTIEMBRE, NOVIEMBRE:
                    numDias = 30;
                    break;
                case FEBRERO:
                    System.out.println("De que año?:");
                    int anio = sn.nextInt();
                    if (esBisiesto(anio)) {
                        numDias = 29;
                    } else {
                        numDias = 28;
                    }
                    break;
            }
            System.out.println("El numero de dias del mes " + mes.name().toUpperCase() + " son " + numDias + " dias.");

        } catch (IllegalArgumentException e) {
            System.out.println("El mes NO es valido");
        } catch (InputMismatchException e) {
            sn.next();
            System.out.println("Debes insertar un numero;");
        }
    }

    /**
     * 04-Calcula si es año Bisiesto
     *
     * Un año es bisiesto si es divisible por 4 y no divisible por 100. Ooooo!! si es divisible por 400.
     */
    public static boolean esBisiesto(int anio) {
        if (anio <= 0) {
            return false;
        }
        return (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0));
    }
}

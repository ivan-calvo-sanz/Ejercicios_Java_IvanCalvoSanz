package _2_POO_ejercicio_01_Sucursal_Bancaria;

import java.time.LocalDate;

/**
 *
 * @author ivanc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Paula", "Gomez Asuncion", "C/ Gondomar N5 4Y", "Pontevedra", LocalDate.of(2000, 1, 1));
        Cliente cliente02 = new Cliente("Marta", "Garcia", "C/ Mayor", "MADRID", LocalDate.of(2002, 2, 2));

        Cuenta cuenta01 = new Cuenta(1111, 0, cliente01);
        Cuenta cuenta02 = new Cuenta(2222, 0, cliente01);

        cuenta01.ingresar(-200);
        cuenta01.ingresar(2000);
        cuenta01.retirar(20000);
        cuenta01.retirar(1500);

        cuenta02.retirar(200);
        cuenta02.ingresar(1000);

        cuenta01.verDatos();
        cuenta02.verDatos();

    }
}

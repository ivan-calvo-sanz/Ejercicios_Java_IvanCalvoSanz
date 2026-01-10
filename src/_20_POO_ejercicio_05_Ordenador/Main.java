package _20_POO_ejercicio_05_Ordenador;

public class Main {

    public static void main(String[] args) {

        try {
            Ordenador ordenador1 = new Ordenador("DELL", "XSP", 64, 50);
            ordenador1.encender();
            ordenador1.encender();
            ordenador1.apagar();
            ordenador1.encender();

            ordenador1.transferirArchivos(30);
            ordenador1.transferirArchivos(30);

            ordenador1.eliminarArchivos(20);
            ordenador1.toString();
            ordenador1.eliminarArchivos(20);
            ordenador1.toString();
            ordenador1.eliminarArchivos(20);
            ordenador1.toString();

            Ordenador ordenador2 = new Ordenador("DELL", "XSP", 150, 50);
            Ordenador ordenador3 = new Ordenador("DELL", "XSP", 128, 50);
            if (ordenador1.equals(ordenador3)) {
                System.out.println("Los ordenadores son iguales");
            } else {
                System.out.println("Los ordenadores NO son iguales");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

}

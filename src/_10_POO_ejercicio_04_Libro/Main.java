package _10_POO_ejercicio_04_Libro;

public class Main {

    public static void main(String[] args) {
        Libro libro1 = new Libro("12345", "Cien años de soledad", 500, "Gabriel Garcia", false);

        System.out.println(libro1);
        libro1.prestar();
        System.out.println(libro1);
        libro1.devolver();
        libro1.devolver();
        System.out.println(libro1);

        double costeImpresion = libro1.imprimir(0.05);
        System.out.println("El coste ha sido " + costeImpresion + "€");

        Libro libro2 = new Libro("12345", "Cinco años de soledad", 500, "Gabriel Garcia", false);
        if (libro1.equals(libro2)) {
            System.out.println("Los libros son iguales");
        } else {
            System.out.println("Los libros NO son iguales");
        }
    }
}

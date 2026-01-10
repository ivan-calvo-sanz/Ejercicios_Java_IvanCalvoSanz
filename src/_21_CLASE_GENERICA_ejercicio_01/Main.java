package _21_CLASE_GENERICA_ejercicio_01;

public class Main {

    public static void main(String[] args) {

        Lista<Integer> listaNumeros = new Lista<>(5);
        listaNumeros.anadir(1);
        listaNumeros.anadir(2);
        listaNumeros.anadir(3);
        listaNumeros.anadir(4);
        listaNumeros.anadir(5);

        listaNumeros.listar();              // 1,2,3,4,5
        System.out.println("");
        listaNumeros.eliminar(4);
        listaNumeros.listar();              // 1,2,3,5
        System.out.println("");
        listaNumeros.eliminar(5);
        listaNumeros.listar();              // 1,2,3
        System.out.println("");
        System.out.println("Posicion del elemento 3 es la posicion: " + listaNumeros.posicion(3));   // 2
        System.out.println("Tamano: " + listaNumeros.tamano()); // 3
        listaNumeros.vaciar();
        listaNumeros.listar();              // 
        System.out.println("");

        Lista<String> listaLetras = new Lista<>(5);
        listaLetras.anadir("A");
        listaLetras.anadir("B");
        listaLetras.anadir("C");
        listaLetras.anadir("D");
        listaLetras.anadir("E");

        listaLetras.listar();               // A,B,C,D,E
        System.out.println("");
        listaLetras.eliminar("C");
        listaLetras.listar();               // A,B,D,E
        System.out.println("");
        listaLetras.eliminar("E");
        listaLetras.listar();               // A,B,D
        System.out.println("");
        System.out.println("Posicion del elemento D es la posicion: " + listaLetras.posicion("D"));   // 2
        System.out.println("Tamano: " + listaLetras.tamano()); // 3
        listaLetras.vaciar();
        listaLetras.listar();              // 
        System.out.println("");
    }
}

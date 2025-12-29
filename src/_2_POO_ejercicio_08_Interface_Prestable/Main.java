package _2_POO_ejercicio_08_Interface_Prestable;

public class Main {

    public static void main(String[] args) {
        Videojuego videojuego = new Videojuego("SuperMario", 60);
        videojuego.prestar();
        videojuego.devolver();
        videojuego.prestar();
        videojuego.devolver();
        videojuego.prestar();
        videojuego.devolver();
        videojuego.devolver();

        Prestamo prestamo = new Prestamo(500, "Fer");
        prestamo.prestar();
        prestamo.devolver();
        prestamo.prestar();
        prestamo.devolver();
        prestamo.prestar();
        prestamo.devolver();
        prestamo.prestar();
        prestamo.devolver();
        prestamo.devolver();
    }

}

package _10_POO_ejercicio_03_Figuras2D;

/**
 *
 * @author ivanc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(0, 0);
        Punto p3 = new Punto(0, 0);

        // NO triangulo
        Triangulo t1 = new Triangulo(p1, p2, p3);
        System.out.println(t1.toString());

        // EQUILATERO
        p2 = new Punto(1, 0);
        p3 = new Punto(0.5, 0.5 * Math.sqrt(3));
        t1 = new Triangulo(p1, p2, p3);
        System.out.println(t1.toString());

        // ISOSCELES
        p3 = new Punto(0, 1);
        t1 = new Triangulo(p1, p2, p3);
        System.out.println(t1.toString());

        // ESCALENO
        p3 = new Punto(0, 2);
        t1 = new Triangulo(p1, p2, p3);
        System.out.println(t1.toString());
    }
}

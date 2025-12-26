package _2_POO_ejercicio_03_Figuras2D;

/**
 *
 * @author ivanc
 */
public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static boolean puntosIguales(Punto p1, Punto p2) {
        return p1.x != p2.x && p1.y != p2.y;
    }

    public static double distanciaPuntos(Punto p1, Punto p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    @Override
    public String toString() {
        return "[x=" + x + " ,y=" + y + "]";
    }
}

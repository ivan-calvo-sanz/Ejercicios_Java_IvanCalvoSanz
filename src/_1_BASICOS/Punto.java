package _1_BASICOS;

/**
 *
 * @author ivanc
 */
public class Punto {

    private int x;
    private int y;
    private String nombre;

    public Punto(int x) {
        this.x = x;
        this.y = y;
    }

    public Punto(int x, String nombre) {
        this(x);
        this.nombre = nombre;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto(int x, int j, String nombre) {
        this(x, j);
        this.nombre = nombre;
    }

    public String toString() {
        return "Punto [x=" + x + ", y=" + y + "]";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static boolean mismaPosicion(Punto p1, Punto p2) {
        return p1.getX() == p2.getX() && p2.getY() == p2.getY();
    }

    //METODO determina si hay algun punto con las mismas coordenadas X e Y
    public static boolean mismaPosicion(Punto... puntos) {
        for (int i = 0; i < puntos.length; i++) {
            for (int j = i + 1; j < puntos.length; j++) {
                if (puntos[i].getX() == puntos[j].getX() && puntos[i].getY() == puntos[j].getY()) {
                    return true;
                }
            }
        }
        return false;
    }

    //METODO determina si hay algun punto con las mismas coordenadas X e Y
    public static boolean mismaPosicionu(Punto[] puntos) {
        for (int i = 0; i < puntos.length; i++) {
            for (int j = i + 1; j < puntos.length; j++) {
                if (puntos[i].getX() == puntos[j].getX() && puntos[i].getY() == puntos[j].getY()) {
                    return true;
                }
            }
        }
        return false;
    }

}

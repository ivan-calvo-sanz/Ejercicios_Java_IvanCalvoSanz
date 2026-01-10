package _20_POO_ejercicio_03_Figuras2D;

/**
 *
 * @author ivanc
 */
public class Triangulo extends Figura2D {

    public static final byte NO_TRIANGULO = 0;
    public static final byte EQUILATERO = 1;    // TRES LADOS IGUALES
    public static final byte ISOSCELES = 2;     // DOS LADOS IGUALES
    public static final byte ESCALENO = 3;      // NINGUN LADO IGUAL

    private Punto p1, p2, p3;
    private byte tipo;

    public Triangulo(Punto p1, Punto p2, Punto p3) {
        super(3);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        setTipo();
    }

    private byte setTipo() {
        if (esTriangulo()) {
            double a = Math.round(Punto.distanciaPuntos(p1, p2) * 1000) / 1000d;
            double b = Math.round(Punto.distanciaPuntos(p2, p3) * 1000) / 1000d;
            double c = Math.round(Punto.distanciaPuntos(p3, p1) * 1000) / 1000d;

            if (a == b && b == c) {
                tipo = EQUILATERO;
            } else if (a != b && b != c && a != c) {
                tipo = ESCALENO;
            } else {
                tipo = ISOSCELES;
            }
        } else {
            tipo = NO_TRIANGULO;
        }
        return tipo;
    }

    public String tipoTrangulo() {
        switch (this.tipo) {
            case EQUILATERO:
                return "EQUILATERO";
            case ISOSCELES:
                return "ISOSCELES";
            case ESCALENO:
                return "ESCALENO";
            default:
                return "NO_TRIANGULO";
        }
    }

    public double area() {
        double a = Punto.distanciaPuntos(p1, p2);
        double b = Punto.distanciaPuntos(p2, p3);
        double c = Punto.distanciaPuntos(p3, p1);
        double s = (a + b + c) / 2;
        return (Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }

    public double perimetro() {
        return Punto.distanciaPuntos(p1, p2) + Punto.distanciaPuntos(p2, p3) + Punto.distanciaPuntos(p3, p1);
    }

    public boolean esTriangulo() {
        //return (p2.getY() - p1.getY()) * (p3.getX() - p2.getX()) != (p3.getY() - p2.getY()) * (p2.getX() - p1.getX());
        return area() > 0;
    }

    @Override
    public String toString() {
        if (esTriangulo()) {
            return "El Triangulo es de tipo " + tipoTrangulo().toLowerCase() + ", de area " + Math.round(area() * 10) / 10d
                    + " y perimetro " + Math.round(perimetro() * 10) / 10d + "\n"
                    + "Sus puntos son p1: " + p1.toString() + ", p2" + p2.toString() + ", p3" + p3.toString() + "\n"
                    + "Lado 1=" + Punto.distanciaPuntos(p1, p2) + "\n"
                    + "Lado 2=" + Punto.distanciaPuntos(p2, p3) + "\n"
                    + "Lado 3=" + Punto.distanciaPuntos(p3, p1) + "\n";
        } else {
            return "El Triangulo NO es valido";
        }
    }

}

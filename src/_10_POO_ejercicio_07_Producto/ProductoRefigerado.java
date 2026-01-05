package _10_POO_ejercicio_07_Producto;

public class ProductoRefigerado extends Producto {

    private int cajon;

    public ProductoRefigerado() throws IllegalArgumentException {
        this("", 0, 0);
    }

    public ProductoRefigerado(String nombre, double precio, int cajon) throws IllegalArgumentException {
        super(nombre, precio);
        this.cajon = cajon;
    }

    @Override
    public String toString() {
        return super.toString() + " ProductoRefigerado{" + "cajon=" + cajon + '}';
    }

    public int getCajon() {
        return cajon;
    }

    public void setCajon(int cajon) {
        this.cajon = cajon;
    }

}

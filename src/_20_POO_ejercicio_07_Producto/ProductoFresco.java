package _20_POO_ejercicio_07_Producto;

public class ProductoFresco extends Producto {

    private int diasCaducidad;

    public ProductoFresco() throws IllegalArgumentException {
        this("", 0, 0);
    }

    public ProductoFresco(String nombre, double precio, int diasCaducidad) throws IllegalArgumentException {
        super(nombre, precio);
        this.diasCaducidad = diasCaducidad;
    }

    @Override
    public double comprar(int cantidad) throws IllegalArgumentException {
        double precio = super.comprar(cantidad);
        if (diasCaducidad >= 3 && diasCaducidad <= 5) {
            precio -= precio * 0.4;
        } else if (diasCaducidad < 3) {
            precio -= precio * 0.7;
        }
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + " ProductoFresco{" + "diasCaducidad=" + diasCaducidad + '}';
    }

    public int getDiasCaducidad() {
        return diasCaducidad;
    }

    public void setDiasCaducidad(int diasCaducidad) {
        this.diasCaducidad = diasCaducidad;
    }

}

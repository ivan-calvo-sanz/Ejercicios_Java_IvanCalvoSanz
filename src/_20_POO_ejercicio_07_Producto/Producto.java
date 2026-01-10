package _20_POO_ejercicio_07_Producto;

public class Producto {

    private static int id = 0;
    private String nombre;
    private double precio;

    private static void incrementarId() {
        Producto.id++;
    }

    public Producto() {
        this("", 0);
    }

    public Producto(String nombre, double precio) throws IllegalArgumentException {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que 0"); //lanzamos la excepcion
        }
        this.nombre = nombre;
        this.precio = precio;
        incrementarId();
    }

    public double comprar(int cantidad) throws IllegalArgumentException {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que 0"); //lanzamos la excepcion
        }
        return this.precio * cantidad;
    }

    @Override
    public String toString() {
        return "id=" + Producto.id + " Producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Producto.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}

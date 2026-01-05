package _10_POO_ejercicio_08_Interface_Prestable;

public class Prestamo implements Prestable {

    private double cantidad;
    private double adeudo;
    private String titular;

    public Prestamo(int cantidad, String titular) {
        this.cantidad = cantidad;
        this.titular = titular;
        this.adeudo = 0;
    }

    @Override
    public void prestar() {
        this.adeudo += this.cantidad * 1.05;
        System.out.println("Se ha prestado " + this.cantidad + "€ al titular:" + this.titular + " Adeudo Total:" + this.adeudo + "€");
    }

    @Override
    public void devolver() {
        if (this.adeudo < this.cantidad) {
            this.adeudo = 0;
        } else {
            this.adeudo -= this.cantidad;
        }
        System.out.println("Se ha devuelto " + this.cantidad + "€ del titular:" + this.titular + " Adeudo Total:" + this.adeudo + "€");
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

}

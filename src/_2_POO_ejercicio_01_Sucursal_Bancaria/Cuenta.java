package _2_POO_ejercicio_01_Sucursal_Bancaria;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

/**
 *
 * @author ivanc
 */
public class Cuenta {

    private int numeroCuenta;
    private double saldo;
    private Cliente titular;
    private ArrayList<Movimiento> movimientos;

    ////////////////////////////////////////
    // CONSTRUCTORES
    ////////////////////////////////////////
    public Cuenta(int numeroCuenta, double saldo, Cliente titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
        this.movimientos = new ArrayList<Movimiento>();
    }

    ////////////////////////////////////////
    // GETTERS & SETTERS
    ////////////////////////////////////////
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    ////////////////////////////////////////
    // METODOS
    ////////////////////////////////////////
    public void ingresar(double cantidad) {
        // debe ser positivo
        if (cantidad < 0) {
            System.out.println("ERROR: No se puede ingresar una cantidad negativa");
            return;
        }
        // se ingresa y se registra
        saldo += cantidad;
        movimientos.add(new Movimiento(LocalDateTime.now(), cantidad, Movimiento.INGRESO));
        System.out.println("MOVIMIENTO REALIZADO CORRECTAMENTE");
    }

    public void retirar(double cantidad) {
        // debe ser positivo
        if (cantidad < 0) {
            System.out.println("ERROR: No se puede retrar una cantidad negativa");
            return;
        }
        // si no hay saldo suficiente
        if (this.saldo < cantidad) {
            System.out.println("ERROR: No hay saldo suficiente");
            return;
        }
        // se reira y se registra
        this.saldo -= cantidad;
        movimientos.add(new Movimiento(LocalDateTime.now(), cantidad, Movimiento.RETIRO));
        System.out.println("MOVIMIENTO REALIZADO CORRECTAMENTE");
    }

    private String obtenerMovimientos() {
        String s = "";
        for (Movimiento m : movimientos) {
            s += m.toString() + "\n";
        }
        return s;
    }

    public void verDatos() {
        String s = "";
        s += "N Cuenta: " + this.numeroCuenta + "\n";
        s += "Titular: " + this.titular.nombreCompleto() + ", domicilio en " + this.titular.direccionCompleta() + "\n";
        s += "Saldo actual: " + this.saldo + "€\n";
        s += "---------- MOVIMIENTOS ----------\n";
        s += this.obtenerMovimientos();
        System.out.println(s);
    }

    @Override
    public String toString() {
        return "Cuenta [numeroCuenta=" + this.numeroCuenta + ", titular=" + this.titular.nombreCompleto() + "]";
    }

    ////////////////////////////////////////
    // CLASE INTERNA
    ////////////////////////////////////////
    // Creo una clase interna dentro de la Clase Cuenta
    // Las clases privadas SI pueden ser private
    private class Movimiento {

        private static final byte INGRESO = 0;
        private static final byte RETIRO = 1;
        private LocalDateTime fechaHora;
        private double importe;
        private double saldoFinal;
        private byte tipo;

        ////////////////////////////////////////
        // CONSTRUCTORES
        ////////////////////////////////////////
        public Movimiento(LocalDateTime fechaHora, double importe, byte tipo) {
            this.fechaHora = fechaHora;
            this.importe = importe;
            this.saldoFinal = saldo;
            this.tipo = tipo;
        }

        public String toString() {
            return (this.tipo == INGRESO ? "INGRESO" : "RETIRO")
                    + "[Fecha=" + this.fechaHora.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM))
                    + ", hora=" + this.fechaHora.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM))
                    + ", importe= " + this.importe + "€"
                    + ", saldo " + this.saldoFinal + "€"
                    + "]";
        }
    }

}

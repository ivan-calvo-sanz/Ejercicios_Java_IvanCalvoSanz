package _2_POO_ejercicio_05_Ordenador;

import java.util.Objects;

public class Ordenador {

    ////////////////////////////////////////
    // ATRIBUTOS
    ////////////////////////////////////////
    private String marca;
    private String moedlo;
    private int gbRam;
    private int capacidadDiscoDuro;
    private int espacioUtilizado;
    private boolean encendido;

    ////////////////////////////////////////
    // CONSTRUCTORES
    ////////////////////////////////////////
    public Ordenador() {
        this("", "", 4, 50);
    }

    public Ordenador(int gbRam) {
        this("", "", gbRam, 50);
    }

    public Ordenador(int gbRam, int capacidadDiscoDuro) {
        this("", "", gbRam, capacidadDiscoDuro);
    }

    public Ordenador(String marca, String moedlo, int gbRam, int capacidadDiscoDuro) {
        if (esPotenciaDeDos(gbRam)) {
            this.marca = marca;
            this.moedlo = moedlo;
            this.gbRam = gbRam;
            this.capacidadDiscoDuro = capacidadDiscoDuro;
        } else {
            throw new IllegalArgumentException("IllegalArgumentException: Los gbRam deben ser potencia de 2"); //lanzamos la excepcion
        }
    }

    ////////////////////////////////////////
    // METODOS
    ////////////////////////////////////////
    // METODO valida que RAM sea potencia de 2
    private boolean esPotenciaDeDos(int num) {
        if (num <= 0) {
            return false;
        }
        // TRUCO, para que un numero sea potencia de 2 la division del logaritmo neperiano de ese numero entre el logaritmo neperiano de 2 NO de be tener decimales
        double logBase2 = Math.log(num) / Math.log(2);
        return logBase2 == (int) logBase2;
    }

    // METODO encender
    public void encender() {
        if (this.encendido) {
            System.out.println("El ordenador ya esta encendido");
        } else {
            this.encendido = true;
            System.out.println("El ordenador se ha encendido");
        }
    }

    // METODO apagar
    public void apagar() {
        if (!this.encendido) {
            System.out.println("El ordenador ya esta apagado");
        } else {
            this.encendido = false;
            System.out.println("El ordenador se ha apagado");
        }
    }

    // METODO transferir archivos
    public void transferirArchivos(int gb) {
        if (this.encendido) {
            if (this.espacioUtilizado + gb <= this.capacidadDiscoDuro) {
                this.espacioUtilizado += gb;
                System.out.println("Transferidos " + gb + "GB");
            } else {
                System.out.println("NO hay espacio suficiente");
            }
        } else {
            System.out.println("NO se puede transferir, el ordenador esta apagado");
        }
    }

    // METODO eliminar archivos
    public void eliminarArchivos(int gb) {
        if (this.encendido) {
            if (this.espacioUtilizado - gb >= 0) {
                this.espacioUtilizado -= gb;
                System.out.println("Eliminados " + gb + "GB");
            } else {
                this.espacioUtilizado = 0;
                System.out.println("Todos los archivos han sido eliminados");
            }
        } else {
            System.out.println("NO se puede eliminar, el ordenador esta apagado");
        }
    }

    ////////////////////////////////////////
    // METODO toString
    ////////////////////////////////////////
    @Override
    public String toString() {
        String estadoEncendido = "NO";
        if (this.encendido) {
            estadoEncendido = "SI";
        }
        return "Ordenador{" + "marca=" + marca + ", moedlo=" + moedlo + ", gbRam=" + gbRam + ", capacidadDiscoDuro=" + capacidadDiscoDuro + ", espacioUtilizado=" + espacioUtilizado + ", encendido=" + estadoEncendido + '}';
    }

    ////////////////////////////////////////
    // METODO equals()
    ////////////////////////////////////////
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ordenador other = (Ordenador) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return Objects.equals(this.moedlo, other.moedlo);
    }

    ////////////////////////////////////////
    // GETTERS & SETTERS
    ////////////////////////////////////////
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMoedlo() {
        return moedlo;
    }

    public void setMoedlo(String moedlo) {
        this.moedlo = moedlo;
    }

    public int getGbRam() {

        return gbRam;
    }

    public void setGbRam(int gbRam) {
        if (!esPotenciaDeDos(gbRam)) {
            throw new IllegalArgumentException("IllegalArgumentException: Los gbRam deben ser potencia de 2"); //lanzamos la excepcion
        }
        this.gbRam = gbRam;
    }

    public int getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }

    public void setCapacidadDiscoDuro(int capacidadDiscoDuro) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public int getEspacioUtilizado() {
        return espacioUtilizado;
    }

    public void setEspacioUtilizado(int espacioUtilizado) {
        this.espacioUtilizado = espacioUtilizado;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

}

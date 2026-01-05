package _10_POO_ejercicio_04_Libro;

import java.util.Objects;

public class Libro {

    private String ISBN;
    private String titulo;
    private int numeroPaginas;
    private String autor;
    private boolean prestado;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, int numeroPaginas, String autor, boolean prestado) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.prestado = prestado;
    }

    public void prestar() {
        if (this.prestado) {
            System.out.println("Este libro ya esta prestado");
        } else {
            this.prestado = true;
            System.out.println("El libro se ha presatdo.");
        }
    }

    public void devolver() {
        if (!this.prestado) {
            System.out.println("Este libro no está presatdo");
        } else {
            this.prestado = false;
            System.out.println("El libro se ha devuelto.");
        }
    }

    public double imprimir(double coste) {
        return this.numeroPaginas * coste;
    }

    // METODO hashCode()
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.ISBN);
        return hash;
    }

    // METODO equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        return Objects.equals(this.ISBN, other.ISBN);
    }

    // METODO toString
    @Override
    public String toString() {
        String mensaje = "El libro " + this.ISBN + " con titulo " + this.titulo + " y autor " + this.autor + " tiene " + this.numeroPaginas + " paginas y ";
        if (!this.prestado) {
            mensaje += " no ";
        }
        mensaje += "esta prestado.";
        return mensaje;
    }

    // GETTERS & SETTERS
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

}

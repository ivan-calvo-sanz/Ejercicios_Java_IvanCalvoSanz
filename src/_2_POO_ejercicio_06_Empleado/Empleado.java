package _2_POO_ejercicio_06_Empleado;

import java.util.Objects;

public class Empleado {

    private String dni;
    private String nombre;
    private int edad;
    private Departamento departamento;
    private boolean teletrabajo;
    private Empresa empresa;
    private static double salarioBase = 1000;

    public Empleado(String dni, String nombre, int edad, Departamento departamento, boolean teletrabajo, Empresa empresa) {
        try {
            Validador.validaDNI(dni);
            this.dni = dni;
            Validador.validaEmpresa(empresa);
            this.empresa = empresa;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
        this.teletrabajo = teletrabajo;
    }

    public double calcularSueldo() {
        double salario = Empleado.salarioBase;
        if (this.edad > 30) {
            salario += 200;
        }
        if (this.teletrabajo) {
            salario += 30;
        }
        salario += departamento.getPlus();
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", departamento=" + departamento + ", teletrabajo=" + teletrabajo + ", empresa=" + empresa + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.dni);
        return hash;
    }

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
        final Empleado other = (Empleado) obj;
        return Objects.equals(this.dni, other.dni);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public boolean isTeletrabajo() {
        return teletrabajo;
    }

    public void setTeletrabajo(boolean teletrabajo) {
        this.teletrabajo = teletrabajo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public static double getSalarioBase() {
        return salarioBase;
    }

    public static void setSalarioBase(double salarioBase) {
        Empleado.salarioBase = salarioBase;
    }

}

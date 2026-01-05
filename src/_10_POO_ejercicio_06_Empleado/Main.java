package _10_POO_ejercicio_06_Empleado;

public class Main {

    public static void main(String[] args) {

        Departamento departamento1 = Departamento.INFORMATICA;
        Departamento departamento2 = Departamento.DIRECCION;

        Empresa empresa1 = new Empresa("123", "ACS");

        Empleado empleado1 = new Empleado("11111111A", "Fernando", 34, departamento1, true, empresa1);
        Empleado empleado2 = new Empleado("22222222B", "Ivan", 40, departamento2, false, empresa1);
        Empleado empleado3 = new Empleado("123", "Ivan", 40, departamento2, false, empresa1);
        Empleado empleado4 = new Empleado("22222222B", "Ivan", 40, departamento2, false, null);

        System.out.println("Sueldo empleado 1: " + empleado1.calcularSueldo());
        System.out.println("Sueldo empleado 2: " + empleado2.calcularSueldo());
        System.out.println("Sueldo empleado 3: " + empleado3.calcularSueldo());
        System.out.println("Sueldo empleado 4: " + empleado4.calcularSueldo());
    }

}

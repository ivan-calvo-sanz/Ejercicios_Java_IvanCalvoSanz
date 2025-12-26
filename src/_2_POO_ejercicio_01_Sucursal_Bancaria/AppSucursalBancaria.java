package _2_POO_ejercicio_01_Sucursal_Bancaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ivanc
 */
public class AppSucursalBancaria {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Cuenta> cuentas = new ArrayList<>();
    private static Cuenta cuentaActiva = null;
    private static int contadorCuenta = 1;

    public static void main(String[] args) {

        int opcion = 0;
        while (opcion != 4) {
            imprimeMenuPrincipal();
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    crearCliente();
                    break;
                case 2:
                    crearCuenta();
                    break;
                case 3:
                    seleccionarCuenta();
                    break;
                case 4:
                    System.out.println("FIN DEL PROGRAMA");
                    break;
                default:
                    System.out.println("Opción no valida, selecciona una opcion entre 1 y 4");
            }
        }
    }

    private static void imprimeMenuPrincipal() {
        String s = """
                 MENU PRINCIPAL
                 1- Crear Cliente
                 2- Crear Cuenta
                 3- Operaciones de Cuenta
                 4- Salir
                 """;
        System.out.println(s);
    }

    private static void crearCliente() {
        System.out.println("Nombre del Cliente: ");
        String nombre = sc.nextLine();
        System.out.println("Apellidos: ");
        String apellidos = sc.nextLine();
        System.out.println("Direccion: ");
        String dieccion = sc.nextLine();
        System.out.println("Ciudad: ");
        String ciudad = sc.nextLine();
        System.out.println("Fecha de nacimiento: AAAA-MM-DD: ");
        String fecha = sc.nextLine();

        clientes.add(new Cliente(nombre, apellidos, dieccion, ciudad, LocalDate.parse(fecha)));
        System.out.println("El cliente " + nombre + " " + apellidos + " se ha creado correctamente");
    }

    private static void crearCuenta() {
        // es necesario que al menos exista un cliente
        if (clientes.isEmpty()) {
            System.out.println("ERROR: Es necesario al menos un cliente");
            return;
        }

        String nombre;
        Cliente cliente;
        do {
            System.out.println("Dime el nombre del cliente que quiere abrir una cuenta: ");
            for (Cliente c : clientes) {
                System.out.println(c.getNombre());
            }
            nombre = sc.nextLine();
            cliente = validarCliente(nombre);
        } while (cliente == null);
        cuentas.add(new Cuenta(contadorCuenta++, 0, cliente));
        System.out.println("La cuenta a nombre de " + cliente.getNombre() + " se ha creado correctamente");
    }

    private static Cliente validarCliente(String nombre) {
        for (Cliente c : clientes) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    private static void seleccionarCuenta() {
        // si no hay cuenta
        if (cuentas.isEmpty()) {
            System.out.println("ERROR: No hay ninguna cuenta, primero debes crear alguna");
            return;
        }

        //seleccionamos una cuenta
        int numCuenta;
        do {
            System.out.println("Selecciona un numero de cuenta");
            for (Cuenta c : cuentas) {
                System.out.println(c.toString());
            }
            numCuenta = Integer.parseInt(sc.nextLine());
        } while (!validarNumCuenta(numCuenta));

        //mostramos el menu de Cuenta
        menuCuenta();
    }

    private static boolean validarNumCuenta(int numCuenta) {
        for (Cuenta c : cuentas) {
            if (numCuenta == c.getNumeroCuenta()) {
                cuentaActiva = c;
                return true;
            }
        }
        return false;
    }

    private static void menuCuenta() {
        int opcion = 0;
        while (opcion != 4) {
            imprimeMenuCuenta();
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    ingresar();
                    break;
                case 2:
                    retirar();
                    break;
                case 3:
                    cuentaActiva.verDatos();
                    break;
                case 4:
                    System.out.println("Volviendo al menu principal");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }

    }

    private static void imprimeMenuCuenta() {
        String s = """
                 MENU CUENTA
                 1- Ingresar
                 2- Retirar
                 3- Ver datos cuenta
                 4- Volver al menu principal
                 """;
        System.out.println(s);
    }

    private static void ingresar() {
        System.out.println("Indica la cantidad a ingresar: ");
        int cantidad = Integer.parseInt(sc.nextLine());
        cuentaActiva.ingresar(cantidad);
    }

    private static void retirar() {
        System.out.println("Indica la cantidad a retirar: ");
        int cantidad = Integer.parseInt(sc.nextLine());
        cuentaActiva.retirar(cantidad);
    }

}

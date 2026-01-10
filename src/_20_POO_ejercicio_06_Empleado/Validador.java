package _20_POO_ejercicio_06_Empleado;

public class Validador {

    /**
     * 01- Validar formato de un DNI.
     */
    public static void validaDNI(String dni) throws IllegalArgumentException {
        // ^ ... $  OBLIGA que la expresion cumpla la expresion indicada 
        // [0-9]    está incluido numeros de 0 a 9
        // [A-Z]    está incluido las letras de A a la Z 
        // {8}      indica cuantas repeticiones
        if (!dni.matches("^[0-9]{7,8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$")) {
            throw new IllegalArgumentException("El formato del DNI es Incorrecto");
        }
    }

    public static void validaEmpresa(Empresa empresa) throws IllegalArgumentException {
        if (empresa == null) {
            throw new IllegalArgumentException("La empresa es obligaotoria");
        }
    }
}

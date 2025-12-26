package _1_BASICOS;

/*
CIFRADO CESAR: es uno de los métodos de encriptación más antiguos y sencillos que existen.
Es un cifrado por sustitución: cada letra del texto original se reemplaza por otra que está un número fijo de posiciones más adelante en el alfabeto.
Se llama así porque fue usado por Julio César para comunicarse con sus generales.

Ejemplo: HOLA -> KROD   (Aplicando el desplazamiento de 3 posiciones en el alfabeto)
H → K  
O → R  
L → O  
A → D

El número de posiciones que se avanza se llama clave del cifrado.
Si llegamos al final del alfabeto, se vuelve a empezar desde la A.
A → B, B → C, ..., Z → A

Para descifrar basta con restar el mismo número de posiciones.
 */
public class ejercicio_017_CifradoCesar {

    public static String cifradoCesar(String con, int clave) {
        String conCifrado = "";
        char letra, letraCifrada;
        int dif;

        for (int i = 0; i < con.length(); i++) {
            letra = (char) (con.charAt(i));
            if (letra > 64 && letra < 91) {
                if ((letra + clave) > 90) {
                    dif = letra + clave - 90;
                    letraCifrada = (char) (dif + 64);
                } else {
                    letraCifrada = (char) (letra + clave);
                }
                conCifrado += letraCifrada;
            }

            if (letra > 96 && letra < 123) {
                if ((letra + clave) > 122) {
                    dif = letra + clave - 122;
                    letraCifrada = (char) (dif + 96);
                } else {
                    letraCifrada = (char) (letra + clave);
                }
                conCifrado += letraCifrada;
            }
        }
        return conCifrado;
    }

    public static String desCifradoCesar(String con, int clave) {
        String conDesCifrado = "";
        char letra, letraDesCifrada;
        int dif;

        for (int i = 0; i < con.length(); i++) {
            letra = (char) (con.charAt(i));
            if (letra > 64 && letra < 91) {
                if ((letra - clave) < 65) {
                    dif = letra + clave - 65;
                    letraDesCifrada = (char) (91 - dif);
                } else {
                    letraDesCifrada = (char) (letra - clave);
                }
                conDesCifrado += letraDesCifrada;
            }

            if (letra > 96 && letra < 123) {
                if ((letra - clave) < 97) {
                    dif = letra + clave - 97;
                    letraDesCifrada = (char) (123 - dif);
                } else {
                    letraDesCifrada = (char) (letra - clave);
                }
                conDesCifrado += letraDesCifrada;
            }
        }
        return conDesCifrado;
    }

}

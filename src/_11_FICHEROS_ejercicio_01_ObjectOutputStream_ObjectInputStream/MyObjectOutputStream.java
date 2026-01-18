package _11_FICHEROS_ejercicio_01_ObjectOutputStream_ObjectInputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * CLASE IMPORTANTE CUANDO TRABAJAMOS CON ObjectOutputStream Sirve para no escribir cabeceras en los archivos donde
 * escribimos los Obajetos De esta forma evitamos problemas al escribir los Objetos, ya que cada vez que escribimos un
 * Objeto la Clase ObjectOutputStream escribe una nueva cabecera y al leerlos al tener cabecera diferente da error
 */
public class MyObjectOutputStream extends ObjectOutputStream {

    public MyObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        // no hace nada, no crea nueva cabecera
    }

}

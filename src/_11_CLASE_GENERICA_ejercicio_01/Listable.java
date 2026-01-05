package _11_CLASE_GENERICA_ejercicio_01;

public interface Listable<T> {

    public int posicion(T elemento);

    public boolean anadir(T elemento);

    public int tamano();

    public boolean eliminar(T elemento);

    public void listar();

    public void vaciar();

}

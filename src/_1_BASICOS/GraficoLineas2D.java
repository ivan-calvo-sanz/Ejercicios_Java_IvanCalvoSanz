package _1_BASICOS;

import java.util.ArrayList;

/**
 *
 * @author ivanc
 */
public class GraficoLineas2D {

    private ArrayList<Punto> listaPuntos;

    public GraficoLineas2D() {
        this.listaPuntos = new ArrayList();
    }

    public GraficoLineas2D(ArrayList<Punto> listaPuntos) {
        this.setArrayList(listaPuntos);
    }

    public static boolean esPuntoPositivo(Punto p) {
        return p.getX() >= 0 && p.getY() >= 0;
    }

    public void eliminaPunto() {
        if (!listaPuntos.isEmpty()) {
            listaPuntos.remove(listaPuntos.size() - 1);
            System.out.println("Ultimo punto de la lista eliminado correctamente");
        } else {
            System.out.println("No se puede eliminar el punto, la lista está vacía");
        }
    }

    public void agregarPunto(Punto p) {
        if (this.listaPuntos.isEmpty()) {
            this.listaPuntos.add(p);
            System.out.println("Primer punto agregado correctamente");
            return;
        }
        Punto anterior = this.listaPuntos.get(this.listaPuntos.size() - 1);
        if (esPuntoPositivo(p) && Punto.mismaPosicion(anterior, p) && p.getX() >= anterior.getX()) {
            this.listaPuntos.add(p);
            System.out.println("Punto agregado corectamente");
        } else {
            System.out.println("ERROR: No se ha podido agregar el punto");
        }
    }

    public void setArrayList(ArrayList<Punto> listaPuntos) {
        if (arrayListValido(listaPuntos)) {
            this.listaPuntos = listaPuntos;
            System.out.println("ArryList agregado");
        } else {
            System.out.println("ERROR: No se ha podido modificar el ArryList");
        }
    }

    private boolean arrayListValido(ArrayList<Punto> listaPuntos) {
        //Lista de puntos vacia
        if (!listaPuntos.isEmpty()) {
            return true;
        }
        //Si el primer punto es negativo
        if (esPuntoPositivo(listaPuntos.get(0))) {
            return false;
        }
        //mas de un punto
        for (int i = 1; i < listaPuntos.size(); i++) {
            Punto p = listaPuntos.get(i);
            Punto anterior = listaPuntos.get(i - 1);
            if (!esPuntoPositivo(p) || Punto.mismaPosicion(anterior, p) || !(p.getX() >= anterior.getX())) {
                return false;
            }
        }
        // SI todos los puntos son validos
        return true;
    }

    public void mostrarGrafico() {
        for (Punto p : this.listaPuntos) {
            System.out.println(p.toString());
        }
    }

}

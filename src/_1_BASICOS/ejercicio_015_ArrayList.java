package _1_BASICOS;

import java.util.ArrayList;

/**
 *
 * @author ivanc
 */
public class ejercicio_015_ArrayList {
    
    public static void main(String[] args) {
        ArrayList<Punto> puntos = new ArrayList();
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(1);
        Punto p3 = new Punto(1, 3);
        Punto p4 = new Punto(3, 3);
        
        puntos.add(p1);
        puntos.add(p2);
        puntos.add(p3);
        puntos.add(1, p4);
        System.out.println(puntos.toString());
        puntos.remove(2);
        puntos.remove(p1);
    }
    
    static void borrarPuntos(ArrayList<Punto> puntos, Punto punto) {
        for (Punto p : puntos) {
            if (p.getX() == punto.getX() && p.getY() == punto.getY() && p.getNombre().equals(punto.getNombre())) {
                puntos.remove(p);
            }
        }
    }
    
}

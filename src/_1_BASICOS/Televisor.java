package _1_BASICOS;

/**
 * Ejercicio 20
 * https://www.youtube.com/watch?v=zgjT_i_eORA&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=104&t=1s
 *
 * @author ivanc
 */
/**
 * 20- Clase Tv
 */
public class Televisor {

    private int canal;
    private int volumen;

    public Televisor() {
        this.canal = 1;
        this.volumen = 5;
    }

    public void subirCanal() {
        this.setCanal(this.canal + 1);
    }

    public void bajarCanal() {
        this.setCanal(this.canal - 1);
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal > 0 && canal < 100) {
            this.canal = canal;
        }
        System.out.println("Canal: " + this.canal);
    }

    public void subirVolumen() {
        this.setVolumen(this.volumen + 1);

    }

    public void bajarVolumen() {
        this.setVolumen(this.volumen - 1);
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if (volumen >= 0 && volumen < 100) {
            this.volumen = volumen;
        }
        System.out.println("Volumen: " + this.volumen);
    }
}

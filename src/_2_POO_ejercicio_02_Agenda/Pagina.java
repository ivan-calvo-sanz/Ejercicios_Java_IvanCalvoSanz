package _2_POO_ejercicio_02_Agenda;

import java.util.ArrayList;

/**
 *
 * @author ivanc
 */
public class Pagina {

    private int dia;
    private int mes;
    private ArrayList<Cita> citas;

    public Pagina(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
        this.citas = new ArrayList<>();
    }

    public Cita buscarCita(Cita c) {
        for (Cita cita : this.citas) {
            if (c.getHora() == cita.getHora() && c.getMinutos() == cita.getMinutos()) {
                return cita;
            }
        }
        return null;
    }

    public void agregarCita(Cita c) {
        if (buscarCita(c) != null) {
            System.out.println("ERROR: No se puede agregar la cita, ya exite una cita a esa hora");
        } else {
            this.citas.add(c);
            System.out.println("CITA AGREGADA CORRECTAMENTE");
        }
    }

    public void borrarCita(Cita c) {
        if (buscarCita(c) == null) {
            System.out.println("ERROR: No exite esa cita");
        } else {
            this.citas.remove(c);
            System.out.println("CITA BORRADA CORRECTAMENTE");
        }
    }

    public void verCitas() {
        String s = "ESTAS SON LAS CITAS DEL " + dia + " de " + Agenda.MESES[mes - 1] + "\n";
        for (Cita c : this.citas) {
            s += c.toString();
        }
        System.out.println(s);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }

}

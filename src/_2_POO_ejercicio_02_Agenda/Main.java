package _2_POO_ejercicio_02_Agenda;

/**
 *
 * @author ivanc
 */
public class Main {

    public static void main(String[] args) {

        Agenda agenda01 = new Agenda(2025);

        agenda01.abrirPagina(01, 12);
        agenda01.getPaginaAbierta().agregarCita(new Cita(11, 21, "Reunion 1", "Se hablara sobre que el chico no es"));
        agenda01.getPaginaAbierta().agregarCita(new Cita(11, 31, "Reunion 2", "Se entabla conversacion"));
        agenda01.getPaginaAbierta().verCitas();

        agenda01.abrirPagina(01, 01);
        agenda01.getPaginaAbierta().verCitas();
    }

}

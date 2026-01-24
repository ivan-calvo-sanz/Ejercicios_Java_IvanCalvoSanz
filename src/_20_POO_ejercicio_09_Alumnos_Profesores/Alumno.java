package _20_POO_ejercicio_09_Alumnos_Profesores;

public class Alumno extends Persona {

    private int nota;

    public Alumno() {
        super();
        this.nota = MetodosSueltos.generaNumeroAleatorio(0, 10);
        super.setEdad(MetodosSueltos.generaNumeroAleatorio(12, 15));
        this.disponibilidad();
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    void disponibilidad() {
        int prob = MetodosSueltos.generaNumeroAleatorio(0, 100);
        if (prob < 25) {
            super.setAsistencia(false);
        } else {
            super.setAsistencia(true);
        }
    }

}

package _20_POO_ejercicio_09_Alumnos_Profesores;

public class Profesor extends Persona {

    private String materia;

    public Profesor() {
        super();
        super.setEdad(MetodosSueltos.generaNumeroAleatorio(25, 50));
        this.materia = ConstantesSueltos.MATERIAS[MetodosSueltos.generaNumeroAleatorio(0, 2)];
        this.disponibilidad();
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    void disponibilidad() {
        int prob = MetodosSueltos.generaNumeroAleatorio(0, 100);
        if (prob < 5) {
            super.setAsistencia(false);
        } else {
            super.setAsistencia(true);
        }
    }

}

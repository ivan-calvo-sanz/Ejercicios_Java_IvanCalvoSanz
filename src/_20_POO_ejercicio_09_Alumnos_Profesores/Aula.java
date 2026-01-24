package _20_POO_ejercicio_09_Alumnos_Profesores;

public class Aula {

    private final int MAX_ALUMNOS = 20;

    private int id;
    private Profesor profesor;
    private Alumno[] alumnos;
    private String materia;

    public Aula() {
        this.id = 1;
        this.profesor = new Profesor();
        this.alumnos = new Alumno[this.MAX_ALUMNOS];
        this.creaAlumnos();
        this.materia = ConstantesSueltos.MATERIAS[MetodosSueltos.generaNumeroAleatorio(0, 2)];
    }

    private void creaAlumnos() {
        for (int i = 0; i < this.MAX_ALUMNOS; i++) {
            this.alumnos[i] = new Alumno();
        }
    }

    public boolean darClase() {
        if (!this.profesor.isAsistencia()) {
            System.out.println("El profesor no esta, no se puede dar clase");
            return false;
        } else if (!this.profesor.getMateria().equals(this.materia)) {
            System.out.println("La materia del aula no coincide con el profesor, no se puede dar clase");
            return false;
        } else if (!this.asistenciaAlumnos()) {
            System.out.println("La asistencia de alumnos no es suficiente, no se puede dar clase");
            return false;
        }
        System.out.println("Se puede dar clase");
        return true;
    }

    private boolean asistenciaAlumnos() {
        int cont = 0;
        for (int i = 0; i < this.alumnos.length; i++) {
            if (this.alumnos[i].isAsistencia()) {
                cont++;
            }
        }
        return (cont > (int) this.MAX_ALUMNOS / 2);
    }

    public void notas() {
        int chicosAprobados = 0;
        int chicasAprobadas = 0;

        for (int i = 0; i < this.alumnos.length; i++) {
            if (alumnos[i].getSexo() == 'H' && this.alumnos[i].getNota() >= 5) {
                chicosAprobados++;
            } else if (alumnos[i].getSexo() == 'M' && this.alumnos[i].getNota() >= 5) {
                chicasAprobadas++;
            }
            System.out.println(alumnos[i].toString());
        }
        System.out.println("Chicos aprobados: " + chicosAprobados);
        System.out.println("Chicas aprobadas: " + chicasAprobadas);
    }

}

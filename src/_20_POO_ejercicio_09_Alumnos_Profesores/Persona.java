package _20_POO_ejercicio_09_Alumnos_Profesores;

public abstract class Persona {

    private final String[] NOMBRES_CHICOS = {"Pepe", "Fernando", "Alberto", "Nacho"};
    private final String[] NOMBRES_CHICAS = {"Alicia", "Laura", "Clotilde", "Pepa"};
    private final int CHICO = 0;
    private final int CHICA = 1;

    private String nombre;
    private char sexo;
    private int edad;
    private boolean asistencia;

    public Persona() {
        int sexo = MetodosSueltos.generaNumeroAleatorio(0, 1);
        if (sexo == this.CHICO) {
            this.sexo = 'H';
            nombre = NOMBRES_CHICOS[MetodosSueltos.generaNumeroAleatorio(0, 3)];
        } else {
            this.sexo = 'M';
            nombre = NOMBRES_CHICAS[MetodosSueltos.generaNumeroAleatorio(0, 3)];
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    abstract void disponibilidad();

}

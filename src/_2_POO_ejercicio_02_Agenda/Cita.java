package _2_POO_ejercicio_02_Agenda;

/**
 *
 * @author ivanc
 */
public class Cita {

    private int hora;
    private int minutos;
    private String titulo;
    private String texto;

    public Cita(int hora, int minutos, String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
        this.setHora(hora);
        this.setMinutos(minutos);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        // hora no valida lo ponemos a 0
        if (hora > 23 || hora < 0) {
            this.hora = 0;
            System.out.println("Hora NO valida, fijada a 0");
        } else {
            this.hora = hora;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        // minutos no validos, ponemos a 0
        if (minutos >= 60 || minutos < 0) {
            this.minutos = 0;
            System.out.println("Minutos no validos, fijados a 0");
            return;
        }

        //resto de casos
        switch (minutos % 5) {
            case 0:
                this.minutos = minutos;
                break;
            case 1:
                this.minutos = --minutos;
                break;
            case 2:
                this.minutos = minutos - 2;
                break;
            case 3:
                this.minutos = minutos + 2;
                break;
            case 4:
                this.minutos = ++minutos;
                break;
        }
        if (this.minutos == 60) {
            this.minutos = 55;
            System.out.println("Minutos fijados a " + this.minutos);
        }
    }
    
    @Override
    public String toString(){
        return "-> ("+this.getHora()+":"+this.getMinutos()+"): ["+this.getTitulo()+"] "+this.getTexto()+"\n";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}

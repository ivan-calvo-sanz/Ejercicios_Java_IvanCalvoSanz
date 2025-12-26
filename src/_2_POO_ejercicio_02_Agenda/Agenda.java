package _2_POO_ejercicio_02_Agenda;

/**
 *
 * @author ivanc
 */
public class Agenda {

    private static final int[] DIAS_MESES = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final String[] MESES = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julo", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private int anyo;
    private Pagina[] paginas;
    private Pagina paginaAbierta;

    public Agenda(int anyo) {
        this.anyo = anyo;
        this.paginas = new Pagina[365];
        int contadorMes = 1;
        int contadorDia = 1;
        for (int i = 0; i < this.paginas.length; i++) {
            this.paginas[i] = new Pagina(contadorDia++, contadorMes);
            if (contadorDia > DIAS_MESES[contadorMes - 1]) {
                contadorDia = 1;
                contadorMes++;
            }
        }
        this.paginaAbierta = this.paginas[0];
    }

    public void abrirPagina(int dia, int mes) {
        for (Pagina p : this.paginas) {
            if (p.getDia() == dia && p.getMes() == mes) {
                this.paginaAbierta = p;
                this.mostrarPaginaAbierta();
                return;
            }
        }
        System.out.println("PAGINA NO VALIDA");
        this.mostrarPaginaAbierta();
    }

    private void mostrarPaginaAbierta() {
        System.out.println("Pagina abierta --> " + this.paginaAbierta.getDia() + " de " + this.MESES[this.paginaAbierta.getMes() - 1] + " de " + this.anyo);
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public Pagina[] getPaginas() {
        return paginas;
    }

    public void setPaginas(Pagina[] paginas) {
        this.paginas = paginas;
    }

    public Pagina getPaginaAbierta() {
        return paginaAbierta;
    }

    public void setPaginaAbierta(Pagina paginaAbierta) {
        this.paginaAbierta = paginaAbierta;
    }

}

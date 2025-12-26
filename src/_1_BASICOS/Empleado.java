package _1_BASICOS;

/**
 *
 * @author ivanc
 */
public class Empleado {
    
    private String nombre;
    private int antiguedad;
    private double salario;
    private String clasificacion;
    
    public Empleado() {
    }
    
    public Empleado(String nombre, int antiguedad, double salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.setAntiguedad(antiguedad);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getAntiguedad() {
        return antiguedad;
    }
    
    public void setAntiguedad(int antiguedad) {
        if (antiguedad < 0) {
            this.antiguedad = 0;
        } else {
            this.antiguedad = antiguedad;
        }
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getClasificacion() {
        return clasificacion;
    }
    
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    public void mostrarClasificacion() {
        if (antiguedad >= 18) {
            System.out.println("Senior");
        } else if (antiguedad > 3) {
            System.out.println("Intermedio");
        } else {
            System.out.println("Principiante");
        }
    }
    
    public void mostrarParametros() {
        System.out.print("Nombre: " + this.nombre);
        System.out.print(" / Antiguedad: " + this.antiguedad);
        System.out.print(" / Salario: " + this.salario);
        System.out.println("");
    }
    
    public void subirSalario(double d) {
        this.setSalario(this.salario + this.salario * d / 100);
    }
    
}

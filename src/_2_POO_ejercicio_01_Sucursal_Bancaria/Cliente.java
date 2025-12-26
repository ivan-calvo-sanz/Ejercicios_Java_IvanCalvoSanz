package _2_POO_ejercicio_01_Sucursal_Bancaria;

import java.time.LocalDate;

/**
 *
 * @author ivanc
 */
public class Cliente {

    private String nombre;
    private String apellidos;
    private String direccion;
    private String ciudad;
    private LocalDate fNacimiento;

    ////////////////////////////////////////
    // CONSTRUCTORES
    ////////////////////////////////////////
    public Cliente(String nombre, String apellidos, String direccion, String ciudad, LocalDate fNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.fNacimiento = fNacimiento;
    }

    ////////////////////////////////////////
    // GETTERS & SETTERS
    ////////////////////////////////////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    ////////////////////////////////////////
    // METODOS
    ////////////////////////////////////////
    public String nombreCompleto() {
        return this.nombre + " " + this.apellidos;
    }

    public String direccionCompleta() {
        return this.direccion + ", " + this.ciudad;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talentotech.Excercises.POO;

/**
 *
 * @author Alexander
 */
public abstract class Persona {
    private String cedula;
    private String nombreCompleto;
    private String direccion;
    private String telefono;

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombreCompleto=" + nombreCompleto + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    public Persona(String cedula, String nombreCompleto, String direccion, String telefono) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}

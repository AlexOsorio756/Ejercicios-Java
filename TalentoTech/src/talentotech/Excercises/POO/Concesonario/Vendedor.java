/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talentotech.Excercises.POO.Concesonario;

/**
 *
 * @author Est01
 */
public class Vendedor extends Persona {
    private String codigoVendedor;

    public Vendedor(String codigoVendedor, String cedula, String nombreCompleto, String direccion, String telefono) {
        super(cedula, nombreCompleto, direccion, telefono);
        this.codigoVendedor = codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "codigoVendedor=" + codigoVendedor + '}';
    }
    
}

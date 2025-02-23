/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talentotech.Excercises.POO;

import talentotech.Excercises.POO.Persona;

/**
 *
 * @author Est01
 */
public class Cliente extends Persona {
    private String codigoCliente;

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public Cliente(String codigoCliente, String cedula, String nombreCompleto, String direccion, String telefono) {
        super(cedula, nombreCompleto, direccion, telefono);
        this.codigoCliente = codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigoCliente=" + codigoCliente + '}';
    }
    
}

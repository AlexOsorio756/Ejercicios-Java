/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talentotech.Excercises.POO;

/**
 *
 * @author Est01
 */
public class Venta {
    private Vendedor vendedor;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private String fechaVenta;

    public Venta(Vendedor vendedor, Cliente cliente, Vehiculo vehiculo, String fechaVenta) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaVenta = fechaVenta;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public String toString() {
        return "Venta{" + "vendedor=" + vendedor + ", cliente=" + cliente + ", vehiculo=" + vehiculo + ", fechaVenta=" + fechaVenta + '}';
    }
    
}

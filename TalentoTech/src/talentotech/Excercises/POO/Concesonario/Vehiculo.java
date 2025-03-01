/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talentotech.Excercises.POO.Concesonario;

/**
 *
 * @author Est01
 */
public class Vehiculo {
    private String marca;
    private int modelo;
    private String referencia;
    private double precio;

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", referencia=" + referencia + ", precio=" + precio + '}';
    }

    public Vehiculo(String marca, int modelo, String referencia, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.referencia = referencia;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talentotech.Excercises.POO.Concesonario;
import java.util.ArrayList;

/**
 *
 * @author Alexander
 */
public class Inventario {
    private ArrayList<Vehiculo> vehiculos;

    public Inventario() {
        this.vehiculos = new ArrayList<>();
    }
    
    //Metodo para agregar vehiculo:
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    //Metodo para eliminar vehiculo:
    public void eliminarVehiculo(Vehiculo vehiculo){
        vehiculos.remove(vehiculo);
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    @Override
    public String toString() {
        return "Inventario{" + "vehiculos=" + vehiculos + '}';
    }
    
    public boolean comprobarSiEstaVacioElInventario(){
        return vehiculos.isEmpty();
    }
}

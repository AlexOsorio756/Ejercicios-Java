/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talentotech.Excercises.POO.Concesonario;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Optional;

/**
 *
 * @author Est01
 * @description Esta clase maneja un consecionario de vehiculos y gestiona clientes, vendedores e inventario.
 * @see ver clase Vehiculo
 */

public class Concesionario {
    /**
     * @param args the comand line arguments
     */
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Venta> ventas;
    private Inventario inventario;
    
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
    public void agregarVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
    }
    public  ArrayList<Vendedor> getVendedores(){
        return vendedores;
    }
    
    public void agregarVehiculo(Vehiculo vehiculo){
        inventario.agregarVehiculo(vehiculo);
    }
    
    public void eliminarVehiculo(Vehiculo vehiculo){
        inventario.eliminarVehiculo(vehiculo);
    }
    
    public ArrayList<Vehiculo> getInventario(){
        return inventario.getVehiculos();
    }
    
    public void registrarVenta(Vendedor vendedor, Cliente cliente, Vehiculo vehiculo, String fechaVenta){
        Venta venta = new Venta(vendedor,cliente,vehiculo,fechaVenta);
        ventas.add(venta);
    }
    
    public void pedirDatosCliente(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el codigo del cliente: ");
        String codigoCliente = scanner.nextLine(); 
        System.out.print("Ingrese cedula del cliente: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese nombre del cliente: ");
        String nombre = scanner.nextLine();       
        System.out.print("Ingrese direccion del cliente: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese telefono del cliente: ");
        String telefono = scanner.nextLine();
        Cliente clienteNuevo = new Cliente(codigoCliente,cedula,nombre,direccion,telefono);
        this.agregarCliente(clienteNuevo);
        System.out.println("Cliente agregado correctamente.");
    }
    
    public void pedirDatosVendedor(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el codigo del vendedor: ");
        String codigoVendedor = scanner.nextLine(); 
        System.out.print("Ingrese cedula del vendedor: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese nombre del vendedor: ");
        String nombre = scanner.nextLine();       
        System.out.print("Ingrese direccion del vendedor: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese telefono del vendedor: ");
        String telefono = scanner.nextLine();
        Vendedor vendedorNuevo = new Vendedor(codigoVendedor,cedula,nombre,direccion,telefono);
        this.agregarVendedor(vendedorNuevo);
        System.out.println("Vendedor agregado correctamente.");
    }
    
    public void pedirDatosVehiculo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el modelo del vehiculo: ");
        String modelo = scanner.nextLine(); 
        System.out.print("Ingrese el año del vehiculo: ");
        int año = scanner.nextInt();
        System.out.print("Ingrese la referencia del vehiculo: ");
        String referencia = scanner.nextLine();       
        System.out.print("Ingrese el precio del vehiculo: ");
        int precio = scanner.nextInt();
        Vehiculo nuevoVehiculo = new Vehiculo(modelo,año,referencia,precio);
        this.agregarVehiculo(nuevoVehiculo);
        System.out.println("Vehiculo agregado correctamente.");
    }
    
    public Cliente buscarCliente(String cedula){
        for(Cliente cliente : clientes){
            if(cliente.getCedula().equals(cedula)){
                return cliente;
            }
        }
        return null;
    }
    
    public Vendedor buscarVendedor(String cedula){
        for(Vendedor vendedor : vendedores){
            if(vendedor.getCedula().equals(cedula)){
                return vendedor;
            }
        }
        return null;
    }
    
    public void registrarVenta(){
        Scanner scanner = new Scanner(System.in);
        if(clientes.isEmpty() || vendedores.isEmpty() || inventario.comprobarSiEstaVacioElInventario()){
            return;
        }else{
            String cedulaCliente, cedulaVendedor;
            do{
                System.out.println("Ingrese la cedula del cliente: ");
                cedulaCliente = scanner.nextLine();
            }
            while(buscarCliente(cedulaCliente) == null);
            do{
                System.out.println("Ingrese la cedula del vendedor: ");
                cedulaVendedor = scanner.nextLine();
            }
            while(buscarVendedor(cedulaVendedor) == null);
        }
    }
    
    public void mostrarCarros(){
        int idx = 1;
        for(Vehiculo vehiculo : inventario.getVehiculos()){
            System.out.println(idx+". " + vehiculo);
            idx++;
        }
    }
   
    
    public static void main(String[] args){
        
       //Instanciar las clases
       Concesionario concesionario = new Concesionario();
       
       //Crear objetos, CLIENTE, VENDEDOR, VEHICULO
       
       
       //Registramos la venta
       //concesionario.registrarVenta(vendedorUno, clienteUno, vehiculoUno, fechaVentaUno);
       
       System.out.println(concesionario);
       
        
    }

    public Concesionario() {
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.inventario = new Inventario();
    }

    @Override
    public String toString() {
        return "Concesionario{" + "clientes=" + clientes + ", vendedores=" + vendedores + ", ventas=" + ventas + ", inventario=" + inventario + '}';
    }
    
}

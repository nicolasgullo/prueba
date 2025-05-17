/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadereservas;

/**
 *
 * @author Gullito
 */
public abstract class Reserva {
    protected String nombreCliente;
    protected String fecha;
    
    public abstract double calcularCosto();
        
    public abstract String generarDescripcion();
    
    public void mostrarResumen(){
        System.out.println("Descripcion: "+ this.generarDescripcion()+ " Costo: " + this.calcularCosto());
    }
    
}

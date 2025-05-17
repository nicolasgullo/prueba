/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadereservas;

/**
 *
 * @author Gullito
 */
public class ReservaEquipo extends Reserva{
    private String tipoEquipo;
    private double costoFijo;

    public ReservaEquipo(String tipoEquipo, double costoFijo) {
        this.tipoEquipo = tipoEquipo;
        this.costoFijo = costoFijo;
    }

    @Override
    public double calcularCosto() {
        return costoFijo;
    }

    @Override
    public String generarDescripcion() {
        String mensaje = "Reserva del Equipo " + tipoEquipo + " a " + "$" + costoFijo;
        return mensaje; 
    }
    
    
    
}

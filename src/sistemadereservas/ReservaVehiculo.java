/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadereservas;

/**
 *
 * @author Gullito
 */
public class ReservaVehiculo extends Reserva{
    private int dias;
    private double tarifaDiaria;

    public ReservaVehiculo(int dias, double tarifaDiaria) {
        this.dias = dias;
        this.tarifaDiaria = tarifaDiaria;
    }
    
    @Override
    public double calcularCosto() {
        return dias * tarifaDiaria;
    }

    @Override
    public String generarDescripcion() {
        String mensaje = "Reserva de Vehiculo por " + dias + " dias, a " + tarifaDiaria + " por dia.";
        return mensaje;
    }
    
}

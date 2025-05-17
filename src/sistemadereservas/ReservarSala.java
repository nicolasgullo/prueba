/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadereservas;

/**
 *
 * @author Gullito
 */
public class ReservarSala extends Reserva {
    public static int horas;
    public static double costoPorHora;

    public ReservarSala(int horas, double costoPorHora) {
        ReservarSala.horas = horas;
        ReservarSala.costoPorHora = costoPorHora;
    }
 
    @Override
    public double calcularCosto() {
        return horas * costoPorHora;
    }

    @Override
    public String generarDescripcion() {
        String mensaje = "Reserva de Sala por " + horas + " horas, a " + costoPorHora + " por hora.";
        return mensaje;
    }
    
}

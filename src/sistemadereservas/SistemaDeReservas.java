/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadereservas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gullito
 */
public class SistemaDeReservas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Reserva>listaDeReservas = new ArrayList<>();
        double total = 0;
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        Reserva reserva;
        
        do {
            System.out.println(" Menú opciones");
            System.out.println("1. Agregar reserva de sala");
            System.out.println("2. Agregar reserva de vehiculo");
            System.out.println("3. Agregar reserva de equipo");
            System.out.println("4. Mostrar detalles de reservas");
            System.out.println("5. Mostrar costo de reservas");
            System.out.println("0. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la catidad de horas");
                    Scanner sc2 = new Scanner(System.in);
                    int hora = sc2.nextInt();
                    System.out.println("Ingrese el costo por hora");
                    Scanner sc3 = new Scanner(System.in);
                    double costoHora = sc3.nextDouble();
                    reserva = new ReservarSala(hora, costoHora);     
                    reserva.generarDescripcion();  
                    listaDeReservas.add(reserva);
                    break;
                case 2:
                    System.out.println("Ingrese la catidad de dias");
                    Scanner sc4 = new Scanner(System.in);
                    int dias = sc4.nextInt();
                    System.out.println("Ingrese el costo por dia");
                    Scanner sc5 = new Scanner(System.in);
                    double costoDiario = sc5.nextDouble();
                    reserva = new ReservaVehiculo(dias, costoDiario);        
                    reserva.generarDescripcion();  
                    listaDeReservas.add(reserva);      
                    break;
                case 3:
                    System.out.println("Ingrese el tipo de equipo");
                    Scanner sc6 = new Scanner(System.in);
                    String tipo = sc6.next();
                    System.out.println("Ingrese el costo del equipo");
                    Scanner sc7 = new Scanner(System.in);
                    int costo = sc7.nextInt();
                    reserva = new ReservaEquipo(tipo,costo);
                    reserva.generarDescripcion();  
                    listaDeReservas.add(reserva); 
                    break;
                case 4:
                    for (int i = 0; i < listaDeReservas.size(); i++) {
                        Reserva r1 = listaDeReservas.get(i);
                        r1.mostrarResumen();
                    }
                    break;
                case 5:
                    for (int i = 0; i < listaDeReservas.size(); i++) {
                        Reserva r2 = listaDeReservas.get(i);
                        total += r2.calcularCosto();
                    }
                    System.out.println("Costo total= " + total);
                    total = 0;
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);
        
        
        
        
        
    }
    
}

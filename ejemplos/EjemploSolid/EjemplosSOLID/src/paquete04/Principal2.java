/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author spart
 */
public class Principal2 {

    public static void main(String[] args) {
        //1. Agregar por teclado n numero de transportes(el usuario decide fin)
        //Bus, taxi, Aereo, Maritimo
        //Crear TiposTransporte
        //Presentar un reporte de los transportes
        //Reporte
        //Transporte Bus: 1.00
        //Transporte Maritimo: 1000.1
        //Transporte Bus: 31.22
        //Promedio Tarifas: ?
        Scanner sc = new Scanner(System.in);
        int opc;
        String siguiente;

        ArrayList<Transporte> lista = new ArrayList<>();

        do {
            
            System.out.println("Tipos de Transportes a seleccionar");
            System.out.println("1. Transporte Bus");
            System.out.println("2. Transporte Taxi");
            System.out.println("3. Transporte Maritimo");
            System.out.println("4. Transporte Aereo");
            System.out.println("Seleccione el numero del transporte: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    TransporteBus bus = new TransporteBus();
                    bus.establecerTarifa();
                    lista.add(bus);
                    break;

                case 2:
                    TransporteTaxi taxi = new TransporteTaxi();
                    taxi.establecerTarifa();
                    lista.add(taxi);
                    break;

                case 3:
                    TransporteMaritimo barco = new TransporteMaritimo();
                    barco.establecerTarifa();
                    lista.add(barco);
                    break;

                case 4:
                    TransporteAereo avion = new TransporteAereo();
                    avion.establecerTarifa();
                    lista.add(avion);
                    break;
                    
                default:
                    System.out.println("Error, elija una de las opciones disponibles");
                    break;
            }
            System.out.println("¿Quiere seguir ingresando un transporte?\n"
                    + "Pulse S para seguir ingresando o N para salir");
            siguiente = sc.nextLine();
            sc.nextLine();
        } while (siguiente.equals("S"));
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();
        System.out.print(tipos);
    }
}

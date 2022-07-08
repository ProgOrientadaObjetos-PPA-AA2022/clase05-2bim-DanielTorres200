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
        //Transporte Bus: 3.22
        //Promedio Tarifas: ?
        Scanner sc = new Scanner(System.in);
        System.out.println("Tipos de Transportes");
        System.out.println("Elija el transporte a ingresar: ");
        System.out.println("1. Transporte Bus");
        System.out.println("2. Transporte Taxi");
        System.out.println("3. Transporte Maritimo");
        System.out.println("4. Transporte Aereo");
        
        ArrayList<Transporte> lista = new ArrayList<>();
        
        int opc = 0;
        do {
            opc = sc.nextInt();
            switch(opc) {
                case 1:
                    TransporteBus bus = new TransporteBus();
                    System.out.println("Transporte Bus");
                    System.out.println("Ingrese el numero de transportes: ");
                    int n = sc.nextInt();
                    lista.add(e);
                    break;
                case 2:
                     TransporteTaxi taxi = new TransporteTaxi();
                    System.out.println("Transporte Taxi");
                    System.out.println("Ingrese el numero de transportes: ");
                    TransporteTaxi taxi = new TransporteTaxi();
                    taxi.establecerCooperativaTaxi("Yahuarcuna");
                    taxi.establecerTarifa();
                    lista.add(taxi);
                    break;
                case 3:
                    System.out.println("Transporte Matirimo");
                    System.out.println("Ingrese el numero de transportes: ");
                    int n = sc.nextInt();
                    lista.add(e);
                    break;
                case 4:
                    TransporteAereo avion = new TransporteAereo();
                    System.out.println("Transporte Aereo");
                    TransporteAereo.establecerTarifa();
                    lista.add(aereo);
            }
            if (opc < 5  )
        }
        
    }
}

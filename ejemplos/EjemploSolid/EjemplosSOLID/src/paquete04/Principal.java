/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;
import java.util.ArrayList;
/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteAereo avion = new TransporteAereo();
        avion.establecerTransporteAereo("Michoacan");
        avion.establecerTarifa();
        
        TransporteMaritimo barco = new TransporteMaritimo();
        barco.establecerTransporteMaritimo("Galapagos");
        barco.establecerTarifa();
        
        ArrayList<Transporte> lista = new ArrayList<>();
        lista.add(bus);
        lista.add(taxi);
        lista.add(avion);
        lista.add(barco);
        
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f", 
                tipos.obtenerPromedioTarifas());
        
    }
}

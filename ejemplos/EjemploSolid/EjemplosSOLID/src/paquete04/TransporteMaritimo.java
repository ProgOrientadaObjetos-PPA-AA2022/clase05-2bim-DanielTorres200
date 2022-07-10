/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author spart
 */
public class TransporteMaritimo extends Transporte{
    private String transporteMaritimo;

    public void establecerTransporteMaritimo(String n) {
        transporteMaritimo = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 600.00 + 400.1;
    }

    public String obtenerTransporteMaritimo() {
        return transporteMaritimo;
    }
    
    @Override 
    public String toString(){ 
        String cadena = String.format("Transporte Barcos\n"
                + "Transporte Maritimo: $ %.1f\n",obtenerTarifa());
        return cadena; 
    }
}

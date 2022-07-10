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
public class TransporteAereo extends Transporte{
    private String transporteAereo;

    public void establecerTransporteAereo(String n) {
        transporteAereo = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 40.00 + 20.50;
    }

    public String obtenerCooperativaBus() {
        return transporteAereo;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Transporte Aereo\n"
                + "Transporte aereo: $ %.2f\n" ,tarifa);
        return cadena; 
    }
}

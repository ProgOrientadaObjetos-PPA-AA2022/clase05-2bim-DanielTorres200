/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class TransporteBus extends Transporte {

    private String cooperativaBus;

    public void establecerCooperativaBus(String n) {
        cooperativaBus = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 0.70 + 0.30;
    }

    public String obtenerCooperativaBus() {
        return cooperativaBus;
    }
    
    @Override 
    public String toString(){
        String cadena = String.format("Cooperativa Bus\n"
                + "Transporte bus: $ %.2f\n",obtenerTarifa());
        return cadena; 
    }
}

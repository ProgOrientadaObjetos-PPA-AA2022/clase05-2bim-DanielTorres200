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
        tarifa = 1000.00 + 1;
    }

    public String obtenerTransporteMaritimo() {
        return transporteMaritimo;
    }
}

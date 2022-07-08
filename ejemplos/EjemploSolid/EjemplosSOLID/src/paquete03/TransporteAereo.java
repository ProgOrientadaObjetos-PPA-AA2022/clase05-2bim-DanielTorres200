/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author spart
 */
public class TransporteAereo {
    private String cooperativaAerea;
    public double tarifa;
    
    public void establecerTransporteAerea(String n){
        cooperativaAerea = n;
    }
    
    public void establecerTarifa(){
        tarifa = 4.00 + 0.40;
    }
    
    public String obtenerCooperativaBus(){
        return cooperativaAerea;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
}

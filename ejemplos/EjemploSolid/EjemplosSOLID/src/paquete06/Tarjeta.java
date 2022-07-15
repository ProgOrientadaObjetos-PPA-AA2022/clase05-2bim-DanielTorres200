/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author spart
 */
public class Tarjeta {
    private String nombreBanco; //tipo tarjeta(nombre banco, cupo maximo)
    private double cupoMaximo;

    public Tarjeta(String nB, double cM) {
        nombreBanco = nB;
        cupoMaximo = cM;
    }
    
    public void establecerNombreBanco(String n){
        nombreBanco = n;
    }
    
    public void establecerCupoMaximo(double c){
        cupoMaximo = c;
    }
    
    public String obtenerNombreBanco(){
        return nombreBanco;
    }
    
    public double obtenerCupoMaximo(){
        return cupoMaximo;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Nombre del banco: %s"
                + "Cupo maximo: ", 
                nombreBanco,
                cupoMaximo);
        return cadena;
    } 
}

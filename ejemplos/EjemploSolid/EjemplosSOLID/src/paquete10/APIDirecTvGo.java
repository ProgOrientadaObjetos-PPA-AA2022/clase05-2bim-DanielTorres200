/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;

import java.io.Serializable;
/**
 *
 * @author spart
 */
public class APIDirecTvGo implements APIMovie,Serializable {
     private String apiKey;
    
    @Override
    public void establecerApiKey(String ak){
        apiKey = String.format("%s%s", ak , 987654321);
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
    
    @Override
    public String toString() {
        return "DirecTVGo";
    } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class APINetflix implements APIMovie {

    private String apiKey;

    @Override
    public void establecerApiKey(String ak) {
        apiKey = String.format("%s%s", ak, 123123);
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
    }
    
     @Override
    public String toString() {
        return "Netflix";
    } 

}

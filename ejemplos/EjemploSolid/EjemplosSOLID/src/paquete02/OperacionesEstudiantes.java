/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;
import paquete01.Persona;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private String promedioEdadesCualitativo;
    // private double edadminima;

    /*
    promedioEdadesCualitativo;
    promedio jovenes: mayorr igual a 0 y menor igual a21
    promedio adulto: mayor a 21
     */
    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public void establecerPromedioEdadesCualitativo() {
        if (promedioEdades >= 0 && promedioEdades <= 21) {
            promedioEdadesCualitativo = "Promedio jovenes";

        } else {
            if (promedioEdades > 21) {
                promedioEdadesCualitativo = "Promedio cualitativo:";

            }
        };
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        //
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }
        /*
        for (int i = 0; i < obtenerEstudiante().size; i++) {
            suma = suma + obtenerEstudiante().get(i).obtenerEdad();
        }
         */
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }
    public String obtenerPromedioCualitativo() {
        return promedioEdadesCualitativo;
    }

    @Override
    public String toString() {
        String cadena = "Promedio Edades Cualitativos";
        for(Persona e: obtenerEstudiante()){
            cadena = String.format("%s\n%s",cadena,e.obtenerNombre());                 
        }        

        cadena = String.format("%s\n"
                + "Promedio Edades: %.2f\n"
                + "Promedio Edades Cualitativos : %s\n",
                cadena,
                promedioEdades,
                promedioEdadesCualitativo);
        return cadena;
    }
}

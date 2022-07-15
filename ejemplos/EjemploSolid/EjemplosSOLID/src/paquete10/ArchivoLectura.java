/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author spart
 */
public class ArchivoLectura {

    private ObjectInputStream entrada;
    private ArrayList<GeneradorPeliculas> peliculas;
    private String nombreArchivo;

    public ArchivoLectura(String n) {
        nombreArchivo = n;
        File f = new File(nombreArchivo);
        if (f.exists()) {
            try {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } catch (IOException ioException) {
                System.err.println("Error al abrir el archivo.");
            }
        }
    }

    public void establecerGeneradorPelicula() {
        peliculas = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    GeneradorPeliculas registro = (GeneradorPeliculas) entrada.readObject();
                    peliculas.add(registro);
                } catch (EOFException endOfFileException) {
                    return;
                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                    break;
                }
            }
        }
    }

    public ArrayList<GeneradorPeliculas> obtenerGeneradorPelicula() {
        return peliculas;
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Generadores de Peliculas\n";
        for (int i = 0; i < obtenerGeneradorPelicula().size(); i++){
            GeneradorPeliculas p = obtenerGeneradorPelicula().get(i);
            cadena = String.format("%s%s\n", cadena,p.toString());
        }
        return cadena;
    }

    public void cerrarArchivo() {
        try {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } catch (IOException ioException) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
    }
}

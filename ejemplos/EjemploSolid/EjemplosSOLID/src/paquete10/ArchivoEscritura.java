/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author spart
 */
public class ArchivoEscritura {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private GeneradorPeliculas registro;
    private ArrayList<GeneradorPeliculas> lista;

    public ArchivoEscritura(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaPeliculas();

        try {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));

            if (obtenerListaPeliculas().size() > 0) {
                for (int i = 0; i < obtenerListaPeliculas().size(); i++) {
                    establecerRegistroPeliculas(obtenerListaPeliculas().get(i));
                    establecerSalida();
                }
            }
        } catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRegistroPeliculas(GeneradorPeliculas p) {
        registro = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registro);
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    public void establecerListaPeliculas() {
        ArchivoLectura lectura = new ArchivoLectura(obtenerNombreArchivo());
        lectura.establecerGeneradorPelicula();
        lista = lectura.obtenerGeneradorPelicula();
    }
    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<GeneradorPeliculas> obtenerListaPeliculas() {
        return lista;
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void cerrarArchivo() {
        try {
            if (salida != null) {
                salida.close();
            }
        } catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
        }
    }
}

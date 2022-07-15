/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;

/**
 *
 * @author spart
 */
public class Principal2 {
    public static void main(String[] args) {
        
        String nombreArchivo = "peliculas.data";
        
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");

        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp);
        

        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");

        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println(gp2);


        APIStarPlus api3 = new APIStarPlus();
        api3.establecerApiKey("5014785");

        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");
        System.out.println(gp3);

        
        APIDirecTvGo api4 = new APIDirecTvGo();
        api4.establecerApiKey("514189");

        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api=");
        System.out.println(gp4);

        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);

        archivo.establecerRegistroPeliculas(gp);
        archivo.establecerSalida();
        archivo.establecerRegistroPeliculas(gp2);
        archivo.establecerSalida();
        archivo.establecerRegistroPeliculas(gp3);
        archivo.establecerSalida();
        archivo.establecerRegistroPeliculas(gp4);
        archivo.establecerSalida();
        
        archivo.cerrarArchivo();
    }
}

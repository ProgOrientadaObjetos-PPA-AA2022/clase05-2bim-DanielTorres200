/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //1. Crear 3 personas
        Persona person1 = new Persona("Jose", 20);
        Persona person2 = new Persona("Sebastian", 21);
        Persona person3 = new Persona("Sofia", 20);
        //2. Agregr a un arrailist
         ArrayList<Persona> personas = new ArrayList<>();
        personas.add(person1);
        personas.add(person2);
        personas.add(person3);
        //3. Generar el objeto de tipo Operaciones Estudiante
        OperacionesEstudiantes operaciones = new OperacionesEstudiantes();
        operaciones.establecerEstudiante(Persona);
        operaciones.establecerPromedioEdades();
        
        //4. Presentar el ToString de Operaciones Estudiantes
        System.out.println("%s\n", operaciones);      
    }
}

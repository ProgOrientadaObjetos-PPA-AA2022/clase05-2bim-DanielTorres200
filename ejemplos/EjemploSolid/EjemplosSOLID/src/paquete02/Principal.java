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
         ArrayList<Persona> persona = new ArrayList<>();
        persona.add(person1);
        persona.add(person2);
        persona.add(person3);
        //3. Generar el objeto de tipo Operaciones Estudiante
        OperacionesEstudiantes operaciones = new OperacionesEstudiantes();
        operaciones.establecerEstudiante(persona);
        operaciones.establecerPromedioEdades();
        
        //4. Presentar el ToString de Operaciones Estudiantes
        System.out.println(operaciones);      
    }
}

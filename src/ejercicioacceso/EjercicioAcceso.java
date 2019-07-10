/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioacceso;
public class Test{
    Persona Persona2=new Persona();
    
}
import paket2.Persona;

/**
 *
 * @author Java Martes
 */
public class EjercicioAcceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona persona1=new Persona();
        persona1.setNombre("Juan");
        System.out.println(persona1.getNombre());
        
        
    }
    
}

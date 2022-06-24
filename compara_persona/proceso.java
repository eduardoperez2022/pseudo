/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compara_persona;

/**
 *
 * @author eperez50
 */
public class proceso {
    
    public int compara(persona p1, persona p2) {
        
        int respuesta=0;
        
        int edad1 = p1.getEdad();
        int edad2 = p2.getEdad();
        
        if (edad1 >= edad2) {
            respuesta = 1;
        }
        else {
            respuesta = 2;
        }
        
        return respuesta;
    }
    
}

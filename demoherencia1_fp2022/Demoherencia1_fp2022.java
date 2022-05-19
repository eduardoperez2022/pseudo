/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia1_fp2022;


/**
 *
 * @author eperez50
 */
public class Demoherencia1_fp2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona vecina = new Persona ("Luisa","Asenjo Martinez",1978);
        
        Alumno unAlumno = new Alumno ("Juan", "Hugarte Lopez", 1985);
        
        unAlumno.ponGrupo("66", 'M');
        
        vecina.imprime();
        
        unAlumno.imprime(); 
        
        unAlumno.imprimeGrupo(); 
        
    }
    
}

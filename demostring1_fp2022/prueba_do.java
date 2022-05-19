/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostring1_fp2022;

/**
 *
 * @author eperez50
 */
public class prueba_do {
    
    public void prueba_1() {
        
        int contador = 0 ;
        
        do {   
            System.out.println ("Contando... " + (contador) );
            contador += 1;
        } 
        while (contador<10);     
    
    }   
    
    public void prueba_2() {
        
        int contador = 0 ;
        do {   
            System.out.println ("Contando... " + (contador) );
            contador += 1;
            if (contador > 10) {
                break;
            }
        } while (true);     
    
    }   

    public void prueba_3() {
        
        int contador = 0 ;
        do {   
            System.out.println ("Contando... " + (contador) );
            contador += 1;
            if (contador > 10) 
                break;
            
        } while (true);     
    
    }   

    
}

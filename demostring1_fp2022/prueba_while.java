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
public class prueba_while {
    
    public void prueba() {
        
        int i = 0;
        while (true) {          //Condición trivial: siempre cierta
            i++;
            System.out.println ("Valor de i: " + i);
            if (i==9) { 
                System.out.println ("Salida por break");
                break;
            }
        }                

        
        
    }
    
    public void prueba_2() {
        
        int i = 0;
        while ( i<9 ) {          //Condición trivial: siempre cierta
            i++;
            if (i==5) {
                continue;
            }
            System.out.println ("Valor de i: " + i);
        }                
        
    }


}

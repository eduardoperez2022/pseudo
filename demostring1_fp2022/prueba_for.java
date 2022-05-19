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
public class prueba_for {
    
    public void prueba_1() {
        
        for (int cont=10; cont<=20; cont++  ) {
            
            if (cont != 15) {
                System.out.println("cont :" + cont);
            }
            
        }
        
    }
    

    public void prueba_2() {
        
        for (int cont=10; cont<=20; cont++  ) {
            
            if (cont <= 14 || cont >= 16) {
                System.out.println("cont :" + cont);
            }
            
        }
        
    }


    public void prueba_3() {
        
        for (int cont=10; cont<=20; cont++  ) {
            
            if (cont == 15) {
                continue;
            }
            
            System.out.println("cont :" + cont);
        }
        
    }

    public void prueba_4() {
        
        pepe:
        for (int cont=10; cont<=20; cont++  ) {
            
            if (cont == 15) {
                break pepe;
            }
            
            System.out.println("cont :" + cont);
        }
        
    }

    
}

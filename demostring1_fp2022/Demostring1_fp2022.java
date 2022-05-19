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
public class Demostring1_fp2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // prueba_do pd = new prueba_do();
        
        // pd.prueba_1();
        // pd.prueba_2();
        // pd.prueba_3();
        // pf.prueba_1();
        // pf.prueba_2();
        // pf.prueba_3();
        // pf.prueba_4();
        
        // prueba_while pw = new prueba_while();
        // pw.prueba();
        // pw.prueba_2();
        
        // prueba_for pf = new prueba_for();
        
        prueba_string ps = new prueba_string();
        
        ps.prueba_1();
        
        String par1 = "valor1";
        String par2 = "valor1";
        
        ps.prueba_igualdad(par1  , par2);

        ps.prueba_igualdad(par1.toLowerCase()  , par2.toUpperCase());
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia2_fp2022;

/**
 *
 * @author eperez50
 */
public class prueba_herencia2 {
    
    public void prueba() {
        
        coche Sedan = new coche ("Azul",3355566,2000);
        
        bote Velero = new bote ("Rojo",3355566);
        
        barco Fragata = new barco ("Amarillo",55667788);
        
        System.out.println("Coche:" + Sedan.toString());
        
        System.out.println("Bote:" + Velero.toString());
        
        System.out.println("Barco:" + Fragata.toString());
        
        
        System.out.println("Coche:" + Sedan.avanzar());
        
        // Velero.setAncla(0);
        System.out.println("Bote:" + Velero.avanzar());
        
        // Fragata.setAncla(0);
        System.out.println("Barco:" + Fragata.avanzar());

    }
    
    
}

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
public class prueba_string {
    
    public void prueba_1() {
    
        String name = "  Jose M. Diaz ";
        String bigname = name.toUpperCase();
        String littlename = name.toLowerCase();
        char initial = name.charAt(5);
        int size = name.length();
        
        String parte1 = name.substring(4);
        String parte2 = name.substring(4,7);
        String parte3 = name.trim();
        
        
        
        System.out.println("name: " + name);
        System.out.println("bigname: " + bigname);
        System.out.println("littlename: " + littlename);
        System.out.println("initial: " + initial);
        System.out.println("size: " + size);

        System.out.println("parte1: " + parte1);
        System.out.println("parte2: " + parte2);
        System.out.println("parte3: " + parte3);


    }


    public void prueba_igualdad(String par1, String par2) {
        
        System.out.println("--- compare ---");        
        
        if (par1.compareTo(par2) == 0) {
            System.out.println("compareTo: igual");
        }
        else {
            System.out.println("compareTo: NO igual");
        }
        
        if (par1.compareToIgnoreCase(par2) == 0) {
            System.out.println("compareToIgnoreCase: igual");
        }
        else {
            System.out.println("compareToIgnoreCase: NO igual");
        }
        
        if (par1.equals(par2)) {
            System.out.println("equals: igual");
        }
        else {
            System.out.println("equals: NO igual");
        }

    }

}

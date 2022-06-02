/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo12_incluye;

import java.util.Scanner;

/**
 *
 * @author eperez50
 */
public class menu {
    
    String frase1;
    String frase2;
    
    public void principal() {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese primera y segunda frase:");    
        this.frase1 = sc.nextLine();
        this.frase2 = sc.nextLine();


    }
}

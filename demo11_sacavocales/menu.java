/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo11_sacavocales;

import java.util.Scanner;

/**
 *
 * @author eperez50
 */
public class menu {
    
    String frase;
    
    public void principal() {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase:");    
        this.frase = sc.nextLine();

        proceso proc = new proceso();


    }
}

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
        proc.saca_vocales(this.frase);
        
        String salida1 = proc.getConstruido();
        
        proc.saca_vocales2(this.frase);
        
        String salida2 = proc.getConstruido();
        
        System.out.println("Salida metodo 1: " + salida1);
        System.out.println("Salida metodo 2: " + salida2);

    }
}

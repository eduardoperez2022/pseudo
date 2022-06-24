/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compara_persona;

import java.util.Scanner;

/**
 *
 * @author eperez50
 */
public class menu {
    
    public void principal() {
        
        Scanner sc = new Scanner(System.in);

        persona pers1 = new persona();
        persona pers2 = new persona();
        
        System.out.println("Ingrese nombre, edad y lugar de nacimiento persona 1:");    
        String nombre1 = sc.nextLine();
        pers1.setNombre(nombre1);

        int edad1 = sc.nextInt();
        sc.nextLine();
        pers1.setEdad(edad1);

        String naci1 = sc.nextLine();
        pers1.setLugar(naci1);


        System.out.println("Ingrese nombre, edad y lugar de nacimiento persona 2:");    
        String nombre2 = sc.nextLine();
        pers2.setNombre(nombre2);

        int edad2 = sc.nextInt();
        sc.nextLine();
        pers2.setEdad(edad2);

        String naci2 = sc.nextLine();
        pers2.setLugar(naci2);
        
        // System.out.println(pers1.toString());
        // System.out.println(pers2.toString());
        
        proceso proc = new proceso();
        int resultado = proc.compara(pers1, pers2);
        
        System.out.println("La persona de mayor edad es la " + resultado);
        
    }
    
    
    
}

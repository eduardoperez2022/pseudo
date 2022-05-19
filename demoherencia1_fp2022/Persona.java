/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia1_fp2022;

public class Persona {
    
    protected String nombre;
    
    protected String apellidos;
    
    protected int anyonacimiento;

    
    public Persona(String nombre, String apellidos, int anyonacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anyonacimiento = anyonacimiento;
    }
    
        
    public void imprime() {
        System.out.println("Datos personales:" + nombre + " " + apellidos + " "
        + " (" + anyonacimiento + ")");
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getAnyonacimiento() {
        return anyonacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setAnyonacimiento(int anyonacimiento) {
        this.anyonacimiento = anyonacimiento;
    }
    
    
    
    
}



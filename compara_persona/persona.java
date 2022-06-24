/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compara_persona;

/**
 *
 * @author eperez50
 */
public class persona {
    
    private String nombre;
    private int edad;
    private String lugar;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", edad=" + edad + ", lugar=" + lugar + '}';
    }
    
    
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia1_fp2022;

public class Alumno extends Persona {

    protected String grupo;
    protected char horario;

    public Alumno(String nombre, String apellidos, int anyonacimiento) {
        super(nombre, apellidos, anyonacimiento);
    }
    
    public void ponGrupo(String grupo, char horario) {
        
        if (grupo == null || grupo.length() == 0) {
            System.out.println("Grupo no valido!");
        }
        
        if (horario == 'M' || horario == 'T') {
            System.out.print("");
        }
        else {
            System.out.println("Horario no valido!");
        }
        
        this.grupo = grupo;
        this.horario = horario;
    }

    
    public void imprimeGrupo() {
        System.out.println( " Grupo " + grupo + horario);
    }
    
    
    public String getGrupo() {
        return grupo;
    }

    public char getHorario() {
        return horario;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setHorario(char horario) {
        this.horario = horario;
    }

}

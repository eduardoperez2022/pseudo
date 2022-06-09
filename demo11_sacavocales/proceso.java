/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo11_sacavocales;

/**
 *
 * @author eperez50
 */
public class proceso {
    
    private String construido="";
    
    public void saca_vocales(String pfrase) {
        // usar ciclo for y charAt
        int largo = pfrase.length();
        String salida="";
        
        for (int i = 0; i < largo; i++) {
            char unchar = pfrase.charAt(i);
            if (unchar == 'a') {
                salida = salida.concat("");
            }
            else if (unchar == 'e') {
                salida = salida.concat("");
            }
            else if (unchar == 'i') {
                salida = salida.concat("");
            }
            else if (unchar == 'o') {
                salida = salida.concat("");
            }
            else if (unchar == 'u') {
                salida = salida.concat("");
            }
            else {
                salida = salida.concat(String.valueOf(unchar));
            }
        }
        this.construido = salida;
    }

    public void saca_vocales2(String pfrase) {
        // usar String.replace
        String salida=pfrase;
        
        salida = salida.replace("a", "");
        salida = salida.replace("e", "");
        salida = salida.replace("i", "");
        salida = salida.replace("o", "");
        salida = salida.replace("u", "");
        
        this.construido = salida;
    }

    public String getConstruido() {
        return construido;
    }
    
}

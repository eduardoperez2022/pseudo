/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia2_fp2022;

public class coche extends vehiculo {
    // cilindrada del coche

    private int cilindrada;

    /**
     * Construye un coche
     *
     * @param color color del coche
     * @param numSerie número de serie del coche
     * @param cilindrada cilindrada del coche
     */
    public coche(String color, int numSerie, int cilindrada) {

        super(color, numSerie);

        this.cilindrada = cilindrada;
    }

    /**
     * Obtiene la cilindrada del coche …
     */
    public int cilindrada() {
        return cilindrada;
    }

    /**
     * Cambia la cilindrada del coche …
     */
    public void cambiaCilindrada(int nueva) {
        cilindrada = nueva;
    }

    @Override
    public String toString() {
        return super.toString() + ", cilindrada= " + cilindrada;
    }
    
    
}

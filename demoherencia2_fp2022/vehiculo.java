/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia2_fp2022;

public class vehiculo {

    // atributos privados
    private String color;
    private int numSerie;

    /**
     * Construye un vehículo
     *
     * @param color color del vehículo
     * @param numSerie número de serie del vehículo
     */
    public vehiculo(String color, int numSerie) {
        this.color = color;
        this.numSerie = numSerie;
    }

    /**
     * Retorna un texto con los datos del vehículo
     *
     * @return texto con los datos del vehículo
     */
    @Override
    public String toString() {
        return "Vehículo -> numSerie= "+ numSerie + ", color= " + color;
    }
    
    public String avanzar() {
        return "En movimiento";
    }

}

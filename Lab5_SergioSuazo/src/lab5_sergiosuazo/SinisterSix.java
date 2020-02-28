/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_sergiosuazo;

/**
 *
 * @author Sergio
 */
public class SinisterSix extends Villano{

    public SinisterSix() {
    }

    public SinisterSix(String nombre, String origen, int edad, int altura, int muertes, boolean carcel) {
        super(nombre, origen, edad, altura, muertes, carcel);
    }

    @Override
    public String toString() {
        return "SinisterSix{" + '}';
    }
    
}

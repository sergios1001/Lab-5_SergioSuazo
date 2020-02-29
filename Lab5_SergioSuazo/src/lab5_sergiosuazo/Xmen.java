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
public class Xmen extends Heroe{

    public Xmen() {
    }

    public Xmen(String nombre, String origen, int edad, int altura, int atrapados) {
        super(nombre, origen, edad, altura, atrapados);
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
}

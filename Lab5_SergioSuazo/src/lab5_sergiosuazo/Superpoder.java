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
public class Superpoder {
    private int poder;
    private String descripcion;
    private boolean mortal;

    public Superpoder() {
    }

    public Superpoder(int poder, String descripcion, boolean mortal) {
        this.poder = poder;
        this.descripcion = descripcion;
        this.mortal = mortal;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isMortal() {
        return mortal;
    }

    public void setMortal(boolean mortal) {
        this.mortal = mortal;
    }

    @Override
    public String toString() {
        return "Superpoder{" + "poder=" + poder + ", descripcion=" + descripcion + ", mortal=" + mortal + '}';
    }
    
}

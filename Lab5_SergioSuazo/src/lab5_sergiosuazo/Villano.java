/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_sergiosuazo;

import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class Villano {
    private String nombre,origen;
    private int edad,altura,muertes;
    private boolean carcel;
    private ArrayList<Superpoder> superpoderes=new ArrayList<>();

    public Villano() {
    }

    public Villano(String nombre, String origen, int edad, int altura, int muertes, boolean carcel) {
        this.nombre = nombre;
        this.origen = origen;
        this.edad = edad;
        this.altura = altura;
        this.muertes = muertes;
        this.carcel = carcel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getMuertes() {
        return muertes;
    }

    public void setMuertes(int muertes) {
        this.muertes = muertes;
    }

    public boolean isCarcel() {
        return carcel;
    }

    public void setCarcel(boolean carcel) {
        this.carcel = carcel;
    }

    public ArrayList<Superpoder> getSuperpoderes() {
        return superpoderes;
    }

    public void setSuperpoderes(ArrayList<Superpoder> superpoderes) {
        this.superpoderes = superpoderes;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}

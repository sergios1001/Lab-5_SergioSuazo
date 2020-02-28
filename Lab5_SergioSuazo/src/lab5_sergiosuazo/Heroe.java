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
public class Heroe {
    private String nombre,origen;
    private int edad,altura,atrapados;
    private ArrayList<Superpoder> superpoderes=new ArrayList<>();

    public Heroe() {
    }

    public Heroe(String nombre, String origen, int edad, int altura, int atrapados) {
        this.nombre = nombre;
        this.origen = origen;
        this.edad = edad;
        this.altura = altura;
        this.atrapados = atrapados;
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

    public int getAtrapados() {
        return atrapados;
    }

    public void setAtrapados(int atrapados) {
        this.atrapados = atrapados;
    }

    public ArrayList<Superpoder> getSuperpoderes() {
        return superpoderes;
    }

    public void setSuperpoderes(ArrayList<Superpoder> superpoderes) {
        this.superpoderes = superpoderes;
    }

    @Override
    public String toString() {
        return "Heroe{" + "nombre=" + nombre + ", origen=" + origen + ", edad=" + edad + ", altura=" + altura + ", atrapados=" + atrapados + ", superpoderes=" + superpoderes + '}';
    }
    
    
}

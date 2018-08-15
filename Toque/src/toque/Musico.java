/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toque;

/**
 *
 * @author Estudiantes
 */



public class Musico implements Preparacion {
    
    Instrumento ins = new  Instrumento();
    public Musico() {
        String Nombre;
        //Algo
    }

    @Override
    public void afinar(Instrumento ins) {
        if(ins.Afinabilidad==true)
            System.out.println("Instrumento Afinado");
        else
            System.out.println("No es necesario afinar");
    }

    @Override
    public void tocar(Instrumento ins) {
        System.out.println("♫♪♫♪♫");
    }
    
}

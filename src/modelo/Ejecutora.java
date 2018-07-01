/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author deniz
 */
public class Ejecutora {
    public static void main(String[] args) {
        
        FuenteDatos f = new FuenteDatos();
        f.agregarAgenda();
        f.agregarPersona();
        f.mostrar();
        System.out.println("exito!!!");
        
    }
 
}

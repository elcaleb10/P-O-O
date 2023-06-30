/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodeautos;

/**
 *
 * @author CalebZG
 */
public class Prueba {

    public static void main(String args[]) {
        Auto auto = new Auto("Chevrolet", "X", 250);
        auto.acelelar(20);
        auto.encender();
        auto.acelelar(20);
        auto.frenar(30);
        auto.acelerar();
        auto.apagar();
        //Prueba de los datos del auto
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Velocidad maxima: " + auto.getVelocidadMaxima());
        System.out.println("Velocidad actual: " + auto.getVelocidad());
        System.out.println("Encendido: " + (auto.getEncendido() ? "Si" : "No"));
    }
}

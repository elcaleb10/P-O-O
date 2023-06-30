    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioherencia;

import java.time.LocalDate;

/**
 *
 * @author CalebZG
 */
public class Entrenador extends Integrante{
    private int aniosExperiencia;
    private double sueldoMensual;

    public Entrenador(String RFC, String nombre, String apellidos,
            LocalDate fechaNacimiento, LocalDate fechaIngreso,
            int aniosExperiencia, double sueldoMensual) {
        super(RFC, nombre, apellidos, fechaNacimiento, fechaIngreso);
        this.aniosExperiencia = aniosExperiencia;
        this.sueldoMensual = sueldoMensual;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldoQuincena() {
        return sueldoMensual / 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + aniosExperiencia + ", " +
                sueldoMensual;
    }
}
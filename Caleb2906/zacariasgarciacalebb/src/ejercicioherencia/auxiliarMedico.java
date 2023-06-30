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
public class auxiliarMedico extends Integrante{
    private String especialidad;
    private double sueldoXPorpartido;

    public auxiliarMedico(String RFC, String nombre, String apellidos,
            LocalDate fechaNacimiento, LocalDate fechaIngreso,
            String especialidad, double sueldoXPorpartido) {
        super(RFC, nombre, apellidos, fechaNacimiento, fechaIngreso);
        this.especialidad = especialidad;
        this.sueldoXPorpartido = sueldoXPorpartido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSueldoXPorpartido() {
        return sueldoXPorpartido;
    }

    public void setSueldoXPorpartido(double sueldoXPorpartido) {
        this.sueldoXPorpartido = sueldoXPorpartido;
    }

    public double calcularSueldoQuincena() {
        return sueldoXPorpartido * 2;
    }

    public double calcularSueldoQuincena(int partidosXMes) {
        return sueldoXPorpartido * partidosXMes / 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + especialidad + ", " +
                sueldoXPorpartido;
    }
}

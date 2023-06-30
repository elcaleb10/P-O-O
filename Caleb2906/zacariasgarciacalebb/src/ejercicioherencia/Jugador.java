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
public class Jugador extends Integrante {
    private String nacionalidad;
    private String posicion;
    private String equipoProcedencia;
    private LocalDate finContrado;
    private double sueldoAnual;

    public Jugador(String RFC, String nombre, String apellidos,
            LocalDate fechaNacimiento, LocalDate fechaIngreso,
            String nacionalidad, String posicion, String equipoProcedencia,
            LocalDate finContrado, double sueldoAnual) {
        super(RFC, nombre, apellidos, fechaNacimiento, fechaIngreso);
        this.nacionalidad = nacionalidad;
        this.posicion = posicion;
        this.equipoProcedencia = equipoProcedencia;
        this.finContrado = finContrado;
        this.sueldoAnual = sueldoAnual;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipoProcedencia() {
        return equipoProcedencia;
    }

    public void setEquipoProcedencia(String equipoProcedencia) {
        this.equipoProcedencia = equipoProcedencia;
    }

    public LocalDate getFinContrado() {
        return finContrado;
    }

    public void setFinContrado(LocalDate finContrado) {
        this.finContrado = finContrado;
    }

    public double getSueldoAnual() {
        return sueldoAnual;
    }

    public void setSueldoAnual(double sueldoAnual) {
        this.sueldoAnual = sueldoAnual;
    }

    @Override
    public double calcularSueldoQuincena() {
        return sueldoAnual / 26;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + nacionalidad + ", " + posicion +
                ", " + equipoProcedencia + ", " + finContrado + ", " +
                sueldoAnual;
    }
}

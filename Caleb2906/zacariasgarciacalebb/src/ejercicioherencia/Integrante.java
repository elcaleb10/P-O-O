/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioherencia;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author CalebZG
 */
public class Integrante {
    private String RFC;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;

    public Integrante(String RFC, String nombre, String apellidos,
            LocalDate fechaNacimiento, LocalDate fechaIngreso) {
        this.RFC = RFC;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int calcularAntiguedad() {
        return (int) ChronoUnit.YEARS.between(fechaIngreso,
                LocalDate.now());
    }

    public double calcularSueldoQuincena() {
        return 0;
    }

    @Override
    public String toString() {
        return RFC + ", " + nombre + ", " + apellidos + ", " +
                fechaNacimiento + ", " + fechaIngreso;
    }
}
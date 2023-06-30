/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramaejerciciodeherencia;

import java.time.LocalDate;

/**
 *
 * @author CalebZG
 */
public class EmpleadoGeneral extends Empleado {
    private float sueldoBase;
    
    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public EmpleadoGeneral(String nombre, String correo, LocalDate fechaNac,
            String clave, float sueldoBase){
        super(nombre,correo,fechaNac,clave);
        setSueldoBase(sueldoBase);
    }
    
    @Override
    public float calcularSueldo() {
        return super.calcularSueldo() + sueldoBase; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
 
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramaejerciciodeherencia;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author LMC Alumno
 */
public class PruebaSueldos {
    public static void main(String[] args) {
        Docente d = new Docente("Alberto Medina", "Alber@gmail.com", 
                LocalDate.now(), "D1", 40, 10);
        Docente d2 = new Docente("Maria Hermandez", "x@gmail.com", 
                LocalDate.now(), "D2", 40, 400);
        EmpleadoGeneral  e = new EmpleadoGeneral("Martin Diaz", "x@gmail.com", 
                LocalDate.now(), "E1", 1000);
        EmpleadoGeneral  e2 = new EmpleadoGeneral("Martin Diaz", "x@gmail.com", 
                LocalDate.now(), "E2", 1000);
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(d);
        empleados.add(d2);
        empleados.add(e);
        empleados.add(e2);
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramaejerciciodeherencia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LMC Alumno
 */
public class PruebaToString {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Persona p = new Persona("Juan Perez", "Juan@gmail.com", 
                LocalDate.of(2000,1,1));
        personas.add(p);
        Persona d = new Docente("Alberto Medina", "Alber@gmail.com", 
                LocalDate.now(), "D1", 40, 10);
        System.out.println(p);
        System.out.println("");
        System.out.println(d);
    }
}

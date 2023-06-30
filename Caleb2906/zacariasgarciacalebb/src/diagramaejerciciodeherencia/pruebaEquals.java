/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramaejerciciodeherencia;

import java.time.LocalDate;

/**
 *
 * @author LMC Alumno
 */
public class pruebaEquals {

    public static void main(String[] args) {
        String cadena = "Hola";
        System.out.println(cadena.equals(5));
        System.out.println(cadena.equals("hola"));
        System.out.println(cadena.equals(null));

        Persona p = new Persona("Juan David", "juan@gmail.com", LocalDate.now());
        Persona p1 = new Persona("JUAN", "juan@gmail.com", LocalDate.now());
        Persona p2 = new Persona("JUAN DAVID", "", null);

        System.out.println("Igualdad de personas " + p.equals(p1));
        System.out.println("Igualdad de personas " + p.equals(p));
        System.out.println("Igualdad de personas " + (p == p1));
        //p=p1;
        System.out.println("");
        System.out.println("Igualdad de personas " + (p.equals(p1)));
        System.out.println("Igualdad de personas " + (p.equals(p2)));
        System.out.println("Igualdad de personas " + (p.equals(5)));
        System.out.println("Igualdad de personas " + (p.equals("Juan David")));
        System.out.println("Igualdad de personas " + (p.equals(null)));
        System.out.println("Persona igual a empleado");
        Empleado e = new Empleado("Juan David", "", null, "1");
        System.out.println(p.equals(e));
        
        //Me interesa poder comparar un alumno
        //Tipo de dato identico usar getClass y/o class
        //Me interesa poder comparar un Empleado
            
    }
}

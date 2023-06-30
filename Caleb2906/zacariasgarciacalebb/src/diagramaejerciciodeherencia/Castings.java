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
public class Castings {
    public static void main(String[] args) {
        
        
//        int x=5,y=5;
//        System.out.println(x==y);
//        String a="Hola";
//        String b="Hola";
//        String c="H"+"ola";
//        System.out.println(a==b);
//        System.out.println(a==c);
        Persona p=new Persona("","",LocalDate.now());
        if(p.getClass() == Empleado.class){
            System.out.println("Es un empleado");
        }else{
            System.out.println("No es un empleado");
        }
        System.out.println(p instanceof Persona);
        Persona p1=new Docente("","",LocalDate.now(),"D1",1,1);
        System.out.println(p1 instanceof Persona);
        Persona d = new Docente("","",LocalDate.now(),"D1",1,1);
        System.out.println(d instanceof Persona);
        //Alumno a1 = (Alumno) d;
        Empleado e3 = (Docente)d;
        System.out.println(e3 instanceof Persona);
        e3 = (Empleado)d;
        System.out.println(e3.getClass().getName());
        System.out.println(e3 instanceof Persona);
        Persona pp = new Empleado("", "", LocalDate.now(), "D1");
//        if(pp.getClass().getName().equals("\n" +
//                "diagramaejerciciodeherencia.Empleado")){
        if(pp.getClass()== Empleado.class){
            System.out.println("Es un empleado");
        }
        
        
        
        Docente d1=new Docente("","",LocalDate.now(),"D1",1,1);
        //Conversión no válida
        //d=(Docente) p;
        d=(Docente) p1;
        
        System.out.println(p1==d);
        System.out.println(d1==d);

        
        
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramaejerciciodeherencia;

/**
 *
 * @author LMC Alumno
 */
public class identificarObjetos {

    public static void main(String[] args) {
        Object[] objetos = new Object[6];
        objetos[0] = "S";
        objetos[1] = 10;
        objetos[2] = 5.5;
        objetos[3] = false;
        objetos[4] = 'c';
        objetos[5] = "C";

        exploraTipos(objetos);

    }

    public static void exploraTipos(Object[] arreglo) {
        int cadenas = 0, enteros = 0, decimales = 0, booleanos = 0, caracteres = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].getClass() == Integer.class) {
                enteros++;
            } else if (arreglo[i].getClass() == Double.class) {
                decimales++;
            } else if (arreglo[i].getClass() == Character.class) {
                caracteres++;
            } else if (arreglo[i].getClass() == String.class) {
                cadenas++;
            } else if(arreglo[i] instanceof Boolean){
                booleanos++;
            }
            
        }
        System.out.println("int:        " + enteros + "\n" + "double:     " + decimales + 
                "\n" + "String:     " + cadenas + "\n" + "Boolean:    " + 
                booleanos + "\n" + "Caracteres: " + caracteres);
    }
}

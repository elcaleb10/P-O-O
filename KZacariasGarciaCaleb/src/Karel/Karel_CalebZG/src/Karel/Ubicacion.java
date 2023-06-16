/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Karel;

/**
 *
 * @author LMC Alumno
 */
public class Ubicacion {

    private int x;
    private int y;

    public Ubicacion() {
        x = y = 1;
    }

    public Ubicacion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x > 0) {
            this.x = x;
        } else {
            System.err.println("La posicion X debe ser de 1 en adelante");
        }
    }
    
    public int getY() {
        return x;
    }

    public void setY(int y) {
        if(y>0){
            this.y = y;
        }else{
            System.err.println("La posicion Y debe ser de 1 en adelante");
        }
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author LMC Alumno
 */
public class Cuadrado extends Cuadrilatero{

    @Override
    public double getLadoB() {
        super.setLadoB(ladoB);
        setLadoA(ladoB);
        return ladoB;
    }

    @Override
    public double getLadoA() {
        super.setLadoA(ladoA);
        setLadoB(ladoA);
        return ladoA;
    }
    
    
    
    @Override
    public double calcularArea() {
        return getLadoA() * getLadoB();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodeautos;

/**
 *
 * @author CalebZG
 */
public class Auto {

    private String marca;
    private String modelo;
    private int velocidad;
    private int velocidadMaxima;
    private boolean encendido;

    public Auto(String marca, String modelo, int velocidadMaxima) {
        setMarca(marca);
        setModelo(modelo);
        setVelocidadMaxima(velocidadMaxima);
        velocidad = 0;
        encendido = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        marca = marca.trim();
        if (marca.length() >= 2 && marca.length() <= 50) {
            this.marca = marca;
        } else {
            System.out.println("El nombre de la marca es incorrecta(debe de "
                    + "ser de minimo 2 caracteres a maximo 50)");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        modelo = modelo.trim();
        if (modelo.length() >= 1 && modelo.length() <= 20) {
            this.modelo = modelo;
        } else {
            System.out.println("El modelo es incorrecto(deben ser de minimo un"
                    + " caracter a 20)");
        }
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima >= 100 && velocidadMaxima <= 300) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            System.out.println("El rango de velocidad maxima es incorrecto"
                    + "(de 100 a 300 km\\h)");
        }
    }

    public boolean getEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
        } else {
            System.out.println("El carro ya está encendido");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            setVelocidad(0);
        } else {
            System.out.println("El auto ya está apagado");
        }
    }

    public void acelelar(int velocidad) {
        if (encendido) {
            this.velocidad += velocidad;
            if (this.velocidad > velocidadMaxima) {
                this.velocidad = velocidadMaxima;
            }
        } else {
            System.out.println("No se puede acelerar cuando el carro está "
                    + "apagado");
        }
    }

    public void acelerar() {
        if (encendido) {
            velocidad = velocidadMaxima;
        } else {
            System.out.println("No se puede acelerar cuando el auto está apagado");
        }
    }

    public void frenar(int velocidad) {
        if (encendido) {
            this.velocidad -= velocidad;
            if (this.velocidad < 0) {
                setVelocidad(0);
            }
        } else {
            System.out.println("No se puede frenar cuando el auto está "
                    + "apagado");
        }
    }

    public void frenar() {
        if (encendido) {
            setVelocidad(0);
        } else {
            System.out.println("No se puede frenar cuando el auto está "
                    + "apagado");
        }
    }

}

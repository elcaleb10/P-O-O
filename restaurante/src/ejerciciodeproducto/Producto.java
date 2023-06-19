/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodeproducto;

/**
 *
 * @author messi
 */
public class Producto {

    private String nombre;
    private int existencia;
    private float precio;
    private float costo;

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.costo = precio * 0.9f;
    }

    public Producto(String nombre, int existencia, float precio, float costo) {
        this.nombre = nombre;
        this.existencia = existencia;
        this.precio = precio;
        this.costo = costo;
    }

    public void comprar(int cant, float costo) {
        if (cant > 0 && existencia + cant <= 1000000) {
            existencia += cant;
            if (costo >= 0 && costo <= 999999.99f) {
                this.costo = costo;
            } else {
                System.err.println("cantidad invalidad");
            }
        } else {
            System.err.println("cantidad invalidad");
        }
    }

    public float vender(int cant) {
        if (cant > 0 && cant <= existencia) {
            existencia -= cant;
            return cant * precio;
        } else {
            System.err.println("Error de venta");
            return 0;
        }
    }

    public void ajustarPrecio(int porcentaje) {
    float nuevoPrecio = precio + (precio * porcentaje / 100.0f);
    if (nuevoPrecio > 0 && nuevoPrecio <= 999999.99f) {
        precio = nuevoPrecio;
    } else {
        System.err.println("El ajuste de precio no es valido");
    }
}


    public String getNombre() {
        return nombre;
    }

    public int getExistencia() {
        return existencia;
    }

    public float getPrecio() {
        return precio;
    }

    public float getCosto() {
        return costo;
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre.trim().length() >= 1
                && nombre.trim().length() <= 50) {
            this.nombre = nombre;
        } else {
            System.err.println("Debe ingresar al menos un caracter o almenos "
                    + "hasta 50 caracteres");
        }
    }

    public void setExistencia(int existencia) {
        if (existencia >= 0 && existencia <= 100000) {
            this.existencia = existencia;
        }
    }

    public void setPrecio(float precio) {
        if (precio > 0 && precio <= 999999.99f) {
            this.precio = precio;
        } else {
            System.err.println("Precio invalido");
        }
    }

    public void setCosto(float costo) {
        if (costo >= 0 && costo <= 999999.99f) {
            this.costo = costo;
        } else {
            System.err.println("Costo invalido");
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodeproducto;

/**
 *
 * @author messi
 */
public class PruebaProducto {
    public static void main(String[] args) {
        // Crear dos productos
        Producto producto1 = new Producto("Producto 1", 10);
        Producto producto2 = new Producto("Producto 2", 5, 20, 18);

        // Probar el método setNombre con valores válidos y no válidos
        producto1.setNombre("Nombre válido");
        producto1.setNombre(null);
        producto1.setNombre("");
        producto1.setNombre("Nombre muy largo que excede el límite de 50 caracteres permitidos");

        // Probar el método setExistencia con valores válidos y no válidos
        producto1.setExistencia(100);
        producto1.setExistencia(-1);
        producto1.setExistencia(1000001);

        // Probar el método setPrecio con valores válidos y no válidos
        producto1.setPrecio(15);
        producto1.setPrecio(0);
        producto1.setPrecio(1000000);

        // Probar el método setCosto con valores válidos y no válidos
        producto1.setCosto(12);
        producto1.setCosto(-1);
        producto1.setCosto(1000000);

        // Probar el método comprar con valores válidos y no válidos
        producto1.comprar(10, 12);
        producto1.comprar(-1, 12);
        producto1.comprar(10, -1);
        producto1.comprar(1000001, 12);

        // Probar el método vender con valores válidos y no válidos
        float totalVenta = producto2.vender(3);
        totalVenta = producto2.vender(-1);
        totalVenta = producto2.vender(10);

        // Probar el método ajustarPrecio con valores válidos y no válidos
        producto2.ajustarPrecio(10);
        producto2.ajustarPrecio(-5);
    }
}

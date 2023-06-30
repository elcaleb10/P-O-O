/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioherencia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CalebZG
 */
public class pruebaEjercicioDeHerencia {

    public static void main(String[] args) {
        List<Integrante> integrantes = new ArrayList<>();

        Jugador jugador1 = new Jugador("RFC1", "Lionel", "Messi",
                LocalDate.of(1987, 6, 24), LocalDate.now(),
                "Argentina", "Delantero", "FC Barcelona",
                LocalDate.of(2023, 6, 30), 10000000);
        Jugador jugador2 = new Jugador("RFC2", "Cristiano", "Ronaldo",
                LocalDate.of(1985, 2, 5), LocalDate.now(),
                "Portugal", "Delantero", "Manchester United",
                LocalDate.of(2024, 6, 30), 12000000);
        integrantes.add(jugador1);
        integrantes.add(jugador2);

        Entrenador entrenador1 = new Entrenador("RFC3", "Pep", "Guardiola",
                LocalDate.of(1971, 1, 18), LocalDate.now(),
                20, 3000000);
        Entrenador entrenador2 = new Entrenador("RFC4", "José", "Mourinho",
                LocalDate.of(1963, 1, 26), LocalDate.now(),
                25, 2500000);
        integrantes.add(entrenador1);
        integrantes.add(entrenador2);

        auxiliarMedico auxiliar1 = new auxiliarMedico("RFC5", "Juan", "Pérez",
                LocalDate.of(1990, 8, 10), LocalDate.now(),
                "Cirugía", 5000);
        auxiliarMedico auxiliar2 = new auxiliarMedico("RFC6", "María", "González",
                LocalDate.of(1985, 6, 5), LocalDate.now(),
                "Pediatría", 4500);
        integrantes.add(auxiliar1);
        integrantes.add(auxiliar2);

        double totalPago = 0;

        for (Integrante integrante : integrantes) {
            if (integrante instanceof Jugador) {
                System.out.println("Jugador:");
            } else if (integrante instanceof Entrenador) {
                System.out.println("Entrenador:");
            } else if (integrante instanceof auxiliarMedico) {
                System.out.println("Auxiliar Médico:");
            }

            System.out.println(integrante.toString());
            System.out.println("Sueldo quincenal: $" + integrante.calcularSueldoQuincena());
            totalPago += integrante.calcularSueldoQuincena();
        }

        System.out.println("Monto total a pagar: $" + totalPago);
    }
}

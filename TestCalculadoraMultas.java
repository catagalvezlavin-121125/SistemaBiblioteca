package org.example;

import java.time.LocalDate;

public class TestCalculadoraMultas {
    public static void main(String[] args) {
        
        // Test 1 — Sin atraso
        int resultado1 = CalculadoraMultas.calcularMulta(
                LocalDate.of(2025, 5, 10),
                LocalDate.of(2025, 5, 10),
                200
        );

        if (resultado1 == 0) {
            System.out.println("Test 1 OK");
        } else {
            System.out.println("Test 1 ERROR — Esperado 0, obtenido " + resultado1);
        }

        // Test 2 — Con atraso
        int resultado2 = CalculadoraMultas.calcularMulta(
                LocalDate.of(2025, 5, 12),
                LocalDate.of(2025, 5, 10),
                200
        );

        if (resultado2 == 400) {
            System.out.println("Test 2 OK");
        } else {
            System.out.println("Test 2 ERROR — Esperado 400, obtenido " + resultado2);
        }
    }
}

package org.example;

import java.time.LocalDate;

public class CalculadoraMultas {

    public static int calcularMulta(LocalDate fechaDevolucion, LocalDate fechaLimite, int tarifaDiaria) {
        if (fechaDevolucion.isBefore(fechaLimite) || fechaDevolucion.isEqual(fechaLimite)) {
            return 0;
        }
        int diasAtraso = fechaDevolucion.getDayOfYear() - fechaLimite.getDayOfYear();
        return diasAtraso * tarifaDiaria;
    }
}

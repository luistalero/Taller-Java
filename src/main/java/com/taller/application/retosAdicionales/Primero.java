package com.taller.application.retosAdicionales;

import java.util.List;
import java.util.OptionalDouble;

import com.taller.domain.models.Equip;
import com.taller.domain.models.Estadistica;

public class Primero {
            // Inicio Reto
            public void ejecutar(List<Equip> equipos) {
                System.out.println("\nPromedio de Goles a favor por equipo: ");
                equipos.forEach(equipo -> {
                    OptionalDouble promedio = equipo.statistics.stream()
                        .mapToInt(Estadistica::getGf)
                        .average();
                    System.out.println(equipo.name + " - Proedio de Goles: " + (promedio.isPresent() ? String.format("%.2f", promedio.getAsDouble()) : "No Disponible" ));
                });
            } 
            // Final Reto
}

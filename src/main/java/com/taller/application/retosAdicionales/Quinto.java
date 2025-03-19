package com.taller.application.retosAdicionales;

import java.util.List;
import java.util.stream.Collectors;

import com.taller.domain.models.Equip;

public class Quinto {
            // Inicio Reto
            public void ejecutar(List<Equip> equipos) {
             List<String> entrenadores = equipos.stream()
                 .filter(equipo -> equipo.statistics != null && !equipo.statistics.isEmpty() && equipo.statistics.get(0).getPe() > 0)
                 .map(equipo -> equipo.name + " - Entrenador: " + equipo.coach)
                 .collect(Collectors.toList());
                 System.out.println("Entrenadores de equipos con al menos un empate: ");
                 if (entrenadores.isEmpty()) {
                     System.out.println("No hay equipos que hayan empatado al menos un partido.");
                 } else {
                     entrenadores.forEach(System.out::println);
                 }
            }
            // Final Reto
}

package com.taller.application.retosAdicionales;

import java.util.List;
import java.util.stream.Collectors;

import com.taller.domain.models.Equip;

public class Onceavo {
            // Inicio Reto
            public void ejecutar(List<Equip> equipos) {
             List<Equip> filtro = equipos.stream()
                 .filter(equipo -> equipo.statistics != null && !equipo.statistics.isEmpty() && equipo.statistics.get(0).getGf() > 20)
                 .sorted((e1, e2) -> Integer.compare(e2.statistics.get(0).getGf(), e1.statistics.get(0).getGf()))
                 .collect(Collectors.toList());
             System.out.println("\nEquipos con más goles a favor (ordenados de mayor a menor): ");
             if (filtro.isEmpty()) {
                 System.out.println("No hay equipos con más de 20 goles a favor");
             } else {
                 filtro.forEach(equipo ->
                     System.out.println(equipo.name + " - Goles a Favor: " + equipo.statistics.get(0).getGf())    
                 );
             }
            }
            // Final Reto
}

package com.taller.application.retosAdicionales;

import java.util.List;

import com.taller.domain.models.Equip;

public class Noveno {
            // Inicio Reto
            public void ejecutar(List<Equip> equipos) {
             boolean existEquipo = equipos.stream()
                 .anyMatch(equipo -> equipo.statistics != null && !equipo.statistics.isEmpty() && equipo.statistics.get(0).getTp() > 25);
             if (existEquipo) {
                 System.out.println("\nSi, al menos un equipo tiene mas de 25 puntos");
             } else {
                 System.out.println("No, ningun equipo tiene mas de 25 puntos.");
             }
            }
            // Final Reto
}

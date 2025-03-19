package com.taller.application.retosAdicionales;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.taller.domain.models.Equip;
import com.taller.domain.models.Estadistica;

public class Sexto {
            // Inicio Reto
            public void ejecutar(List<Equip> equipos) {
             Map<String, Integer> golesEquipo = equipos.stream()
                 .collect(Collectors.toMap(
                     equipo -> equipo.name,
                     equipo -> equipo.statistics.stream().mapToInt(Estadistica::getGf).sum()
                 ));
             System.out.println("\nTotal de Goles por equipo: ");
             golesEquipo.forEach((equipo, goles) ->
                 System.out.println(equipo + " - Goles a favor: " + goles)
             );
            }
            // Final Reto
}

package com.taller.application.retosAdicionales;

import java.util.Comparator;
import java.util.List;

import com.taller.domain.models.Equip;

public class Segundo {
            // Inicio Reto
            public void ejecutar(List<Equip> equipos) {
             equipos.stream()
                 .max(Comparator.comparing(equipo -> equipo.statistics.get(0).getPg()))
                 .ifPresent(equipo -> System.out.println("\n Equipo con más victorias: " + equipo.name + " - Victorias: " + equipo.statistics.get(0).getPg()));
            }
            // Final Reto
}

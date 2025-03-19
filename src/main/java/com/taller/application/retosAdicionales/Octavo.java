package com.taller.application.retosAdicionales;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.taller.domain.models.Equip;

public class Octavo {
            // Inicio Reto
            public void ejecutar(List<Equip> equipos) {
             Predicate<Equip> nombreLargo = equipo -> equipo.coach != null && equipo.coach.length() > 10;
             List<Equip> equiposFiltadros = equipos.stream()
                 .filter(nombreLargo)
                 .collect(Collectors.toList());
             System.out.println("Equipos co entrenadores cuyo nombre tiene mas de 10 letras: ");
             if (equiposFiltadros.isEmpty()) {
                 System.out.println("No hay entrenadores con nombres largos");
             } else {
                 equiposFiltadros.forEach(e -> {
                     System.out.println(e.name + " - Entrenador: " + e.coach);
                 });
             }
            }
            // Final Reto
}

package com.taller.application.retosPropuestos;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.taller.domain.models.Equip;

public class Cuarto {
         // Inicio Cuarto Reto
         private Predicate<Equip> mas20Victorias = equipo -> 
                 equipo.statistics != null && !equipo
                         .statistics.isEmpty() && equipo
                              .statistics.get(0).getPg() > 20;
        public void ejecutar(List<Equip> equipos) {
           List<Equip> filtroE = equipos.stream()
                 .filter(mas20Victorias)
                 .collect(Collectors.toList());
             
             System.out.println("Equipos con más de 20 Victorias: ");
             if (filtroE.isEmpty()) {
                 System.out.println("No hay equipos con más de 20 Victorias");
             } else {
                 filtroE.forEach(e -> 
                     System.out.println(e.name + " - Victorias: " + e.statistics.get(0).getPg())
                 );
             } 
        }     
        // Final Cuarto Reto
}

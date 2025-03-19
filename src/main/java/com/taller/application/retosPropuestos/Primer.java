package com.taller.application.retosPropuestos;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.taller.domain.models.Equip;

public class Primer {
    //Inicio de Primer Reto
    public void ejecutar(List<Equip> equipos) {
             Predicate<Equip> fundado2000 = equipo -> equipo.yearfoundation > 2000;
             List<Equip> filtro = equipos.stream().filter(fundado2000).collect(Collectors.toList());
             System.out.println("\nEquipos fundados Después del año 2000");
             if (filtro.isEmpty()) {
               System.out.println("No hay equipos fundados Después del año 2000");
             } else {
               filtro.forEach(e -> 
               System.out.println(e.name + " (fundado en el año: " + e.yearfoundation + ")")
               );
             }
    }
            // Final del Primer Reto
}

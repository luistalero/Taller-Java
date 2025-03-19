package com.taller.application.retosPropuestos;

import java.util.List;

import com.taller.domain.models.Equip;
import com.taller.domain.models.Estadistica;

public class Sexto {
    // Inicio Sexto Reto
    public void ejecutar(List<Equip> equipos) {
        System.out.println("\nTotal de Goles por Equipo: ");
             equipos.forEach(equipo -> {
                 int goles = equipo.statistics.stream()
                     .mapToInt(Estadistica::getGf)
                     .sum();
                 System.out.println(equipo.name + " - Goles a favor: " + goles);
             });
    }             
    // Final Sexto Reto
}

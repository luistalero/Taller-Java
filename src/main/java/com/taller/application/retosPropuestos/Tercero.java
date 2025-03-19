package com.taller.application.retosPropuestos;

import java.util.List;
import java.util.OptionalDouble;
import java.util.function.BiConsumer;

import com.taller.domain.models.Equip;
import com.taller.domain.models.Jugador;

public class Tercero {
    // Inicio Tercer Reto
        public BiConsumer<Equip, List<Jugador>> promedioEdad = (equipo, jugadores) -> {
                     OptionalDouble promedio = jugadores.stream()
                             .mapToInt(Jugador::getAge)
                             .average();

                     System.out.println(equipo.name + " - Promedio de Edad: " + 
                             (promedio.isPresent() ? String.format("%.2f", promedio.getAsDouble()) : "No Disponible"));
                 };

        public void ejecutar(List<Equip> equipos) {
                System.out.println("\nPromedio de Edad de Jugadores por Equipo: ");
                equipos.forEach(equipo -> promedioEdad.accept(equipo, equipo.players));
        }

    // Final Tercer Reto
}

package com.taller.application.retosAdicionales;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.taller.domain.models.Equip;
import com.taller.domain.models.Jugador;

public class Septimo {
            // Inicio Reto
            public void ejecutar(List<Equip> equipos) {
             List<Jugador> jugadoresBrasil = equipos.stream()
                 .flatMap(equipo -> equipo.players.stream())
                 .filter(jugador -> "Brasileño".equalsIgnoreCase(jugador.nationality))
                 .sorted(Comparator.comparingInt(Jugador::getAge))
                 .collect(Collectors.toList());
             System.out.println("Jugadores Brasileños ordenados por edad: ");
             if (jugadoresBrasil.isEmpty()) {
                 System.out.println("No hay jugadores brasileños en la lista.");
             } else {
                 jugadoresBrasil.forEach(jugador -> {
                     System.out.println(jugador.name + " - Edad: " + jugador.getAge());
                 });
             }
            }
            // Final Reto
}

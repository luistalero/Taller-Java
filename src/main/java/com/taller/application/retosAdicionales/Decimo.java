package com.taller.application.retosAdicionales;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.taller.domain.models.Equip;

public class Decimo {
            // Inicio Reto
            public void ejecutar(List<Equip> equipos) {
             Map<String, Long> posicionJugador = equipos.stream()
                 .flatMap(equipo -> equipo.players.stream())
                 .collect(Collectors.groupingBy(jugador -> jugador.position, Collectors.counting()));
             System.out.println("\nCantidad de Jugadores por Podición: ");
             posicionJugador.forEach((posicion, cantidad) -> 
                 System.out.println(posicion + " - Jugadores: " + cantidad)
             );
            }
            // Final Reto
}

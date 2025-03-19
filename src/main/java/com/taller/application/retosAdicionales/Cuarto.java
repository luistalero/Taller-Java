package com.taller.application.retosAdicionales;

import java.util.List;

import com.taller.domain.models.Equip;

public class Cuarto {
            // Inicio Reto
            public void ejecutar(List<Equip> equipos) {
             long delanteros = equipos.stream()
                 .flatMap(equipo -> equipo.players.stream())
                 .filter(jugador -> jugador.position.equalsIgnoreCase("Delantero"))
                 .count();
             System.out.println("\nTotal de delanteros: " + delanteros);
            }
            // Final Reto
}

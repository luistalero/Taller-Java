package com.taller.application.retosAdicionales;

import java.util.Comparator;
import java.util.List;

import com.taller.domain.models.Equip;
import com.taller.domain.models.Jugador;

public class Tercero {
            // Inicio Reto
            public void ejecutar(List<Equip> equipos) {
            equipos.stream()
                .flatMap(equipo -> equipo.players.stream())
                .max(Comparator.comparingInt(Jugador::getHeight))
                .ifPresent(jugador -> System.out.println("\nJugador más alto de la UEFA: " + jugador.name + " - Altura: " + jugador.getHeight()+ " cm"));
            }
    // Final Reto
}

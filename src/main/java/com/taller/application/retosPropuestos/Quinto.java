package com.taller.application.retosPropuestos;

import java.util.Comparator;
import java.util.List;

import com.taller.domain.models.Equip;
import com.taller.domain.models.Jugador;

public class Quinto {
        // Inicio Quinto Reto
        public void ejecutar(List<Equip> equipos) {
           System.out.println("\nJugador más alto por equipo: ");
             equipos.forEach(equipo -> {
                 equipo.players.stream()
                         .max(Comparator.comparingInt(Jugador::getHeight))
                         .ifPresent(jugador -> System.out.println(equipo.name + " - Jugador más alto: " + jugador.name + " ( " + jugador.height + " cm)"));
             }); 
        }
        // F inal Quinto Reto
}

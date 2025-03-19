package com.taller.application.retosPropuestos;

import java.util.List;
import java.util.function.Consumer;

import com.taller.domain.models.Equip;

public class Segundo {
    // Inicio del Segundo Reto
    public void ejecutar(List<Equip> equipos) {
             Consumer<Equip> entrenador = equipo -> 
                 System.out.println(equipo.name + " - Entrenador: " + equipo.coach);
             System.out.println("\nLista de Entrenadores:");
             equipos.forEach(entrenador);
    }
            // Final del Segundo Reto
}

package com.taller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.OptionalDouble;
//// import java.util.function.Consumer;
//// import java.util.function.Predicate;
//// import java.util.stream.Collectors;
import java.util.function.BiConsumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.taller.equipos.Equip;
import com.taller.equipos.EquiposLista;
import com.taller.equipos.Jugador;



public class Main {
    public static void main(String[] args) {
        try {

            InputStream is = Main.class.getClassLoader().getResourceAsStream("uefa_teams_36_full_players.json");
    
            if (is == null) {
                throw new RuntimeException("No Se Encontró el archivo JSON en resources.");
            }
            ObjectMapper om = new ObjectMapper();
            EquiposLista listaEquipos = om.readValue(is, EquiposLista.class);
            List<Equip> equipos = listaEquipos.equipos; 
    
            //Inicio de Primer Reto

            //// Predicate<Equip> fundado2000 = equipo -> equipo.yearfoundation > 2000;
            //// List<Equip> filtro = equipos.stream().filter(fundado2000).collect(Collectors.toList());
            //// System.out.println("\nEquipos fundados Después del año 2000");
            //// if (filtro.isEmpty()) {
            ////   System.out.println("No hay equipos fundados Después del año 2000");
            //// } else {
            ////   filtro.forEach(e -> 
            ////   System.out.println(e.name + " (fundado en el año: " + e.yearfoundation + ")")
            ////   );
            //// }
            // Final del Primer Reto

            // Inicio del Segundo Reto
            //// Consumer<Equip> entrenador = equipo -> 
            ////     System.out.println(equipo.name + " - Entrenador: " + equipo.coach);
            //// System.out.println("\nLista de Entrenadores:");
            //// equipos.forEach(entrenador);
            // Final del Segundo Reto

            // Inicio Tercer Reto
            BiConsumer<Equip, List<Jugador>> promedioEdad = (equipo, jugadores) -> {OptionalDouble promedio = jugadores.stream().mapToInt(jugador -> jugador.age).average();
                System.out.println(equipo.name + " - Promedio de Edad: " + (promedio.));
            }
            // Final Tercer Reto

            // Inicio Cuarto Reto
            
            // Final Cuarto Reto

            // Inicio Quinto Reto
            
            // Final Quinto Reto

            // Inicio Sexto Reto
            
            // Final Sexto Reto

            // Inicio Septimo Reto
            
            // Final Septimo Reto

            // Inicio Octavo Reto
            
            // Final Octavo Reto

            // Inicio Noveno Reto
            
            // Final Noveno Reto

            // Inicio Decímo Reto
            
            // Final Decímo Reto
    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
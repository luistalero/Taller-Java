package com.taller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.BiConsumer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.taller.equipos.Equip;
import com.taller.equipos.EquiposLista;
import com.taller.equipos.Estadistica;
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
            //// BiConsumer<Equip, List<Jugador>> promedioEdad = (equipo, jugadores) -> {
            ////     OptionalDouble promedio = jugadores.stream()
            ////             .mapToInt(jugador -> jugador.age)
            ////             .average();
            //// 
            ////     System.out.println(equipo.name + " - Promedio de Edad: " + 
            ////             (promedio.isPresent() ? String.format("%.2f", promedio.getAsDouble()) : "No Disponible"));
            //// };
            //// System.out.println("\nPromedio de Edad de Jugadores por Equipo: ");
            //// equipos.forEach(equipo -> promedioEdad.accept(equipo, equipo.players));
            // Final Tercer Reto

            // Inicio Cuarto Reto
            //// Predicate<Equip> mas20Victorias = equipo -> 
            ////     equipo.statistics != null && !equipo
            ////             .statistics.isEmpty() && equipo
            ////                  .statistics.get(0).getPG() > 20;
            //// List<Equip> filtroE = equipos.stream()
            ////     .filter(mas20Victorias)
            ////     .collect(Collectors.toList());
            //// 
            //// System.out.println("Equipos con más de 20 Victorias: ");
            //// if (filtroE.isEmpty()) {
            ////     System.out.println("No hay equipos con más de 20 Victorias");
            //// } else {
            ////     filtroE.forEach(e -> 
            ////         System.out.println(e.name + " - Victorias: " + e.statistics.get(0).getPG())
            ////     );
            //// }
            // Final Cuarto Reto

            // Inicio Quinto Reto
            //// System.out.println("\nJugador más alto por equipo: ");
            //// equipos.forEach(equipo -> {
            ////     equipo.players.stream()
            ////             .max(Comparator.comparingInt(Jugador::getHeight))
            ////             .ifPresent(jugador -> System.out.println(equipo.name + " - Jugador más alto: " + jugador.name + " ( " + jugador.height + " cm)"));
            //// });
            // F inal Quinto Reto

            // Inicio Sexto Reto
            //// System.out.println("\nTotal de Goles por Equipo: ");
            //// equipos.forEach(equipo -> {
            ////     int goles = equipo.statistics.stream()
            ////         .mapToInt(Estadistica::getGf)
            ////         .sum();
            ////     System.out.println(equipo.name + " - Goles a favor: " + goles);
            //// });
            // Final Sexto Reto

            // Inicio Septimo Reto
            //// Predicate<Equip> mas15Puntos = equipo -> 
            ////     equipo.statistics != null 
            ////         && !equipo.statistics.isEmpty()
            ////          && equipo.statistics.get(0).getTp() > 15;
            //// List<Equip> filtro = equipos.stream()
            ////     .filter(mas15Puntos)
            ////     .collect(Collectors.toList());
            //// System.out.println("Equipos con más de 15 puntos");
            //// if (filtro.isEmpty()) {
            ////     System.out.println("No hay equipos con más de 15 puntos");
            //// } else {
            ////     filtro.forEach(e -> 
            ////         System.out.println(e.name + " - Puntos: " + e.statistics.get(0).getTp())
            ////     );
            //// }
            // Final Septimo Reto

            // Inicio Reto
            //// System.out.println("\nPromedio de Goles a favor por equipo: ");
            //// equipos.forEach(equipo -> {
            ////     OptionalDouble promedio = equipo.statistics.stream()
            ////         .mapToInt(Estadistica::getGf)
            ////         .average();
            ////     System.out.println(equipo.name + " - Proedio de Goles: " + (promedio.isPresent() ? String.format("%.2f", promedio.getAsDouble()) : "No Disponible" ));
            //// });
            // Final Reto

            // Inicio Reto
            //// equipos.stream()
            ////     .max(Comparator.comparing(equipo -> equipo.statistics.get(0).getPg()))
            ////     .ifPresent(equipo -> System.out.println("\n Equipo con más victorias: " + equipo.name + " - Victorias: " + equipo.statistics.get(0).getPg()));
            // Final Reto

            // Inicio Reto
            ////equipos.stream()
            ////    .flatMap(equipo -> equipo.players.stream())
            ////    .max(Comparator.comparingInt(Jugador::getHeight))
            ////    .ifPresent(jugador -> System.out.println("\nJugador más alto de la UEFA: " + jugador.name + " - Altura: " + jugador.getHeight()+ " cm"));
            // Final Reto
        
            // Inicio Reto
            //// long delanteros = equipos.stream()
            ////     .flatMap(equipo -> equipo.players.stream())
            ////     .filter(jugador -> jugador.position.equalsIgnoreCase("Delantero"))
            ////     .count();
            //// System.out.println("\nTotal de delanteros: " + delanteros);
            // Final Reto

            // Inicio Reto
            //// List<String> entrenadores = equipos.stream()
            ////     .filter(equipo -> equipo.statistics != null && !equipo.statistics.isEmpty() && equipo.statistics.get(0).getPe() > 0)
            ////     .map(equipo -> equipo.name + " - Entrenador: " + equipo.coach)
            ////     .collect(Collectors.toList());
            ////     System.out.println("Entrenadores de equipos con al menos un empate: ");
            ////     if (entrenadores.isEmpty()) {
            ////         System.out.println("No hay equipos que hayan empatado al menos un partido.");
            ////     } else {
            ////         entrenadores.forEach(System.out::println);
            ////     }
            // Final Reto

            // Inicio Reto
            //// Map<String, Integer> golesEquipo = equipos.stream()
            ////     .collect(Collectors.toMap(
            ////         equipo -> equipo.name,
            ////         equipo -> equipo.statistics.stream().mapToInt(Estadistica::getGf).sum()
            ////     ));
            //// System.out.println("\nTotal de Goles por equipo: ");
            //// golesEquipo.forEach((equipo, goles) ->
            ////     System.out.println(equipo + " - Goles a favor: " + goles)
            //// );
            // Final Reto

            // Inicio Reto
            //// List<Jugador> jugadoresBrasil = equipos.stream()
            ////     .flatMap(equipo -> equipo.players.stream())
            ////     .filter(jugador -> "Brasileño".equalsIgnoreCase(jugador.nationality))
            ////     .sorted(Comparator.comparingInt(Jugador::getAge))
            ////     .collect(Collectors.toList());
            //// System.out.println("Jugadores Brasileños ordenados por edad: ");
            //// if (jugadoresBrasil.isEmpty()) {
            ////     System.out.println("No hay jugadores brasileños en la lista.");
            //// } else {
            ////     jugadoresBrasil.forEach(jugador -> {
            ////         System.out.println(jugador.name + " - Edad: " + jugador.getAge());
            ////     });
            //// }
            // Final Reto

            // Inicio Reto
            //// Predicate<Equip> nombreLargo = equipo -> equipo.coach != null && equipo.coach.length() > 10;
            //// List<Equip> equiposFiltadros = equipos.stream()
            ////     .filter(nombreLargo)
            ////     .collect(Collectors.toList());
            //// System.out.println("Equipos co entrenadores cuyo nombre tiene mas de 10 letras: ");
            //// if (equiposFiltadros.isEmpty()) {
            ////     System.out.println("No hay entrenadores con nombres largos");
            //// } else {
            ////     equiposFiltadros.forEach(e -> {
            ////         System.out.println(e.name + " - Entrenador: " + e.coach);
            ////     });
            //// }
            // Final Reto

            // Inicio Reto
            //// boolean existEquipo = equipos.stream()
            ////     .anyMatch(equipo -> equipo.statistics != null && !equipo.statistics.isEmpty() && equipo.statistics.get(0).getTp() > 25);
            //// if (existEquipo) {
            ////     System.out.println("\nSi, al menos un equipo tiene mas de 25 puntos");
            //// } else {
            ////     System.out.println("No, ningun equipo tiene mas de 25 puntos.");
            //// }
            // Final Reto

            // Inicio Reto
            //// Map<String, Long> posicionJugador = equipos.stream()
            ////     .flatMap(equipo -> equipo.players.stream())
            ////     .collect(Collectors.groupingBy(jugador -> jugador.position, Collectors.counting()));
            //// System.out.println("\nCantidad de Jugadores por Podición: ");
            //// posicionJugador.forEach((posicion, cantidad) -> 
            ////     System.out.println(posicion + " - Jugadores: " + cantidad)
            //// );
            // Final Reto

            // Inicio Reto
            //// List<Equip> filtro = equipos.stream()
            ////     .filter(equipo -> equipo.statistics != null && !equipo.statistics.isEmpty() && equipo.statistics.get(0).getGf() > 20)
            ////     .sorted((e1, e2) -> Integer.compare(e2.statistics.get(0).getGf(), e1.statistics.get(0).getGf()))
            ////     .collect(Collectors.toList());
            //// System.out.println("\nEquipos con más goles a favor (ordenados de mayor a menor): ");
            //// if (filtro.isEmpty()) {
            ////     System.out.println("No hay equipos con más de 20 goles a favor");
            //// } else {
            ////     filtro.forEach(equipo ->
            ////         System.out.println(equipo.name + " - Goles a Favor: " + equipo.statistics.get(0).getGf())    
            ////     );
            //// }
            // Final Reto
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
package com.taller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.taller.equipos.Equip;
import com.taller.equipos.EquiposLista;



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
      
            Predicate<Equip> fundado2000 = equipo -> equipo.yearfoundation < 2000;
            List<Equip> filtro = equipos.stream().filter(fundado2000).collect(Collectors.toList());
            System.out.println("\nEquipos fundados antes del año 2000");
            if (filtro.isEmpty()) {
              System.out.println("No hay equipos fundados antes del año 2000");
            } else {
              filtro.forEach(e -> 
              System.out.println(e.name + "fundado en el año: " + e.yearfoundation)
              );
            }
      
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
package com.taller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
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
      
             
      
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
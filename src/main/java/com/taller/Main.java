package com.taller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.taller.application.Ui.UiRetosAdicionales;
import com.taller.application.Ui.UiRetosPropuestos;
import com.taller.domain.models.Equip;
import com.taller.domain.models.EquiposLista;



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
            
            Scanner sc = new Scanner(System.in);
            int opcion;
            do {

                String menu = """
                ===================================
                |          Menú Principal         |
                =================================== 
                | 1. Retos Propuestos             |
                | 2. Retos Adicionales            |
                | 3. Salir                        |
                ===================================
                """;
                System.out.print(menu);
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        UiRetosPropuestos.menuRetosPopuesto(sc, equipos);
                        break;

                    case 2:
                        UiRetosAdicionales.menuRetosAdicionales(sc, equipos);
                        break;

                    case 3:
                        System.out.println("Gracias Por usar este Programa...");
                        break;
                
                    default:
                        System.out.println("Opción no valida. Intente de Nuevo.");
                        break;
                }
            } while (opcion != 3);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
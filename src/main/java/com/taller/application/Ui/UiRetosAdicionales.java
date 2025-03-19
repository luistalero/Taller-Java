package com.taller.application.Ui;

import java.util.List;
import java.util.Scanner;

import com.taller.application.retosAdicionales.Cuarto;
import com.taller.application.retosAdicionales.Decimo;
import com.taller.application.retosAdicionales.Noveno;
import com.taller.application.retosAdicionales.Octavo;
import com.taller.application.retosAdicionales.Onceavo;
import com.taller.application.retosAdicionales.Primero;
import com.taller.application.retosAdicionales.Quinto;
import com.taller.application.retosAdicionales.Segundo;
import com.taller.application.retosAdicionales.Septimo;
import com.taller.application.retosAdicionales.Sexto;
import com.taller.application.retosAdicionales.Tercero;
import com.taller.domain.models.Equip;

public class UiRetosAdicionales {
    public static void menuRetosAdicionales(Scanner sc, List<Equip> equipos) {
        String menu = """
        ===========================================================
        |                     RETOS PROPUESTOS                    |
        ===========================================================
        | 1. Listado de Equipos Fundados Después del Año 2000     |
        | 2. Impresión de Nombres de Entrenadores                 |
        | 3. Cálculo del Promedio de Edad de Jugadores por Equipo |
        | 4. Listado de Equipos con Más de 20 Victorias           |
        | 5. Obtención del Jugador Más Alto de Cada Equipo        |
        | 6. Cálculo del Total de Goles por Equipo                |
        | 7. Salir                                                |
        =========================================================== 
        """;
        System.out.println(menu);
        System.out.println("Elija un reto:");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                new Primero().ejecutar(equipos);
                break;

            case 2:
                new Segundo().ejecutar(equipos);
                break;

            case 3:
                new Tercero().ejecutar(equipos);
                break;

            case 4:
                new Cuarto().ejecutar(equipos);
                break;

            case 5:
                new Quinto().ejecutar(equipos);
                break;

            case 6:
                new Sexto().ejecutar(equipos);
                break;

            case 7:
                new Septimo().ejecutar(equipos);
                break;

            case 8:
                new Octavo().ejecutar(equipos);
                break;

            case 9:
                new Noveno().ejecutar(equipos);
                break;

            case 10:
                new Decimo().ejecutar(equipos);
                break;

            case 11:
                new Onceavo().ejecutar(equipos);
                break;

            case 12:
                System.out.println("Volviendo al menu principal...");
                break;
        
            default:
                break;
        }
    }
}

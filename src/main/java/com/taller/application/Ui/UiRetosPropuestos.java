package com.taller.application.Ui;

import java.util.List;
import java.util.Scanner;

import com.taller.application.retosPropuestos.Cuarto;
import com.taller.application.retosPropuestos.Primer;
import com.taller.application.retosPropuestos.Quinto;
import com.taller.application.retosPropuestos.Segundo;
import com.taller.application.retosPropuestos.Sexto;
import com.taller.application.retosPropuestos.Tercero;
import com.taller.domain.models.Equip;

public class UiRetosPropuestos {
    public static void menuRetosPopuesto(Scanner sc, List<Equip> equipos) {
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
                new Primer().ejecutar(equipos);
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
                System.out.println("Volviendo al menú Principal");
                break;
        
            default:
                System.out.println("Opción no valida. Vuelva a Intentarlo.");
                break;
        }
    }
}

package com.taller.equipos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Jugador {
    public String dorsal;
    public String name;
    public String nationality;
    public String age;
    public String height;
    public String weight;
    public String position;


    public int getAge() { return parseIntOrZero(age); }
    public int getHeight() { return parseIntOrZero(height); }
    public int getWeight() { return parseIntOrZero(weight); }
    public int getDorsal() { return parseIntOrZero(dorsal); }

    // Método auxiliar
    private int parseIntOrZero(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

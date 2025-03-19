package com.taller.domain.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Estadistica {
    public String pj; //partidos Jugados  
    public String pg; //partidos ganados
    public String pe; //partidos emaptados
    public String pp; //partidos perdidos
    public String gf; //goles a favor 
    public String gc; //goles en contra
    public String tp; //total de puntos


    public int getPj() { return parseIntOrZero(pj); }
    public int getPg() { return parseIntOrZero(pg); }
    public int getPe() { return parseIntOrZero(pe); }
    public int getPp() { return parseIntOrZero(pp); }
    public int getGf() { return parseIntOrZero(gf); }
    public int getGc() { return parseIntOrZero(gc); }
    public int getTp() { return parseIntOrZero(tp); }

    // Método auxiliar
    private int parseIntOrZero(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
package com.taller.equipos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Estadistica {
    public int pj; //partidos Jugados  
    public int pg; //partidos ganados
    public int pe; //partidos emaptados
    public int pp; //partidos perdidos
    public int gf; //goles a favor 
    public int gc; //goles en contra
    public int tp; //total de puntos
}

package com.taller.equipos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Jugador {
    public int dorsal;
    public String name;
    public String nationality;
    public int age;
    public int height;
    public int weight;
    public String position;
}

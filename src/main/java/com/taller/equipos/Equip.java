package com.taller.equipos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Equip {
    public int id;
    public String name;
    public int yearfoundation;
    public List<Estadistica> statistic;
    public String coach;
}

package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculo.Classifiable;

public class Episode {
    private int number;
    private int season;
    private String name;
    private Series series;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }
}

package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculo.Classifiable;

public class Episode implements Classifiable {
    private int number;
    private int season;
    private String name;
    private Series series;

    private int totalViews;

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

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }


    @Override
    public int getClassification() {
        if(totalViews > 100){
            return 4;
        }
        else {
            return 2;
        }
    }
}

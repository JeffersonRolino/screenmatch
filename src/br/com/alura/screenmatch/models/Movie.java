package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculo.Classifiable;

public class Movie extends Title implements Classifiable {

    public Movie(){}

    public Movie(String name, int releaseYear, int durationInMinutes){
        this.setName(name);
        this.setReleaseYear(releaseYear);
        this.setDurationInMinutes(durationInMinutes);
    }

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassification() {
        return (int)getAverageRating() / 2;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getReleaseYear() + ")";
    }
}

package br.com.alura.screenmatch.models;

public class Movie {
    String name;
    int releaseYear;
    boolean includedInPlan;
    private double rating;
    private int numberOfReviews;
    int durationInMinutes;

    double getRating(){
        return this.rating;
    }

    public int getNumberOfReviews(){
        return this.numberOfReviews;
    }


    public void showDetails(){
        System.out.println("Nome do Filme: " + this.name);
        System.out.println("Ano de lançamento: " + this.releaseYear);
        System.out.println("Duração em Minutos: " + this.durationInMinutes);
    }

    public void review(double rating){
        this.rating += rating;
        this.numberOfReviews++;
    }

    public double getAverageRating(){
        return this.rating / this.numberOfReviews;
    }
}

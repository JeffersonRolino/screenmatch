package br.com.alura.screenmatch.models;

public class Movie {
    private String name;
    private int releaseYear;
    private boolean isIncludedInPlan;
    private double rating;
    private int numberOfReviews;
    private int durationInMinutes;

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public void setIncludedInPlan(boolean isIncludedInPlan){
        this.isIncludedInPlan = isIncludedInPlan;
    }

    public void setDurationInMinutes(int durationInMinutes){
        this.durationInMinutes = durationInMinutes;
    }

    //Getters
    public boolean getIsIncludedInPlan(){
        return this.isIncludedInPlan;
    }

    public double getRating(){
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

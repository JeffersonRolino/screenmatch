package br.com.alura.screenmatch.models;

public class Title {
    private String name;
    private int releaseYear;
    private int durationInMinutes;
    private boolean isIncludedInPlan;
    private double rating;
    private int numberOfReviews;


    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public void setDurationInMinutes(int durationInMinutes){
        this.durationInMinutes = durationInMinutes;
    }

    public void setIncludedInPlan(boolean isIncludedInPlan){
        this.isIncludedInPlan = isIncludedInPlan;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

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
        System.out.println("Incluído no plano: " + this.isIncludedInPlan);
    }

    public void review(double rating){
        this.rating += rating;
        this.numberOfReviews++;
    }

    public double getAverageRating(){
        return this.rating / this.numberOfReviews;
    }
}

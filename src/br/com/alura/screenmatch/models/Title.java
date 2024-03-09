package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.exceptions.yearConversionException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {
    @SerializedName("Title")
    private String name;

    @SerializedName("Year")
    private int releaseYear;

    private int durationInMinutes;
    private boolean isIncludedInPlan;
    private double rating;
    private int numberOfReviews;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();

        if(myTitleOmdb.year().length() > 4){
            throw new yearConversionException("Não consegui converter o ano porque possui mais de 04 caracteres.");
        }
        this.releaseYear = Integer.parseInt(myTitleOmdb.year());
        this.durationInMinutes = Integer.valueOf(myTitleOmdb.runtime().substring(0, 3).trim());
    }

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

    @Override
    public String toString() {
        return name + " (" + releaseYear + ")" + " " + durationInMinutes + "min";
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}

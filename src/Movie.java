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

    int getNumberOfReviews(){
        return this.numberOfReviews;
    }


    void showDetails(){
        System.out.println("Nome do Filme: " + this.name);
        System.out.println("Ano de lançamento: " + this.releaseYear);
        System.out.println("Duração em Minutos: " + this.durationInMinutes);
    }

    void review(double rating){
        this.rating += rating;
        this.numberOfReviews++;
    }

    double getAverageRating(){
        return this.rating / this.numberOfReviews;
    }
}

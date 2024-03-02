public class Movie {
    String name;
    int releaseYear;
    boolean includedInPlan;
    double rating;
    int numberOfReviews;
    int durationInMinutes;

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

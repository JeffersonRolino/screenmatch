import br.com.alura.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("The Godfather");
        myMovie.setReleaseYear(1972);
        myMovie.setDurationInMinutes(175);
        myMovie.setIncludedInPlan(true);

        myMovie.showDetails();
        myMovie.review(8);
        myMovie.review(9.2);
        myMovie.review(10);

        System.out.println("Nota do Filme: " + myMovie.getRating());
        System.out.println("Número de Avaliações " + myMovie.getNumberOfReviews());
        System.out.printf("Média das Avaliações %.1f", myMovie.getAverageRating());
    }
}
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

@SuppressWarnings("ALL")
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
        System.out.println("Duração do Filme: " + myMovie.getDurationInMinutes());
        System.out.println("Número de Avaliações " + myMovie.getNumberOfReviews());
        System.out.printf("Média das Avaliações %.1f", myMovie.getAverageRating());
        System.out.println();

        Series lost = new Series();
        lost.setName("Lost");
        lost.setReleaseYear(2004);
        lost.setSeasons(5);
        lost.setNumberOfEpisodesBySeason(10);
        lost.setMinutesByEpisode(45);
        System.out.println("Duração de Lost em Minutos: " + lost.getDurationInMinutes());
    }
}
import br.com.alura.screenmatch.calculo.RecommendationFilter;
import br.com.alura.screenmatch.calculo.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        Movie theGodfather = new Movie("The Godfather", 1972);
        theGodfather.setDurationInMinutes(175);
        theGodfather.setIncludedInPlan(true);

        Movie backToTheFuture = new Movie("Back to the Future", 1985);
        theGodfather.setDurationInMinutes(116);
        backToTheFuture.setIncludedInPlan(true);


        theGodfather.showDetails();
        theGodfather.review(8);
        theGodfather.review(9.2);
        theGodfather.review(10);

        System.out.println("Nota do Filme: " + theGodfather.getRating());
        System.out.println("Duração do Filme: " + theGodfather.getDurationInMinutes());
        System.out.println("Número de Avaliações " + theGodfather.getNumberOfReviews());
        System.out.printf("Média das Avaliações %.1f", theGodfather.getAverageRating());
        System.out.println();

        Series lost = new Series("Lost", 2004);
        lost.setSeasons(5);
        lost.setNumberOfEpisodesBySeason(10);
        lost.setMinutesByEpisode(45);
        System.out.println("Duração de Lost em Minutos: " + lost.getDurationInMinutes());

        TimeCalculator calculator = new TimeCalculator();

        calculator.include(theGodfather);
        calculator.include(backToTheFuture);
        calculator.include(lost);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter recommendationFilter = new RecommendationFilter();
        recommendationFilter.filter(theGodfather);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSeries(lost);
        episode.setSeason(1);
        episode.setTotalViews(300);

        recommendationFilter.filter(episode);

        Movie filmeDoPaulo = new Movie("Dogville", 2003);
        filmeDoPaulo.setDurationInMinutes(200);
        filmeDoPaulo.review(10);

        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(filmeDoPaulo);
        movies.add(theGodfather);
        movies.add(backToTheFuture);

        System.out.println("Tamanho da lista: " + movies.size());
        System.out.println("Primeiro filme da lista: " + movies.get(0).getName());

        System.out.println("Primeiro filme da lista: " + movies.get(0).toString());

        System.out.println(movies);

        Object object = filmeDoPaulo;
    }
}
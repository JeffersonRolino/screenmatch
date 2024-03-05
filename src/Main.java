import br.com.alura.screenmatch.calculo.RecommendationFilter;
import br.com.alura.screenmatch.calculo.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("The Godfather");
        myMovie.setReleaseYear(1972);
        myMovie.setDurationInMinutes(175);
        myMovie.setIncludedInPlan(true);

        Movie backToTheFuture = new Movie();
        backToTheFuture.setName("Back to the Future");
        backToTheFuture.setReleaseYear(1985);
        backToTheFuture.setDurationInMinutes(116);
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

        TimeCalculator calculator = new TimeCalculator();

        calculator.include(myMovie);
        calculator.include(backToTheFuture);
        calculator.include(lost);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter recommendationFilter = new RecommendationFilter();
        recommendationFilter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSeries(lost);
        episode.setSeason(1);
        episode.setTotalViews(300);

        recommendationFilter.filter(episode);

        Movie filmeDoPaulo = new Movie();
        filmeDoPaulo.setName("Dogville");
        filmeDoPaulo.setDurationInMinutes(200);
        filmeDoPaulo.setReleaseYear(2003);
        filmeDoPaulo.review(10);

        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(filmeDoPaulo);
        movies.add(myMovie);
        movies.add(backToTheFuture);

        System.out.println("Tamanho da lista: " + movies.size());
        System.out.println("Primeiro filme da lista: " + movies.get(0).getName());
    }
}
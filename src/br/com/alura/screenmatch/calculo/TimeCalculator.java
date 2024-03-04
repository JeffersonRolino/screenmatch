package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

//    public void include(Movie movie){
//        this.totalTime += movie.getDurationInMinutes();
//    }
//
//    public void include(Series series){
//        this.totalTime += series.getDurationInMinutes();
//    }

    public void include(Title title){
        this.totalTime += title.getDurationInMinutes();
    }

}

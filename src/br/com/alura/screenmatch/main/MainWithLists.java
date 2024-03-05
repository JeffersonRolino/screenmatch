package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;

public class MainWithLists {
    public static void main(String[] args) {
        Movie theGodfather = new Movie("The Godfather", 1972);
        theGodfather.review(9.5);
        Movie backToTheFuture = new Movie("Back to the Future", 1985);
        backToTheFuture.review(9.2);
        Movie dogville = new Movie("Dogville", 2003);
        dogville.review(8.6);

        Series lost = new Series("Lost", 2004);

        ArrayList<Title> list = new ArrayList<Title>();

        list.add(theGodfather);
        list.add(backToTheFuture);
        list.add(dogville);
        list.add(lost);

        for(Title title : list){
            System.out.println(title.getName());
            if(title instanceof Movie movie){
                System.out.println("Classificação: " + movie.getClassification() + "\n");
            }
        }
    }
}

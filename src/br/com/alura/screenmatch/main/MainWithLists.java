package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainWithLists {
    public static void main(String[] args) {
        Movie theGodfather = new Movie("The Godfather", 1972);
        theGodfather.review(9.5);
        Movie backToTheFuture = new Movie("Back to the Future", 1985);
        backToTheFuture.review(9.2);
        Movie dogville = new Movie("Dogville", 2003);
        dogville.review(8.6);

        Series lost = new Series("Lost", 2004);

        ArrayList<Title> titles = new ArrayList<Title>();

        titles.add(theGodfather);
        titles.add(backToTheFuture);
        titles.add(dogville);
        titles.add(lost);

        for(Title title : titles){
            System.out.println(title.getName());
            if(title instanceof Movie movie){
                System.out.println("Classificação: " + movie.getClassification() + "\n");
            }
        }

        ArrayList<String> searchByArtists = new ArrayList<String>();
        searchByArtists.add("Brad Pitt");
        searchByArtists.add("Marlon Brando");
        searchByArtists.add("Leonardo DiCaprio");
        searchByArtists.add("Angelina Jolie");
        searchByArtists.add("Adam Sandler");
        searchByArtists.add("Daniel Day Lewis");


        System.out.println("Antes da ordenação: " + searchByArtists);

        Collections.sort(searchByArtists);

        System.out.println("Depois da ordenação: " + searchByArtists);

        Collections.sort(titles);
        System.out.println("Lista de títulos ordenados " + titles);

        // Ordenando Títulos por Ano de Lançamento
        titles.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println("Ordenando por ano:");
        System.out.println(titles);
    }
}

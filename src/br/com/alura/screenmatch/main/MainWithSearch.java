package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Title;
import br.com.alura.screenmatch.models.TitleOmdb;
import br.com.alura.screenmatch.exceptions.yearConversionException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import env.Env;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um filme para busca: ");
        String busca = scanner.nextLine();

        String movie = busca.toLowerCase().replace(" ", "+");

        String stringQuery;
        String apiAddress = "https://www.omdbapi.com/?";

        stringQuery = apiAddress + "t=" + movie + "&" + "apikey=" + Env.getApiKey();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(stringQuery))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        System.out.println(json);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
//        Title myTitle = gson.fromJson(json, Title.class);

        TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);

        System.out.println(myTitleOmdb);

        try{
            Title title = new Title(myTitleOmdb);
            System.out.println("Título já convertido...");
            System.out.println(title);

            FileWriter fileWriter = new FileWriter("movies.txt");
            fileWriter.write(title.toString());
            fileWriter.close();

        } catch (yearConversionException exception){
            System.out.println("Aconteceu um erro: ");
            System.out.println(exception.getMessage());
        }

        System.out.println("Programa finalizou corretamente...");

        scanner.close();
    }
}

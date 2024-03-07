package br.com.alura.screenmatch.main;

import env.Env;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        String stringQuery;
        String movie = "the+matrix";
        String apiAddress = "https://www.omdbapi.com/?";

        stringQuery = apiAddress + "t=" + movie + "&" + "apikey=" + Env.getApiKey();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(stringQuery))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}

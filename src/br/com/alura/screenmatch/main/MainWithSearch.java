package br.com.alura.screenmatch.main;

import env.Env;

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

        System.out.println(response.body());

        scanner.close();
    }
}

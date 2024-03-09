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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String busca = "";
        List<Title> titles = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while(!busca.equalsIgnoreCase("sair")){
            System.out.println("Digite o nome de filme para busca ou sair: ");
            busca = scanner.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }

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

            TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);

            try{
                Title title = new Title(myTitleOmdb);
                titles.add(title);

            } catch (yearConversionException exception){
                System.out.println("Aconteceu um erro: ");
                System.out.println(exception.getMessage());
            }
        }
        System.out.println(titles);

        FileWriter fileWriter = new FileWriter("titles.json");
        fileWriter.write(gson.toJson(titles));
        fileWriter.close();

        System.out.println("Programa finalizou corretamente...");
        scanner.close();
    }
}

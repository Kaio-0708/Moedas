package Api;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/f56ac907f41541a1f56fa749/latest/";

    public static double obterTaxaDeCambio(String moedaOrigem, String moedaDestino) throws IOException, InterruptedException {
        JsonObject rates = obterTaxasDeCambio(moedaOrigem);
        if (rates.has(moedaDestino)) {
            return rates.get(moedaDestino).getAsDouble();
        } else {
            throw new RuntimeException("Taxa de conversão não encontrada para a moeda: " + moedaDestino);
        }
    }

    public static JsonObject obterTaxasDeCambio(String moedaOrigem) throws IOException, InterruptedException {
        URI uri = URI.create(API_URL + moedaOrigem);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        HttpResponse<String> response = HttpClient
                .newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
        return jsonObject.getAsJsonObject("conversion_rates");
    }
}
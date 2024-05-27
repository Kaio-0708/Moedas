package Calculo;

import Api.Conversor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CalculoDeConversao {

    public static double converterMoeda(String moedaOrigem, String moedaDestino, double valor) throws IOException, InterruptedException {
        double taxaDeCambio = Conversor.obterTaxaDeCambio(moedaOrigem, moedaDestino);
        return valor * taxaDeCambio;
    }

    public static Map<String, Object> criarRegistroConversao(String moedaOrigem, String moedaDestino, double valorOriginal, double valorConvertido) {
        Map<String, Object> registro = new HashMap<>();
        registro.put("moedaOrigem", moedaOrigem);
        registro.put("moedaDestino", moedaDestino);
        registro.put("valorOriginal", valorOriginal);
        registro.put("valorConvertido", valorConvertido);
        registro.put("dataHora", java.time.LocalDateTime.now().toString());
        return registro;
    }
}
package Arquivo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void salvaJson(String nomeArquivo, Object objeto) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter escrita = new FileWriter(nomeArquivo + ".json")) {
            gson.toJson(objeto, escrita);
        }
    }
}
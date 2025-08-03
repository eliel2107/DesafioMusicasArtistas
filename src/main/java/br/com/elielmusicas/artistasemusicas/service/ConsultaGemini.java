package br.com.elielmusicas.artistasemusicas.service;

import com.google.genai.Client;

import com.google.genai.types.GenerateContentResponse;
import org.apache.http.HttpException;

import java.io.IOException;


public class ConsultaGemini {

    public static String obterInformacao(String texto) {
        String apiKey = System.getenv("GEMINI_API_KEY");
        Client client = Client.builder().apiKey(apiKey).build();;

        GenerateContentResponse response =
                null;
        try {
            response = client.models.generateContent(
                    "gemini-2.0-flash",
                    "Me fale sobre o artista " + texto,
                    null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (HttpException e) {
            throw new RuntimeException(e);
        }

        return response.text();
    }
}


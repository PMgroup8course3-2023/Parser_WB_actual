package org.example.Services;

import DB_Objects.Category.CategoryTable;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import reactor.core.publisher.Mono;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@Service
public class ServiceCategory {
    private WebClient webClient = WebClient.create();
    private ObjectMapper objectMapper = new ObjectMapper();

    public CategoryTable readJson(String url) {
        byte[] responseBytes = webClient.get()
                .uri(url)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(byte[].class)
                .block();
        try {
            assert responseBytes != null;
            String result = new String(responseBytes, StandardCharsets.UTF_8);
            System.out.println(result);

            return objectMapper.readValue(result, CategoryTable.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}

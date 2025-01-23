package br.com.tsuda.game_search_api.service;

import br.com.tsuda.game_search_api.controller.response.GameResponseDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GameServiceImpl implements GameService{

    @Value("${rawg.api.url}")
    private String API_URL;
    @Value("${rawg.api.key}")
    private String API_KEY;
    private RestTemplate restTemplate;

    public GameServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public GameResponseDTO getGameByName(String name) {
        String nameFormatted = name.toLowerCase().replace(" ", "-");
        String query = String.format("%s/games/%s?%s", API_URL, nameFormatted, API_KEY);

        return restTemplate.getForObject(query, GameResponseDTO.class);
    }
}

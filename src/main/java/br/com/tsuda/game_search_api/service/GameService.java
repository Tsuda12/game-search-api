package br.com.tsuda.game_search_api.service;

import br.com.tsuda.game_search_api.controller.response.GameResponseDTO;

public interface GameService {

    GameResponseDTO getGameByName(String name);
}

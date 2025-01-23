package br.com.tsuda.game_search_api.controller;

import br.com.tsuda.game_search_api.controller.response.GameResponseDTO;
import br.com.tsuda.game_search_api.service.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class GameController {

    private GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/{name}")
    public ResponseEntity<GameResponseDTO> getGameByName(@PathVariable String name) {
        GameResponseDTO response = gameService.getGameByName(name);

        return ResponseEntity.ok(response);
    }
}

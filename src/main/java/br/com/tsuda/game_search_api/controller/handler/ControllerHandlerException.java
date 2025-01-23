package br.com.tsuda.game_search_api.controller.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

@RestControllerAdvice
public class ControllerHandlerException {

    @ExceptionHandler(HttpClientErrorException.NotFound.class)
    public ResponseEntity notFound404(HttpClientErrorException exception) {
        return ResponseEntity.notFound().build();
    }
}

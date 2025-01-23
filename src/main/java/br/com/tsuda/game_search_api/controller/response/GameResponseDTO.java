package br.com.tsuda.game_search_api.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GameResponseDTO(
        @JsonProperty(value = "name")
        String name,
        @JsonProperty(value = "slug")
        String slug,
        @JsonProperty(value = "description")
        String description,
        @JsonProperty(value = "rating")
        Double rating,
        @JsonProperty("background_image")
        String background_image
) {}

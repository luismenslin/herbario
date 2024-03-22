package br.com.herbario.book;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record BookData(
        @NotBlank
        String title,
        @NotBlank
        String author,
        @NotBlank
        String edition,
        @NotNull
        Integer publication) {
}

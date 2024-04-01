package br.com.herbario.book;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record BookData(
        @NotNull
        String title,
        @NotNull
        String author,
        @NotNull
        String edition,
        @NotNull
        Integer publication) {
}

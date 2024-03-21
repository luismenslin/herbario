package br.com.herbario.controller;

import br.com.herbario.book.Book;
import br.com.herbario.book.BookData;
import br.com.herbario.book.BookRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository repository;

    @PostMapping
    public void register(@RequestBody @Valid BookData data) {
        repository.save(new Book(data));
    }
}

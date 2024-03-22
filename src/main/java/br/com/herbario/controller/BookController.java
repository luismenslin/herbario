package br.com.herbario.controller;

import br.com.herbario.book.Book;
import br.com.herbario.book.BookData;
import br.com.herbario.book.BookRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository repository;


    @GetMapping
    public List<Book> getBooks() {
        return repository.findAll();
    }

    @PostMapping("/register")
    @Transactional
    public void register(@RequestBody @Valid BookData data) {
        repository.save(new Book(data));
    }

    @DeleteMapping("/delete")
    @Transactional
    public void delete(@RequestBody Book book) {
        repository.delete(book);
    }

}

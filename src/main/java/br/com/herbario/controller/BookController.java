package br.com.herbario.controller;

import br.com.herbario.book.Book;
import br.com.herbario.book.BookData;
import br.com.herbario.book.BookList;
import br.com.herbario.service.BookService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.beans.Transient;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/list")
    public List<BookList> getBooks() {
        return service.getBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return service.getBookById(id);
    }

    @PostMapping("/register")
    @Transactional
    public void register(@RequestBody @Valid BookData data) {
        service.saveBook(data);
    }

    @DeleteMapping("/delete")
    @Transactional
    public void delete(@RequestBody Book book) {
        service.deleteBook(book);
    }


}
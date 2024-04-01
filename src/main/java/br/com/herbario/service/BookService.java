package br.com.herbario.service;

import br.com.herbario.book.Book;
import br.com.herbario.book.BookData;
import br.com.herbario.book.BookList;
import br.com.herbario.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public List<BookList> getBooks() {
        return repository.findAll().stream().map(BookList::new).toList();
    }

    public void saveBook(BookData data) {
        repository.save(new Book(data));
    }

    public void deleteBook(Book book) {
        repository.deleteById(book.getId());
    }


    public Book getBookById(Long id) {
        return repository.findById(id).orElse(null);
    }
}

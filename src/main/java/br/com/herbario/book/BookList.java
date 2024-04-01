package br.com.herbario.book;

import br.com.herbario.book.Book;

public record BookList (Long id, String title, String author, String edition, Integer publication) {
    public BookList(Book book) {
        this(book.getId(), book.getTitle(), book.getAuthor(), book.getEdition(), book.getPublication());
    }
}

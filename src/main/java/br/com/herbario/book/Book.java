package br.com.herbario.book;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "books")
@Entity(name = "Book")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String edition;
    private Integer publication;

    public Book (BookData data) {
        this.title = data.name();
        this.author = data.author();
        this.edition = data.edition();
        this.publication = data.publication();
    }
}

package cw.sem6.task1;

import java.util.List;
import java.util.stream.Collectors;

public class Library implements Searchable {
    List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }
    public Library() {
    }


    @Override
    public List<Book> findListBookByAuthor(String author) {
        return books.stream().filter(el-> el.getAutor().equals(author)).collect(Collectors.toList());
    }
}

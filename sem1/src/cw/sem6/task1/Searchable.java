package cw.sem6.task1;

import java.util.List;

public interface Searchable {
    List<Book> findListBookByAuthor(String author);
}

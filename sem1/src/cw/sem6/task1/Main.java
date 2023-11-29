package cw.sem6.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("qwe", "asd", 1 , new BookGenre("romantic"));
        Book book2 = new Book("qwe1", "asd1", 3 , new BookGenre("romantic"));
        Book book3 = new Book("qwe2", "asd2", 5);
        Book book4 = new Book("qwe3", "asd2", 6);
        ElectronBook book5 = new ElectronBook("qwe4", "asd2", 6, "HTML", 52.0);
        Library library1 = new Library(new ArrayList<>(Arrays.asList(book1, book2, book3, book4, book5)));
        System.out.println(library1.findListBookByAuthor("asd2"));
        Formatter formatter = new JsonFormatter();
        formatter.toFormat(library1.findListBookByAuthor("asd").get(0));
    }
}

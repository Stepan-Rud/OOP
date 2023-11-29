package cw.sem6.task1;

public class Book {
    private String name;
    private String autor;
    private Integer countList;
    private BookGenre bookGenre;
//    private Integer year; //todo не знаю какие еще поля

    public Book(String name, String autor, Integer countList) {
        this.name = name;
        this.autor = autor;
        this.countList = countList;
    }

    public Book(String name, String autor, Integer countList, BookGenre bookGenre) {
        this.name = name;
        this.autor = autor;
        this.countList = countList;
        this.bookGenre = bookGenre;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", countList=" + countList +
                '}';
    }

}

package cw.sem6.task1;

public class BookGenre implements Genre{
    private String genre;

    public BookGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String GetGenre(Book book) {
        return genre;
    }
}

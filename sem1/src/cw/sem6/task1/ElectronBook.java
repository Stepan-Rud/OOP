package cw.sem6.task1;

public class ElectronBook extends Book{
    private String formatRead;
    private Double sizeBook;

    public ElectronBook(String name, String autor, Integer countList, String formatRead, Double sizeBook) {
        super(name, autor, countList);
        this.formatRead = formatRead;
        this.sizeBook = sizeBook;
    }

    @Override
    public String toString() {
        return "ElectronBook{" +
                "formatRead='" + formatRead + '\'' +
                ", sizeBook=" + sizeBook +
                '}';
    }
}

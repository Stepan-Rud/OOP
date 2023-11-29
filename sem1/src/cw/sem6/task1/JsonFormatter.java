package cw.sem6.task1;

public class JsonFormatter implements Formatter{
    @Override
    public void toFormat(Book book) {
        System.out.println(book + "Была отформатирована в формате json");
    }

//    @Override
//    public void toFormat() {
//
//    }
}

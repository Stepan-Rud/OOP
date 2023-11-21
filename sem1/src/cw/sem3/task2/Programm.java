package cw.sem3.task2;

public class Programm {
    public static void main(String[] args) {
//        Создать перечисление фруктов, сравнить их значение в switch case с различным выводом по каждому типу.
        Frutis fruits = Frutis.PINAPPLE;
        for (Frutis elem : Frutis.values()) {
            System.out.println(elem);
        }
        switch (fruits){
            case APPLE:
                System.out.println("Этот фрукт - " + fruits.getName());
                break;
            case ORANGE:
                System.out.println("Этот фрукт - " + fruits.getName());
                break;
            case BANANA:
                System.out.println("Этот фрукт - " + fruits.getName());
            default:
                System.out.println("Это не опознанный фрукт");
        }
    }
}

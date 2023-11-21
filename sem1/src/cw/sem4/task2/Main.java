package cw.sem4.task2;

public class Main {
    public static void main(String[] args) {
//        Создать коробку с числами(BoxWithNumber) и найти среднее
//        значение(average) и сравнение средних(compareAverage).
        BoxWithNumber<Integer> box1 = new BoxWithNumber<>(new Integer[]{1, 200, 3, 5});
        BoxWithNumber<Double> box2 = new BoxWithNumber<>(new Double[]{5.2, 8.4, 3.43, 55.3});
//        if (box1.overage() > box2.overage()) System.out.println("box1 > box2");
        System.out.println(box1.compareOverage(box2));
    }
}

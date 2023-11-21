package cw.sem5.Podskazki;

public class AnonimClass {
    public static void main(String[] args) {
//        Flyaxble flyable = new Flyable() {
//            @Override
//            public void flu() {
//                System.out.println("лечу!");
//            }
        };
        // пишем  new Flyable()
        // org.example.z5.Outer$1 добавляется  под капотом implements Flyable
        // происходит оверайд методов (его видим)
        // создается объект  Outer flyable = new Outer();
//        System.out.println(flyable.getClass().getName());
    }

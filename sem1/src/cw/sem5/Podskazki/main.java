package cw.sem5.Podskazki;

public class main {
    class Inner {
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod() {
            System.out.println(innerValue);
//            innerMethod(); todo:  закоментировал тк рекурсия
            System.out.println(outerValue);
            outerMethod();
            System.out.println("hello");
            //внутренний класс имеет доступ ко всем полям и методам внешнего класса
        }
    }

    int outerValue;

    public void outerMethod() {
        System.out.println(outerValue);
//        outerMethod(); todo:  закоментировал тк рекурсия
//        System.out.println(innerValue);
//        innerMethod();
        System.out.println("outer Hello");
        //внешний класс не имеет доступа ко всем полям и методам внутреннего класса
    }

    public static void main(String[] args) {
    //    Inner inner = new Inner(); // внутренний класс не живет без внешнего -> так создать не получится
    }
}

package cw.sem5.Podskazki;

public class duble2 {
    static class Inner {
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod() {
            System.out.println(innerValue);
//            innerMethod(); todo:  закоментировал тк рекурсия
//            System.out.println(outerValue); ограничение 1
//            outerMethod(); ограничение 2
            System.out.println("hello");
            //вложенный класс может существовать без объектов внешнего класса -> накладываются ограничения
        }
    }

    int outerValue;

    public void outerMethod() {
        System.out.println(outerValue);
//        outerMethod(); todo:  закоментировал тк рекурсия
//        System.out.println(innerValue);
//        innerMethod();
        System.out.println("outer Hello");
        //внешний класс не имеет доступа ко всем полям и методам вложенного класса(не связные тк есть static)
    }

    public static void main(String[] args) {
        Inner inner = new Inner(10); // вложенный класс можно инстансировать отдельно
    }

//14:33
//        1 по логике взаимодействия(как будто бы наслдедование)
//
//14:33
//        2 по расположению(было лень разбивать на 2 отдельных)
}

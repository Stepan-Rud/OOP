package cw.sem4.task1;

public class SimpleBox{ //<T>
     private Object object;
//     1)	Создать класс - коробку (SimpleBox), которая может хранить любые объекты.
//    Посмотреть с какими ошибками можно столкнуться и исправить данное решение на более подходящее(GenBox).

    public SimpleBox(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}

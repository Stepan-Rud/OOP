package cw.sem4.task1;

public class Main {
    public static void main(String[] args) {
        SimpleBox simpleBox1 = new SimpleBox(10);
        SimpleBox simpleBox2 = new SimpleBox(20);
//        Integer x = simpleBox1.getObject() + simpleBox2.getObject(); Проблема каста
        Integer x = (Integer) simpleBox1.getObject() + (Integer) simpleBox2.getObject();
        System.out.println("x = " + x);
//        simpleBox1.setObject("TestGava"); Ошибка типизации(каста)
//        Integer y = (Integer) simpleBox1.getObject() + (Integer) simpleBox2.getObject();
        if (simpleBox1.getObject() instanceof Integer && simpleBox2.getObject() instanceof Integer){
            Integer y = (Integer) simpleBox1.getObject() + (Integer) simpleBox2.getObject();
        }
        else System.out.println("Что-то пошло не так");
    }
}

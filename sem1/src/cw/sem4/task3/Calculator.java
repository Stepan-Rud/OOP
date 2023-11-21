package cw.sem4.task3;

import java.util.List;

public class Calculator {
//    3)	Написать класс калькулятор, принимающий List целочисленных значений,
//    возвращающий сумму элементов коллекции (метод sum)
    public Double sum(List<? extends Number> arr){
        double result = 0;
        for (Number number : arr) {
            result += number.doubleValue();
        }
        return result;
    }
}

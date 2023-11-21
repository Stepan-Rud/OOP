package cw.sem4.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        System.out.println(calc1.sum(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println(calc1.sum(Arrays.asList(1.43, 2.34, 3.12, 4.43, 5.32)));
    }
}

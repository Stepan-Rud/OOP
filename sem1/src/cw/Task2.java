package cw;

public class Task2 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 1, 5);
        Vector vector2 = new Vector(2, 5, 2);

        System.out.println("1"+vector1);
        System.out.println("2"+vector2);
        System.out.println("Длина первого вектора  = " + vector1.lenghtVector());
        System.out.println("Скалярное произведение vector1 и vector2 = " + vector1.scolar(vector2));
        System.out.println("Векторное произведение vector1 и vector2 = " + vector1.multiVector(vector2));
        vector1.cos(vector2);
    }
}

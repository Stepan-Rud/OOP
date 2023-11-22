import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator("12","5");
        System.out.println(calc1.mult(Arrays.asList(calc1.getNum1(), calc1.getNum2())));
        System.out.println(calc1.div(Arrays.asList(calc1.getNum1(), calc1.getNum2())));
        System.out.println(calc1.div(Arrays.asList(1.2, 5.0, 2.1)));
        System.out.println(calc1.div(Arrays.asList(1.3, 1.6, 2,5)));
    }
}

package hw.calculator;

import java.util.List;

public class Calculator {
    private String binary1;
    private String binary2;
    private Integer num1;
    private Integer num2;

    public Calculator(String binary1, String binary2) {
        this.binary1 = binary1;
        this.binary2 = binary2;
        this.num1 = Integer.parseInt(binary1);
        this.num2 = Integer.parseInt(binary2);
    }

    public Calculator(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double sum(List<? extends Number> arr){
        double result = 0;
        for (Number number : arr) {
            result += number.doubleValue();
        }
        return result;
    }
    public Double mult(List<? extends Number> arr){
        double result = arr.get(0).doubleValue();
        for (int i = 1; i < arr.size(); i++) {
            result *= arr.get(i).doubleValue();
        }
        return result;
    }
    public Double div(List<? extends Number> arr){
        double result = arr.get(0).doubleValue();
        for (int i = 1; i < arr.size(); i++) {
            double examenationNumber = arr.get(i).doubleValue();
            if(examenationNumber != 0) {
                result /= arr.get(i).doubleValue();
            }
            else {
                result = 0;
                System.out.println("На ноль делить нельзя");
            }
        }
        return result;
    }

    public Integer getNum1() {
        return num1;
    }

    public Integer getNum2() {
        return num2;
    }
}

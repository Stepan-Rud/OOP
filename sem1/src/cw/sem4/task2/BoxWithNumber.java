package cw.sem4.task2;

public class BoxWithNumber <T extends Number>{
    private T[] arr;

    public BoxWithNumber(T[] arr) {
        this.arr = arr;
    }

    public double overage(){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i].doubleValue() + sum;
        }
        return  sum/ arr.length;
    }

    public boolean compareOverage(BoxWithNumber<?> box2) {
        return this.overage() > box2.overage();
    }
//    public boolean compareOverage(BoxWithNumber box2){
//        return this.overage() > box2.overage();
//    }
}

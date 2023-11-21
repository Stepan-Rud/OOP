package cw.sem3.task1;

public enum Montch {
    JAN, FEB, MAR, APR, MAY, JYN, JUL, AVG, SEP, OCT, NOV, DEC;

    Montch(int number) {
        this.number = number;
    }
    Montch() {
    }

    public int getNumber() {
        return number;
    }

    private int number;
}

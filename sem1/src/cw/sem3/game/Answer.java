package cw.sem3.game;

public class Answer {
    private Integer numTry;
    private Integer bull;
    private Integer cow;

    public Answer(Integer numTry, Integer bull, Integer cow) {
        this.numTry = numTry;
        this.bull = bull;
        this.cow = cow;
    }
    public Answer() {

    }

    public Integer getNumTry() {
        return numTry;
    }

    public Integer getBull() {
        return bull;
    }

    public Integer getCow() {
        return cow;
    }

    public void setNumTry(Integer numTry) {
        this.numTry = numTry;
    }

    public void setBull(Integer bull) {
        this.bull = bull;
    }

    public void setCow(Integer cow) {
        this.cow = cow;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "numTry=" + numTry +
                ", bull=" + bull +
                ", cow=" + cow +
                '}';
    }
}

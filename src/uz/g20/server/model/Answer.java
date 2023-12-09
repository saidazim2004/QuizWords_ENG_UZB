package uz.g20.server.model;

public class Answer {
    private double uzbID;
    private  boolean isCorrect;

    public Answer(double uzbID, boolean isCorrect) {
        this.uzbID = uzbID;
        this.isCorrect = isCorrect;
    }

    public double getUzbID() {
        return uzbID;
    }

    public boolean isCorrect() {
        return isCorrect;
    }
}

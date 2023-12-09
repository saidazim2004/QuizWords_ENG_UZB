package uz.g20.server.model;

public class Quiz {
    private double engID;
    private Answer answer;

    public Quiz(double engID,Answer answer) {
        this.engID = engID;
    }

    public Answer getAnswer() {
        return answer;
    }

    public double getEngID() {
        return engID;
    }
}

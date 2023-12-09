package uz.g20.server.model;

public class WrongAnswerCollector {
    private int whichQuestion;
    private String correctAnswer;
    private String wrongAnswer;

    public WrongAnswerCollector(int whichQuestion, String correctAnswer, String wrongAnswer) {
        this.whichQuestion = whichQuestion;
        this.correctAnswer = correctAnswer;
        this.wrongAnswer = wrongAnswer;
    }

    @Override
    public String toString() {
        return whichQuestion +  " - question\n" +
                "wrong answer is "  + wrongAnswer +
                "\ncorrect answer is " + correctAnswer + "\n";
    }
}

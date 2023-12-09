package uz.g20.server.model;

public class UzbWords extends IDcreator {
    private  String answer;
    private Double question_id;

    public UzbWords(String answer, Double question_id) {
        this.answer = answer;
        this.question_id = question_id;
    }

    public String getAnswer() {
        return answer;
    }

    public Double getQuestion_id() {
        return question_id;
    }
}

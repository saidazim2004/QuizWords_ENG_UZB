package uz.g20.server.model;

public class Question extends IDcreator {
    private String unitName;
    private String question;

    public Question(String unitName, String question){
        this.unitName = unitName;
        this.question = question;
    }

    public String getUnitName() {
        return unitName;
    }

    public String getQuestion() {
        return question;
    }

}

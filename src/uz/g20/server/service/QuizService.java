package uz.g20.server.service;

import uz.g20.server.database.Database;
import uz.g20.server.model.Question;
import uz.g20.server.model.UzbWords;

import java.util.*;

public class QuizService {
    static Random random_double = new Random();
    static Random random = new Random();
    public static List<Question> generateQuestion(String unitNumber) {
        double numberUnit = Double.parseDouble(unitNumber);
        List<Question> questions = new ArrayList<>();
        double lastRange = 20.0 * numberUnit;
        double firstRange = lastRange - 19;

        for (int i = 1; i <= 5; i++) {
            Question question;
            if (lastRange == 20) {
                question = Database.ENG.get((int) random_double.nextDouble(firstRange-1, lastRange));
            } else {
                question = Database.ENG.get((int) random_double.nextDouble(firstRange, lastRange));
            }
            while (questions.contains(question)) {
                question = Database.ENG.get((int) random_double.nextDouble(firstRange, lastRange));
            }
            questions.add(question);
        }

        return questions;
    }

    public static Map<Question, List<UzbWords>> generateQuiz(List<Question> questions, String unitNumber) {
        Map<Question,List<UzbWords>>quiz = new HashMap<>();

        for (Question question : questions) {
        List<UzbWords>uzbWords = createQuestion(question,unitNumber);
        quiz.put(question,uzbWords);
        }

        return quiz;
    }

    private static List<UzbWords> createQuestion(Question question, String unitNumber) {
        double numberUnitUZb = Double.parseDouble(unitNumber);
        double UZBlastRange = 20.0* numberUnitUZb;
        double UZBfirstRange = UZBlastRange- 19;

       List<UzbWords> uzbWords = new ArrayList<>();
       UzbWords uzbWordbyEndId = QuizService.findUzbByEng(question);
            UzbWords uzbword;
        for (int i = 1; i <= 4; i++) {
            if (UZBlastRange == 20) {
                uzbword = Database.UZB.get((int) random_double.nextDouble(UZBfirstRange-1, UZBlastRange));
            } else {
                uzbword = Database.UZB.get((int) random_double.nextDouble(UZBfirstRange, UZBlastRange));
            }
            while (uzbWords.contains(uzbword)) {
                uzbword = Database.UZB.get((int) random_double.nextDouble(UZBfirstRange, UZBlastRange));
            }
            uzbWords.add(uzbword);
        }
        if(!uzbWords.contains(uzbWordbyEndId)){
            uzbWords.set(random.nextInt(0,4),uzbWordbyEndId);
        }
        return uzbWords;
    }

    private static UzbWords findUzbByEng(Question question) {
        for (UzbWords uzbWords : Database.UZB) {
            if(uzbWords.getQuestion_id().equals(question.getId())) return uzbWords;
        }
        return null;
    }

    public static UzbWords findUZBByItsId(String uzbId) {
        String id;
        for (UzbWords uzbWords : Database.UZB) {
            id = String.valueOf(uzbWords.getId());
            if(id.equals(uzbId)) return uzbWords;
        }
        return null;
    }

    public static String findUzbName(String id) {
        double DoubleId =Double.parseDouble(id) ;
        for (UzbWords uzbWords : Database.UZB) {
            if(uzbWords.getQuestion_id().equals(DoubleId)) return uzbWords.getAnswer();
        }
        return null;
    }
}

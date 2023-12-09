package uz.g20.server.controller;

import uz.g20.server.model.Question;
import uz.g20.server.model.UzbWords;
import uz.g20.server.service.QuizService;

import java.util.List;
import java.util.Map;

public class QuizController {
    public static List<Question> generateQuestion(String unitNumber) {
        return QuizService.generateQuestion(unitNumber);
    }

    public static Map<Question, List<UzbWords>> generateQuiz(List<Question> questions, String unitNumber) {
        return QuizService.generateQuiz(questions,unitNumber);
    }

    public static UzbWords findUZBByItsId(String capitalId) {
        return QuizService.findUZBByItsId(capitalId);
    }

    public static String findUzbName(String id) {
        return QuizService.findUzbName(id);
    }
}

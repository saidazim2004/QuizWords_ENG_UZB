package uz.g20.clinet.ui;

import uz.g20.clinet.util.ScannerUtil;
import uz.g20.server.controller.QuizController;
import uz.g20.server.model.*;

import java.util.*;

public class PlayingUI {
    public static void playing() {
        while (true){
            System.out.println("1. UNIT 1");
            System.out.println("2. UNIT 2");
            System.out.println("3. UNIT 3");
            System.out.println("0. Exit");
            System.out.println("Enter operation: ");
            String unitNumber = ScannerUtil.SCANNER_STR.nextLine();
            if(unitNumber.equals("0")){
                return;
            }
            if(unitNumber.equals("1") || unitNumber.equals("2") || unitNumber.equals("3")){
                question(unitNumber);
            }
        }
    }

    private static void question(String unitNumber) {
        List<Question> questions = QuizController.generateQuestion(unitNumber);

        Map<Question,List<UzbWords>>quiz =QuizController.generateQuiz(questions,unitNumber);

        Set<Map.Entry<Question,List<UzbWords>>> printQuiz = quiz.entrySet();


        List<Quiz> quizList = new ArrayList<>();

        int totalCorrectAnswer = 0;
        int questionQuest = 1;

        List<WrongAnswerCollector> wrongAnswerCollectors = new ArrayList<>();
        int counter = 0;

        for (Map.Entry<Question, List<UzbWords>> questionListEntry : printQuiz) {
            while (true){
                counter++;
                System.out.println(counter+": find - " + questionListEntry.getKey().getQuestion());
                for (UzbWords uzbWords : questionListEntry.getValue()) {
                    System.out.printf("%s:  %s\n", uzbWords.getId(), uzbWords.getAnswer());
                }
                System.out.print("\nChoose one answer by its id: ");
                String uzbId = ScannerUtil.SCANNER_STR.nextLine();
                if(!uzbId.endsWith(".0")) uzbId = uzbId.concat(".0");
                UzbWords uzbWords = QuizController.findUZBByItsId(uzbId);

                if (uzbWords == null) continue;

                if(!questionListEntry.getValue().contains(uzbWords)) continue;

                Question question = questionListEntry.getKey();
                String id = String.valueOf(question.getId());
                String word = String.valueOf(uzbWords.getQuestion_id());
                boolean isCorrect = false;
                if(id.equals(word)){
                    ++totalCorrectAnswer;
                    isCorrect=true;
                }
                else{
                    String idd = String.valueOf(questionListEntry.getKey().getId());
                    String findUzb = QuizController.findUzbName(idd);
                    wrongAnswerCollectors.add(new WrongAnswerCollector(questionQuest,findUzb,uzbWords.getAnswer()));
                }
                double uzbIdD = Double.parseDouble(uzbId);
                Answer answer = new Answer(uzbIdD,isCorrect);

                quizList.add(new Quiz(questionListEntry.getKey().getId(),answer));

                questionQuest++;
                break;
            }
        }

        System.out.println("\n Total correct answers are " + totalCorrectAnswer);
        System.out.println();
        System.out.println("    ---***---    ");
        if(!wrongAnswerCollectors.isEmpty()){
            System.out.println("Correct Answers: ");
            for (WrongAnswerCollector wrongAnswerCollector : wrongAnswerCollectors) {
                System.out.println(wrongAnswerCollector);
            }
        }
//        DataBase.USER_QUIZ_HISTORIES.add(new UserQuizHistory(user.getId(), quizList, totalCorrectAnswers));


    }

}

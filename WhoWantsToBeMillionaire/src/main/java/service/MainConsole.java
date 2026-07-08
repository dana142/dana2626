package service;

import help.AudienceHelp;
import help.FiftyFiftyHelp;
import help.HelpAnswer;
import help.PhoneHelp;
import model.Answer;
import model.AnswerSequence;
import model.Question;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainConsole {
    private static List<List<Question>> gameDate = GameDatabase.initializeGameData();
    private static FiftyFiftyHelp fiftyFifty = new FiftyFiftyHelp();
    private static AudienceHelp audience = new AudienceHelp();
    private static PhoneHelp phone = new PhoneHelp();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int currentLevel = 1;
        int maxLevel = 5;
        int totalScore = 0;
        boolean isPlaying = true;

        System.out.println("------Bine ati venit la Vrei sa fii Milionar!------");

        while(isPlaying && currentLevel <= maxLevel) {
            Question currentQuestion = getQuestionByLevel(currentLevel);
            System.out.println("\nNivelul " + currentLevel + "| Pentru " + currentQuestion.getScore() + "puncte.");
            System.out.println(currentQuestion.getQuestion());

            for (Answer ans : currentQuestion.getAnswers()) {
                System.out.println(ans);
            }
            System.out.println("Optiuni ajutatoate valabile:" +
                    (!fiftyFifty.isUsed() ? "[F] 50:50" : "") +
                    (!audience.isUsed() ? "[A] Public " : "") +
                    (!phone.isUsed() ? "[P] Suna un prieten " : ""));
            System.out.println("Alegeti raspunsul (A, B, C, D) sau un ajutor:");
            String input = scanner.nextLine().toUpperCase();

            if (input.equals("F") || input.equals("A") || input.equals("P")) {
                handleHelp(input, currentQuestion);
                System.out.println("Acum alegeti raspunsul final (A, B, C, D)");
                input = scanner.nextLine().trim().toUpperCase();
            }
            AnswerSequence userChoice;
            try {
                userChoice = AnswerSequence.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Optiune invalida! Ai pierdut");
                break;
            }
            Answer correctAnswer = currentQuestion.getCorrectAnswer();
            if (correctAnswer.getSequence() == userChoice) {
                totalScore = currentQuestion.getScore();
                System.out.println("Corect! Ai castigat" + totalScore + "puncte.");
                currentLevel++;
            } else {
                System.out.println("Raspuns gresit! Jocul s-a terminat. Score: " + totalScore);
                isPlaying = false;
            }
            if (currentLevel > maxLevel) {
                System.out.println("\nFelicitari! Ai castigat:" + totalScore + "puncte!");
            }
        }
    }
    private static Question getQuestionByLevel(int level){
        List<Question> questionsForLevel = gameDate.get(level - 1);
        Random rand = new Random();
        return questionsForLevel.get(rand.nextInt(questionsForLevel.size()));
    }
    private static void handleHelp(String choice, Question q){
        switch (choice) {
            case "F":
                if (fiftyFifty.isUsed()) {System.out.println("Ajutor folosit");
                    return;
                }
                List<HelpAnswer> ffList = fiftyFifty.getHelpAnswer(q);
                System.out.println("Raspunsuri ramase:");
                ffList.forEach(ha -> System.out.println(ha.getAnswer()));
                break;
            case "A":
                if (audience.isUsed()) {System.out.println("Ajutor folosit!");
                return;
                }
                List<HelpAnswer> audList = audience.getHelpAnswer(q);
                System.out.println("Procentajele publicului:");
                audList.forEach(ha -> System.out.println(ha.getAnswer().getSequence() + ":" +ha.getProbability() + "%"));
                break;
            case"P":
                if (phone.isUsed()) {System.out.println("Ajutor folosit!");
                return;
                }
                List<HelpAnswer> pList = phone.getHelpAnswer(q);
                System.out.println("Prietenul crede ca raspunsul corect este: " + pList.get(0).getAnswer());
                break;

        }
    }
}

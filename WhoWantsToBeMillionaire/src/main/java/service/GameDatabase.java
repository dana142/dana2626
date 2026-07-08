package service;

import model.Answer;
import model.AnswerSequence;
import model.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameDatabase {
    public static List<List<Question>> initializeGameData(){
        List<List<Question>> gameStructure = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            gameStructure.add(new ArrayList<>());
        }
        gameStructure.get(0).add(new Question("In ce an a inceput Primul Razboi Mondial:",
                Arrays.asList(
                        new Answer("1987", false, AnswerSequence.A),
                        new Answer("1914", true, AnswerSequence.B),
                        new Answer("1876", false, AnswerSequence.C),
                        new Answer("1987", false, AnswerSequence.D)

                ), 1, 100));
        gameStructure.get(1).add(new Question("Care este cel mai lung fluviu din Europa?",
                Arrays.asList(
                        new Answer("Dunarea", false, AnswerSequence.A),
                        new Answer("Volga", true, AnswerSequence.B),
                        new Answer("Rin", false, AnswerSequence.C),
                        new Answer("Nipru", false, AnswerSequence.D)
                ), 2, 500));
        gameStructure.get(2).add(new Question("In ce an a cazut Zidul Berlinului?",
                Arrays.asList(
                        new Answer("1989", true, AnswerSequence.A),
                        new Answer("1991", false, AnswerSequence.B),
                        new Answer("1985", false, AnswerSequence.C),
                        new Answer("1993", false, AnswerSequence.D)
                ),3, 1000));
        gameStructure.get(3).add(new Question("Cine a fost primul presedinte al SUA?",
                Arrays.asList(
                        new Answer("Washington", true, AnswerSequence.A),
                        new Answer("Lincoln", false, AnswerSequence.B),
                        new Answer("Kennedy", false, AnswerSequence.C),
                        new Answer("Obama", false, AnswerSequence.D)
                ), 4, 5000));
        gameStructure.get(4).add(new Question("In ce an s-a desfiintat Uniunea Sovetica?",
                Arrays.asList(
                        new Answer("1989", false, AnswerSequence.A),
                        new Answer("1995", false, AnswerSequence.B),
                        new Answer("1991", true, AnswerSequence.C),
                        new Answer("2001", false, AnswerSequence.D)
                ),5, 10000));
        return gameStructure;
    }
}

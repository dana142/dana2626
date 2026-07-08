package model;
import exception.InvalidLevelException;
import exception.InvalidScoreException;

import java.util.List;
import java.util.stream.Collectors;

public class Question {
    private String question;
    private List<Answer> answer;
    private int level;
    private int score;
 public Question(String question, List<Answer> answer,int level, int score) {
     if (score <= 0) {
         throw new InvalidScoreException("Scorul trebuie sa fie mai mare decat 0!");
     }
     if (level <= 0 || level >= 15) {
         throw new InvalidLevelException("Nivelul trebuie sa fie intre 1 si 14 inclusiv! ");
     }
     this.question = question;
     this.answer = answer;
     this.level = level;
     this.score = score;
 }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answer;
    }

    public void setAnswers(List<Answer> answer) {
        this.answer = answer;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
     if (level <= 0 || level >= 15){
         throw new InvalidLevelException("Nivelul trebuie sa fie intre 1 si 14 inclusiv!");
     }
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
     if(score <= 0){
         throw new InvalidScoreException("Scorul trebuie sa fie mai mare decat 0!");
     }
        this.score = score;
    }
    public Answer getCorrectAnswer(){
     return answer.stream()
             .filter(Answer::isCorrect)
             .findFirst()
             .orElse(null);
    }
    public List<Answer> getWrongAnswers() {
     return answer.stream()
             .filter(answer -> !answer.isCorrect())
             .collect(Collectors.toList());
    }
}

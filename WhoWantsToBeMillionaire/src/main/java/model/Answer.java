package model;

public class Answer {
    private String answer;
    private boolean isCorrect;
    private AnswerSequence sequence;
    public Answer(String answer, boolean isCorrect, AnswerSequence sequence) {
        this.answer = answer;
        this.isCorrect = isCorrect;
        this.sequence = sequence;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public AnswerSequence getSequence() {
        return sequence;
    }

    public void setSequence(AnswerSequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return sequence + ": " + answer;
    }
}

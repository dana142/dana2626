package help;

import model.Answer;

public class HelpAnswer {
    private Answer answer;
    private double probability;
    public HelpAnswer(Answer answer, double probability){
        this.answer = answer;
        this.probability = probability;
    }

    public Answer getAnswer() {
        return answer;
    }

    public double getProbability() {
        return probability;
    }
}

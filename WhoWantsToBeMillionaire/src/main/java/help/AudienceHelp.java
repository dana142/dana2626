package help;

import model.Answer;
import model.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AudienceHelp extends HelpOption {
    public List<HelpAnswer> getHelpAnswer(Question question){
        setUsed(true);
        List<HelpAnswer> result = new ArrayList<>();
        Random rand = new Random();

        int correctProb = rand.nextInt(31) + 50;
        int remaining = 100 - correctProb;

        int w1 = rand.nextInt(remaining / 2 + 1);
        remaining -= w1;
        int w2 = rand.nextInt(remaining + 1);
        int w3 = remaining - w2;

        int wrongIdx = 0;
        int[] wrongProbs = {w1, w2, w3};
        for (Answer ans : question.getAnswers()){
            if (ans.isCorrect()) {
                result.add(new HelpAnswer(ans, correctProb));
            } else {
                result.add(new HelpAnswer(ans, wrongProbs[wrongIdx++]));
            }
        }
        return result;
    }

}

package help;

import model.Answer;
import model.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class FiftyFiftyHelp extends HelpOption {
    public List<HelpAnswer> getHelpAnswer(Question question) {
        setUsed(true);
        List<HelpAnswer> result = new ArrayList<>();
        Answer correct = question.getCorrectAnswer();
        List<Answer> wrongs = question.getWrongAnswers();

        Random rand = new Random();
        Answer randomWrong = wrongs.get(rand.nextInt(wrongs.size()));
        result.add(new HelpAnswer(correct, 50.0));
        result.add(new HelpAnswer(randomWrong, 50.0));
        return result;
    }
}

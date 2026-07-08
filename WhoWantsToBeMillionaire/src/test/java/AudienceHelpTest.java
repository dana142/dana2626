import help.AudienceHelp;
import help.FiftyFiftyHelp;
import help.HelpAnswer;
import model.Answer;
import model.AnswerSequence;
import model.Question;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AudienceHelpTest {
    @Test
    public void testGetHelpAnswer() {
        AudienceHelp aud = new AudienceHelp();
        Question q = new Question("Q", Arrays.asList(
                new Answer("A", true, AnswerSequence.A),
                new Answer("B", false, AnswerSequence.B),
                new Answer("C", false, AnswerSequence.C),
                new Answer("D", false, AnswerSequence.D)), 1, 100);
        List<HelpAnswer> res = aud.getHelpAnswer(q);
        assertEquals(4, res.size());
        assertEquals(100.0, res.stream().mapToDouble(HelpAnswer::getProbability).sum(),0.01);

        double correctProb = res.stream()
                .filter(ha -> ha.getAnswer().isCorrect())
                .findFirst().get().getProbability();

        boolean isHighest = res.stream()
                .filter(ha -> !ha.getAnswer().isCorrect())
                .allMatch(ha -> ha.getProbability() < correctProb);

    }

    }

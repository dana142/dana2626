import help.FiftyFiftyHelp;
import help.HelpAnswer;
import model.Answer;
import model.AnswerSequence;
import model.Question;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FiftyFiftyHelpTest {
    @Test
    public void testGetHelpAnswer(){
        FiftyFiftyHelp ff = new FiftyFiftyHelp();
        Question q = new Question("Q", Arrays.asList(
                new Answer ("A", true, AnswerSequence.A),
                new Answer ("B", false, AnswerSequence.B),
                new Answer ("C", false, AnswerSequence.C),
                new Answer ("D", false, AnswerSequence.D)), 1, 100);

        List<HelpAnswer> res = ff.getHelpAnswer(q);
        assertEquals(2, res.size());
        assertTrue(ff.isUsed());
        assertTrue(res.stream().anyMatch(ha -> ha.getAnswer().isCorrect()));

    }
}

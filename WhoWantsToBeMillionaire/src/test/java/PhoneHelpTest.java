import help.FiftyFiftyHelp;
import help.HelpAnswer;
import help.PhoneHelp;
import model.Answer;
import model.AnswerSequence;
import model.Question;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneHelpTest {
    @Test
    public void testGetHelpAnswer() {
        PhoneHelp ph = new PhoneHelp();
        Question q = new Question("Q", Arrays.asList(
                new Answer("A", true, AnswerSequence.A),
                new Answer("B", false, AnswerSequence.B),
                new Answer("C", false, AnswerSequence.C),
                new Answer("D", false, AnswerSequence.D)), 1, 100);

        List<HelpAnswer> res = ph.getHelpAnswer(q);
        assertEquals(1, res.size());
        assertTrue(res.get(0).getAnswer().isCorrect());
    }
}

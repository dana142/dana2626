import model.Answer;
import model.AnswerSequence;
import model.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class QuestionTest {
    private Question question;
    private Answer correctAnswer;

    @BeforeEach
    public void setUp() {
        correctAnswer = new Answer("Corect", true, AnswerSequence.A);
        question = new Question("Intrebare?",
                Arrays.asList(correctAnswer,
                        new Answer("G1", false, AnswerSequence.B),
                        new Answer("G2", false, AnswerSequence.C),
                        new Answer("G3", false, AnswerSequence.D)), 1, 100);


    }

    @Test
    public void testGetCorrectAnswer() {
        assertEquals(correctAnswer, question.getCorrectAnswer());

    }

    @Test
    public void testGetWrongAnswers() {
        List<Answer> wrongs = question.getWrongAnswers();
        assertEquals(3, wrongs.size());
        wrongs.forEach(ans -> assertFalse(ans.isCorrect()));
    }
}


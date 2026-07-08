package help;
import model.Question;

import java.util.List;

public interface Invokable {
    List<HelpAnswer> getHelpAnswer(Question question);
}

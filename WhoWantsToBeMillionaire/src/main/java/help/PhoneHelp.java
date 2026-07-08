package help;

import model.Question;

import java.util.ArrayList;
import java.util.List;


public class PhoneHelp extends HelpOption{
    public List<HelpAnswer> getHelpAnswer (Question question){
        setUsed(true);
        List<HelpAnswer> result = new ArrayList<>();
        result.add(new HelpAnswer(question.getCorrectAnswer(), 100.0));
        return result;
    }
}

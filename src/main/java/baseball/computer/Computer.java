package baseball.computer;

import baseball.answer.Answer;
import baseball.baseball.BaseballGenerator;

public class Computer {

    public Answer createAnswer() {
        return new Answer(BaseballGenerator.generateRandom());
    }
}

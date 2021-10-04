package baseball.computer;

import baseball.answer.Answer;
import baseball.baseball.BaseballGenerator;

/**
 * @author eedys1234
 * @version 1.0
 * @since 1.0
 * Baseball Computer 클래스
 */
public class Computer {

    /**
     * Computer Baseballs 생성함수
     * @return Answer
     */
    public Answer createAnswer() {
        return new Answer(BaseballGenerator.generateRandom());
    }
}

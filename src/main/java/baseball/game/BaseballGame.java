package baseball.game;

import baseball.answer.AnswerMatcher;
import baseball.baseball.Baseball;
import baseball.baseball.BaseballGenerator;
import baseball.computer.Computer;
import baseball.ui.Input;
import baseball.ui.Output;

import java.util.List;

/**
 * Baseball 게임을 관리하는 클래스
 */
public class BaseballGame {

    private Computer computer;
    private AnswerMatcher answerMatcher;
    private List<Baseball> userBaseballs;

    public BaseballGame() {
        computer = new Computer();
    }

    public void play() {
        Output.printBaseballGameStart();
        answerMatcher = readyAnswer();
        do {
            playOnce();
        }
        while(isNotAnswer());
        Output.printBaseballGameEnd();
    }

    private void playOnce() {
        userBaseballs = receiveUserBaseballs();
        Output.printBaseballGameResult(answerMatcher.getResult(userBaseballs));
    }

    private List<Baseball> receiveUserBaseballs() {
        try {
            return BaseballGenerator.generate(Input.receiveFromUser());
        } catch (IllegalArgumentException e) {
            Output.printInvalidInputException();
            return receiveUserBaseballs();
        }
    }

    private AnswerMatcher readyAnswer() {
        AnswerMatcher answerMatcher = new AnswerMatcher(computer.createAnswer());
        return answerMatcher;
    }

    private boolean isNotAnswer() {
        return !answerMatcher.isCorrect(userBaseballs);
    }


}

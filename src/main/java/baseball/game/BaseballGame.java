package baseball.game;

import baseball.answer.AnswerMatcher;
import baseball.baseball.Baseball;
import baseball.baseball.BaseballGenerator;
import baseball.computer.Computer;
import baseball.ui.Input;
import baseball.ui.Output;

import java.util.List;

/**
 * @author eedys1234
 * @version 1.0
 * @since 1.0
 * Baseball 게임을 시작하여 사용자가 입력한 baseball에 대해서 결과를 출력한다. (스트라이크, 볼, 낫싱)
 * 입력된 3개의 숫자가 모두 스트라이크일경우 게임을 종료한다.
 */
public class BaseballGame {

    private Computer computer;
    private AnswerMatcher answerMatcher;
    private List<Baseball> userBaseballs;

    public BaseballGame() {
        computer = new Computer();
    }

    /**
     * Baseball 게임 시작
     */
    public void play() {
        Output.printBaseballGameStart();
        answerMatcher = readyAnswer();
        do {
            playInning();
        }
        while(isNotAnswer());
        Output.printBaseballGameEnd();
    }

    /**
     * Baseball 1이닝 실행
     */
    private void playInning() {
        userBaseballs = receiveUserBaseballs();
        Output.printBaseballGameResult(answerMatcher.getResult(userBaseballs));
    }

    /**
     * 사용자입력으로부터 Baseballs을 변환하는 함수
     * @return Baseballs
     */
    private List<Baseball> receiveUserBaseballs() {
        try {
            return BaseballGenerator.generate(Input.receiveNumberFromUser());
        }
        catch (IllegalArgumentException e) {
            Output.printInvalidInputException(e.getMessage());
            return receiveUserBaseballs();
        }
    }

    /**
     * Computer Baseballs을 matcher에 ready하는 함수
     * @return AnswerMatcher
     */
    private AnswerMatcher readyAnswer() {
        AnswerMatcher answerMatcher = new AnswerMatcher(computer.createAnswer());
        return answerMatcher;
    }

    /**
     * 정답이 아닌지 판별하는 함수
     * @return
     */
    private boolean isNotAnswer() {
        return !answerMatcher.isCorrect(userBaseballs);
    }
}

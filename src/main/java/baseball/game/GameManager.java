package baseball.game;

import baseball.ui.Input;
import baseball.ui.Output;

/**
 * @author eedys1234
 * @version 1.0
 * @since 1.0
 * 게임 재시작, 종료를 관리하는 클래스
 */
public class GameManager {

    /**
     * Baseball 게임을 재시작할지 종료할지 관리하는 함수
     */
    public void run() {

        do {
            BaseballGame baseballGame = new BaseballGame();
            baseballGame.play();
        } while(isResumeOpinion());
    }

    /**
     * 재시작, 종료 여부를 판별하는 함수
     * @return
     */
    private boolean isResumeOpinion() {

        try {
            Output.printGameResume();
            ResumeOpinion opinion = new ResumeOpinion(Input.receiveOpinionFromUser());
            return opinion.isResume();
        }
        catch (IllegalArgumentException e) {
            Output.printInvalidInputException(e.getMessage());
            return isResumeOpinion();
        }
    }

}

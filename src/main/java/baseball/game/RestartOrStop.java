package baseball.game;

import baseball.ui.Output;

/**
 * 게임을 재시작, 종료할지 관리하는 클래스
 */
public class RestartOrStop {

    private String opinion;

    public RestartOrStop(String opinion) {
        validateOpinion();
        this.opinion = opinion;
    }

    private boolean isGameRestart() {
        return opinion.equals(Output.GAME_RESTART);
    }

    private boolean isGameStop() {
        return opinion.equals(Output.GAME_STOP);
    }

    public boolean isGameRestartAndStop() {
        return isGameRestart() && !isGameStop();
    }

    private void validateOpinion() {
        if(!this.opinion.equals(Output.GAME_RESTART) && !this.opinion.equals(Output.GAME_STOP)) {
            throw new IllegalArgumentException("");
        }
    }
}

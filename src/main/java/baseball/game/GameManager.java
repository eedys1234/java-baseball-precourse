package baseball.game;

import baseball.ui.Input;

import java.util.NoSuchElementException;

public class GameManager {

    private BaseballGame baseballGame;

    public GameManager() {
        baseballGame = new BaseballGame();
    }

    public void run() {

        do {
            baseballGame.play();
        } while(isRestartAndStopOpinion());
    }

    private boolean isRestartAndStopOpinion() {

        try {
            RestartOrStop restartOrStop = new RestartOrStop(Input.receiveOpinionFromUser());
            return restartOrStop.isGameRestartAndStop();
        }
        catch (NoSuchElementException | IllegalArgumentException | IllegalStateException e) {
            return isRestartAndStopOpinion();
        }
    }

}

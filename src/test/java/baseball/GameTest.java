package baseball;

import baseball.game.BaseballGame;
import nextstep.test.NSTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameTest extends NSTest {

    @BeforeEach
    void beforeEach() {
        super.setUp();
    }

    @DisplayName("게임시작 테스트")
    @Test
    public void 게임시작_테스트() {
        BaseballGame game = new BaseballGame();
        game.play();
        verify("게임이 시작되었습니다.");
    }

    @AfterEach
    void tearDown() {
        outputStandard();
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }

}

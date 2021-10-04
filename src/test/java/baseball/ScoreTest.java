package baseball;

import baseball.baseball.Baseball;
import baseball.score.BallScore;
import baseball.score.Score;
import baseball.score.StrikeScore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScoreTest {

    @DisplayName("Not 스트라이크 테스트")
    @Test
    public void Not_스트라이크_테스트() {
        Score score = new StrikeScore();
        Baseball answerBaseball = new Baseball(1, 0);
        Baseball userBaseball = new Baseball(2, 0);

        int strikeCount = score.isCorrect(answerBaseball, userBaseball);
        assertThat(strikeCount).isEqualTo(0);
    }

    @DisplayName("스트라이크 테스트")
    @Test
    public void 스트라이크_테스트() {
        Score score = new StrikeScore();
        Baseball answerBaseball = new Baseball(1, 0);
        Baseball userBaseball = new Baseball(1, 0);

        int strikeCount = score.isCorrect(answerBaseball, userBaseball);
        assertThat(strikeCount).isEqualTo(1);
    }

    @DisplayName("Not 볼 테스트")
    @Test
    public void Not_볼_테스트() {
        Score score = new BallScore();
        Baseball answerBaseball = new Baseball(1, 0);
        Baseball userBaseball = new Baseball(2, 0);

        int strikeCount = score.isCorrect(answerBaseball, userBaseball);
        assertThat(strikeCount).isEqualTo(0);
    }
    
    @DisplayName("볼 테스트")
    @Test
    public void 볼_테스트() {
        Score score = new BallScore();
        Baseball answerBaseball = new Baseball(1, 0);
        Baseball userBaseball = new Baseball(1, 1);

        int strikeCount = score.isCorrect(answerBaseball, userBaseball);
        assertThat(strikeCount).isEqualTo(1);
    }
}

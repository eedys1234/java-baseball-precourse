package baseball;

import baseball.answer.Answer;
import baseball.answer.AnswerMatcher;
import baseball.baseball.Baseball;
import baseball.baseball.BaseballGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AnswerMatcherTest {

    @DisplayName("볼 개수 구하기 테스트(값은 동일하지만 위치가 다른경우 3개)")
    @Test
    public void 볼_개수_구하기_테스트() {

        BaseballGenerator baseballGenerator = new BaseballGenerator();
        Answer answer = new Answer(baseballGenerator.generate("456"));
        AnswerMatcher answerMatcher = new AnswerMatcher(answer);

        List<Baseball> userBaseballs = baseballGenerator.generate("564");
        int ballCount = answerMatcher.countBall(userBaseballs);

        assertThat(ballCount).isEqualTo(3);
    }

    @DisplayName("스트라이크 개수 구하기 테스트(2개)")
    @Test
    public void 스트라이크_개수_구하기_테스트() {

        BaseballGenerator baseballGenerator = new BaseballGenerator();
        Answer answer = new Answer(baseballGenerator.generate("456"));
        AnswerMatcher answerMatcher = new AnswerMatcher(answer);

        List<Baseball> userBaseballs = baseballGenerator.generate("457");
        int strikeCount = answerMatcher.countStrike(userBaseballs);

        assertThat(strikeCount).isEqualTo(2);
    }

    @DisplayName("낫싱 테스트")
    @Test
    public void 낫싱_테스트() {

        BaseballGenerator baseballGenerator = new BaseballGenerator();
        Answer answer = new Answer(baseballGenerator.generate("456"));
        AnswerMatcher answerMatcher = new AnswerMatcher(answer);

        List<Baseball> userBaseballs = baseballGenerator.generate("798");
        int strikeCount = answerMatcher.countStrike(userBaseballs);
        int ballCount = answerMatcher.countStrike(userBaseballs);

        assertThat(strikeCount + ballCount).isEqualTo(0);
    }

    @DisplayName("CompterBaseball과 UserBaseball이 모두 동일한지 테스트")
    @Test
    public void ComputerBaseball과_UserBaseball_모두_동일한지_테스트() {

        BaseballGenerator baseballGenerator = new BaseballGenerator();
        Answer answer = new Answer(baseballGenerator.generate("456"));
        AnswerMatcher answerMatcher = new AnswerMatcher(answer);

        List<Baseball> userBaseballs = baseballGenerator.generate("456");
        boolean isCorrect = answerMatcher.isCorrect(userBaseballs);

        assertThat(isCorrect).isTrue();
    }




}

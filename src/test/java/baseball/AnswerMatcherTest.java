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

package baseball.answer;

import baseball.baseball.Baseball;
import baseball.score.BallScore;
import baseball.score.Score;
import baseball.score.StrikeScore;
import baseball.ui.Output;

import java.util.List;


/**
 * 스트라이크, 볼, 낫싱을 판별하는 클래스
 */
public class AnswerMatcher {

    private Answer answer;

    public AnswerMatcher(Answer answer) {
        this.answer = answer;
    }

    public boolean isCorrect(List<Baseball> userBaseBalls) {
        isValidateSize(userBaseBalls);
        return countStrike(userBaseBalls) == userBaseBalls.size();
    }
    
    private int count(List<Baseball> userBaseBalls, Score score) {
        isValidateSize(userBaseBalls);
        int count = 0;

        for(int i=0;i<userBaseBalls.size();i++)
        {
            count += matching(userBaseBalls.get(i), score);
        }

        return count;
    }

    public int countStrike(List<Baseball> userBaseballs) {
        Score score = new StrikeScore();
        return count(userBaseballs, score);
    }

    public int countBall(List<Baseball> userBaseballs) {
        Score score = new BallScore();
        return count(userBaseballs, score);
    }

    private int matching(Baseball baseball, Score score) {
        List<Baseball> answerBaseballs = answer.getBaseballs();
        int matchingCount = 0;

        for(int i=0; i<answerBaseballs.size(); i++)
        {
            matchingCount += score.isCorrect(answerBaseballs.get(i), baseball);
        }

        return matchingCount;
    }

    private void isValidateSize(List<Baseball> userBaseballs) {
        if(userBaseballs.size() != answer.getBaseballs().size()) {
            throw new IllegalArgumentException(Output.INVALID_BASEBALLS_SIZE_MESSAGE);
        }
    }


}

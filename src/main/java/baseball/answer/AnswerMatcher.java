package baseball.answer;

import baseball.baseball.Baseball;
import baseball.score.BallScore;
import baseball.score.Score;
import baseball.score.StrikeScore;
import baseball.ui.Output;

import java.util.List;

/**
 * @author eedys1234
 * @version 1.0
 * @since 1.0
 * 스트라이크, 볼, 낫싱을 판별하는 클래스
 */
public class AnswerMatcher {

    private Answer answer;

    public AnswerMatcher(Answer answer) {
        this.answer = answer;
    }

    /**
     * 결과를 도출하는 함수
     * @param userBaseballs 사용자의 Baseballs
     * @return 결과
     */
    public String getResult(List<Baseball> userBaseballs) {
        StringBuilder result = new StringBuilder();
        result.append(createStrikeString(countStrike(userBaseballs)));
        result.append(createBallString(countBall(userBaseballs)));

        if(result.toString().length() == 0) {
            result.append(Output.NOTHING);
        }

        return result.toString();
    }

    /**
     * 스트라이크 문자열 생성 함수 
     * @param strikeCount 스트라이크 개수
     * @return 스트라이크 문자열
     */
    private String createStrikeString(int strikeCount) {
        if(strikeCount > 0) return String.format("%d%s ", strikeCount, Output.STRIKE);
        return "";
    }

    /**
     * 볼 문자열 생성 함수 
     * @param ballCount 볼 개수 
     * @return 볼 문자열
     */
    private String createBallString(int ballCount) {
        if(ballCount > 0) return String.format("%d%s", ballCount, Output.BALL);
        return "";
    }

    /**
     * 사용자의 Baseballs이 모두 일치하는지 확인하는 함수(스트라이크 3개)
     * @param userBaseBalls 사용자의 Baseballs
     * @return 일치여부
     */
    public boolean isCorrect(List<Baseball> userBaseBalls) {
        return countStrike(userBaseBalls) == userBaseBalls.size();
    }

    /**
     * 스트라이크 or 볼 개수를 세는 함수
     * @param userBaseBalls 사용자의 Baseballs
     * @param score 스트라이크, 볼 판별 전략
     * @return 스트라이크 or 볼 개수
     */
    private int count(List<Baseball> userBaseBalls, Score score) {
        validateSize(userBaseBalls);
        int count = 0;

        for(int i=0;i<userBaseBalls.size();i++)
        {
            count += matching(userBaseBalls.get(i), score);
        }

        return count;
    }

    /**
     * 스트라이크 개수를 세는 함수
     * @param userBaseballs 사용자의 Baseballs
     * @return 스트라이크 개수
     */
    private int countStrike(List<Baseball> userBaseballs) {
        Score score = new StrikeScore();
        return count(userBaseballs, score);
    }

    /**
     * 볼 개수 세는 함수
     * @param userBaseballs 사용자의 Baseballs
     * @return 볼 개수
     */
    private int countBall(List<Baseball> userBaseballs) {
        Score score = new BallScore();
        return count(userBaseballs, score);
    }

    /**
     * Baseball이 스트라이크인지, 볼인지 매칭하는 함수
     * @param baseball Baseball
     * @param score 스트라이크, 볼 판별 전략
     * @return
     */
    private int matching(Baseball baseball, Score score) {
        List<Baseball> answerBaseballs = answer.getBaseballs();
        int matchingCount = 0;

        for(int i=0; i<answerBaseballs.size(); i++)
        {
            matchingCount += score.isCorrect(answerBaseballs.get(i), baseball);
        }

        return matchingCount;
    }

    /**
     * 사용자로부터 입력받은 문자열의 길이를 validate 하는 함수
     * @param userBaseballs 사용자 Baseballs
     * @throws IllegalArgumentException 사용자로부터 입력받은 문자열의 길이가 일치하지 않을경우
     */
    private void validateSize(List<Baseball> userBaseballs) {
        if(userBaseballs.size() != answer.getBaseballs().size()) {
            throw new IllegalArgumentException(Output.INVALID_BASEBALLS_SIZE_MESSAGE);
        }
    }
}

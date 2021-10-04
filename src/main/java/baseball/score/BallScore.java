package baseball.score;

import baseball.baseball.Baseball;

/**
 * @author eedys1234
 * @version 1.0
 * @since 1.0
 * Ball을 판별하는 클래스
 */
public class BallScore implements Score {

    /**
     * 볼인지 판별하는 함수
     * @param answerBaseball
     * @param userBaseball
     * @return
     */
    @Override
    public int isCorrect(Baseball answerBaseball, Baseball userBaseball) {
        boolean isCorrect = answerBaseball.equalsNumber(userBaseball) && !answerBaseball.equalsIndex(userBaseball);
        return isCorrect ? 1 : 0;
    }
}

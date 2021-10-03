package baseball.score;

import baseball.baseball.Baseball;

public class BallScore implements Score {

    @Override
    public int isCorrect(Baseball answerBaseball, Baseball userBaseball) {
        boolean isCorrect = answerBaseball.equalsNumber(userBaseball) && !answerBaseball.equalsIndex(userBaseball);
        return isCorrect ? 1 : 0;
    }
}

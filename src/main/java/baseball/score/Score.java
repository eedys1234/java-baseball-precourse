package baseball.score;

import baseball.baseball.Baseball;

/**
 * 스트라이크, 볼 여부를 판별하는 인터페이스
 */
public interface Score {

    int isCorrect(Baseball answerBaseball, Baseball userBaseball);

    default boolean compareNumber(Baseball answerBaseball, Baseball userBaseball) {
        return answerBaseball.equalsNumber(userBaseball);
    }

    default boolean compareIndex(Baseball answerBaseball, Baseball userBaseball) {
        return answerBaseball.equalsIndex(userBaseball);
    }
}

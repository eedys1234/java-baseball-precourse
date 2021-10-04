package baseball.score;

import baseball.baseball.Baseball;

/**
 * @author eedys1234
 * @version 1.0
 * @since 1.0
 * 스트라이크, 볼 등 여부를 판별하기 위한 상위 인터페이스
 */
public interface Score {
    int isCorrect(Baseball answerBaseball, Baseball userBaseball);
}

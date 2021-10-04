package baseball.answer;

import baseball.baseball.Baseball;

import java.util.List;

/**
 * @author eedys1234
 * @version 1.0
 * @since 1.0
 * 컴퓨터가 생성한 랜덤 숫자 wrapper 클래스
 */
public class Answer {

    private List<Baseball> baseballs;

    public Answer(List<Baseball> baseballs) {
        this.baseballs = baseballs;
    }

    public List<Baseball> getBaseballs() {
        return this.baseballs;
    }
}

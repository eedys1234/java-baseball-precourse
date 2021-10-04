package baseball.baseball;

import java.util.Objects;

/**
 * @author eedys1234
 * @version 1.0
 * @since 1.0
 * Baseball 값을 담는 클래스
 */
public final class Baseball {

    private int baseballNumber;
    private int index;

    public Baseball(int baseballNumber, int index) {
        this.baseballNumber = baseballNumber;
        this.index = index;
    }

    /**
     * 숫자가 같은지 판별 함수
     * @param otherBaseball 비교대상 Baseball
     * @return
     */
    public boolean equalsNumber(Baseball otherBaseball) {
        return this.baseballNumber == otherBaseball.getBaseballNumber();
    }

    /**
     * 순서가 같은지 판별 함수
     * @param otherBaseball 비교대상 Baseball
     * @return
     */
    public boolean equalsIndex(Baseball otherBaseball) {
        return this.index == otherBaseball.getIndex();
    }

    /**
     * 숫자를 가져오는 함수
     * @return
     */
    public int getBaseballNumber() {
        return this.baseballNumber;
    }

    /**
     * 순서를 가져오는 함수
     * @return
     */
    public int getIndex() {
        return this.index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Baseball baseball = (Baseball) o;
        return baseballNumber == baseball.baseballNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseballNumber);
    }
}

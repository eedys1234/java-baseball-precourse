package baseball.baseball;

import java.util.Objects;

/**
 * Baseball 값을 담는 클래스
 */
public final class Baseball {

    private static final int MAX_NUMBER = 9;
    private static final int MIN_NUMBER = 1;

    private int baseballNumber;
    private int index;

    public Baseball(int baseballNumber, int index) {
        validate(baseballNumber);
        this.baseballNumber = baseballNumber;
        this.index = index;
    }

    public boolean equalsNumber(Baseball otherBaseball) {
        return this.baseballNumber == otherBaseball.getBaseballNumber();
    }

    public boolean equalsIndex(Baseball otherBaseball) {
        return this.index == otherBaseball.getIndex();
    }

    public int getBaseballNumber() {
        return this.baseballNumber;
    }

    public int getIndex() {
        return this.index;
    }

    public void validate(int baseballNumber) {
        if(baseballNumber < MIN_NUMBER || baseballNumber > MAX_NUMBER) {
            throw new IndexOutOfBoundsException("유효범위를 벗어났습니다.");
        }
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

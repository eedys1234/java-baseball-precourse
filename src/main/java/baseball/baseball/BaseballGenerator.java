package baseball.baseball;

import baseball.ui.Output;
import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Baseball 생성하는 클래스
 */
public class BaseballGenerator {

    private static final char ZERO_CHAR = '0';
    private static final int BASEBALLS_SIZE = 3;
    private static final int START_NUMBER = 1;
    private static final int END_NUMBER = 9;

    /**
     * String을 받아 baseball을 발생시키는 함수
     */
    public static List<Baseball> generate(String baseballNumbers) {
        List<Baseball> baseballs = new ArrayList<>();

        int length = baseballNumbers.length();
        if(length != BASEBALLS_SIZE) throw new IllegalArgumentException(Output.INVALID_BASEBALLS_SIZE_MESSAGE);
        for (int i = 0; i < length; i++) {
            baseballs.add(createBaseball(baseballNumbers.charAt(i) - ZERO_CHAR, i));
        }

        return baseballs;
    }

    /**
     * baseball을 랜덤하게 발생시키는 함수
     */
    public static List<Baseball> generateRandom() {

        Set<Baseball> baseballs = new HashSet<>();
        int count = baseballs.size();
        while(count < BASEBALLS_SIZE) {
            baseballs.add(createBaseball(getBaseballNumber(), count));
            count = baseballs.size();
        }
        return new ArrayList<>(baseballs);
    }

    /**
     * 랜덤하게 숫자를 발생시키는 함수
     * @return
     */
    private static int getBaseballNumber() {
        return Randoms.pickNumberInRange(START_NUMBER, END_NUMBER);
    }

    /**
     * Baseball 객체 생성 함수
     * @param number 값
     * @param index 순서
     * @return
     */
    private static Baseball createBaseball(int number, int index) {
        return new Baseball(number, index);
    }
}

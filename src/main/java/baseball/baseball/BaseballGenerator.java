package baseball.baseball;

import baseball.ui.Output;
import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author eedys1234
 * @version 1.0
 * @since 1.0
 * Baseball 생성하는 클래스
 */
public class BaseballGenerator {

    private static final char ZERO_CHAR = '0';
    private static final char ONE_CHAR = '1';
    private static final char NINE_CHAR = '9';
    private static final int BASEBALLS_SIZE = 3;
    private static final int START_NUMBER = 1;
    private static final int END_NUMBER = 9;

    /**
     * 사용자 입력을 받아 baseball을 생성하는 함수
     * @param baseballNumbers 사용자 입력 문자열
     * @return Baseballs
     */
    public static List<Baseball> generate(String baseballNumbers) {
        List<Baseball> baseballs = new ArrayList<>();

        int length = baseballNumbers.length();
        if(length != BASEBALLS_SIZE) throw new IllegalArgumentException(Output.INVALID_BASEBALLS_SIZE_MESSAGE);
        for (int i = 0; i < length; i++) {
            validateBaseballNumber(baseballNumbers.charAt(i));
            baseballs.add(createBaseball(baseballNumbers.charAt(i) - ZERO_CHAR, i));
        }

        return baseballs;
    }

    /**
     * 랜덤하게 baseball을 생성하는 함수
     * @return Baseballs
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
     * @return 랜덤 숫자
     */
    private static int getBaseballNumber() {
        return Randoms.pickNumberInRange(START_NUMBER, END_NUMBER);
    }

    /**
     * Baseball 객체 생성 함수
     * @param number 값
     * @param index 순서
     * @return Baseball
     */
    private static Baseball createBaseball(int number, int index) {
        return new Baseball(number, index);
    }

    /**
     * 입력되는 값 유효성 검사
     * @param number 유효성 검사 하고자하는 CHAR
     */
    private static void validateBaseballNumber(char number) {
        if(number < ONE_CHAR || number > NINE_CHAR) {
            throw new IllegalArgumentException(Output.INVALID_BASEBALL_MESSAGE);
        }
    }
}

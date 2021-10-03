package baseball.baseball;

import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.List;

/**
 * Baseball 생성하는 클래스
 */
public class BaseballGenerator {

    private static final char ZERO_CHAR = '0';
    private static final int BASEBALLS_SIZE = 3;
    private static final int START_NUMBER = 1;
    private static final int END_NUMBER = 9;
    private boolean[] addBaseballs;

    /**
     *
     */
    public BaseballGenerator() {
    }

    public List<Baseball> generate(String baseballNumbers) {
        List<Baseball> baseballs = new ArrayList<>();

        for (int i = 0; i < baseballNumbers.length(); i++) {
            baseballs.add(createBaseball(baseballNumbers.charAt(i) - ZERO_CHAR, i));
        }

        return baseballs;
    }

    public List<Baseball> generateRandom() {
        addBaseballs = new boolean[END_NUMBER - START_NUMBER + 2];
        StringBuilder baseballString = new StringBuilder();
        int count = baseballString.toString().length();

        while(count < BASEBALLS_SIZE) {
            baseballString.append(getBaseballNumber());
            count = baseballString.toString().length();
        }
        cleanUp();
        return createBaseballs(baseballString.toString());
    }

    /**
     * 전달된 수만큼의 자리수를 랜덤한 숫자를 생성시키는 함수(중복 X)
     */
    private List<Baseball> createBaseballs(String baseballNumber) {
        List<Baseball> baseballNumbers = new ArrayList<>();

        for(int i=0;i<baseballNumber.length();i++)
        {
            baseballNumbers.add(createBaseball(baseballNumber.charAt(i) - ZERO_CHAR, i));
        }

        return baseballNumbers;
    }

    private Baseball createBaseball(int number, int index) {
        return new Baseball(number, index);
    }


    /**
     * 랜덤 숫자 추가함수
     */
    private String getBaseballNumber() {
        int number = Randoms.pickNumberInRange(START_NUMBER, END_NUMBER);

        if(!overlapBaseBallNumber(number)) {
            setBaseBallNumbers(number);
            return String.valueOf(number);
        }

        //중복될경우 "" 빈 문자열 리턴
        return "";
    }

    /**
     * 중복여부 체크
     * @param number 중복을 체크할 랜덤 숫자
     * @return
     */
    private boolean overlapBaseBallNumber(int number) {
        return addBaseballs[number];
    }

    /**
     * 중복 체크를 위한 상태 저장함수
     * @param number 랜덤 숫자
     */
    private void setBaseBallNumbers(int number) {
        addBaseballs[number] = true;
    }

    private void cleanUp() {
        int length = addBaseballs.length;

        for(int i = 0; i< length; i++) {
            addBaseballs[i] = false;
        }
    }
}

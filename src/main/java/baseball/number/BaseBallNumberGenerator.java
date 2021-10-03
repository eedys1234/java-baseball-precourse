package baseball.number;

import nextstep.utils.Randoms;

public class BaseBallNumberGenerator implements NumberGenerator {

    private int startNumber;
    private int endNumber;
    private boolean[] addBaseBallNumbers;

    /**
     *
     * @param startNumber 랜덤 시작숫자(포함)
     * @param endNumber 랜덤 마지막숫자(포함)
     */
    public BaseBallNumberGenerator(int startNumber, int endNumber) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
        if(startNumber > endNumber) throw new IllegalArgumentException("startNumber가 endNumber보다 클 수 없습니다.");
        if(startNumber < 0 || endNumber < 0) throw new IllegalArgumentException("음수가 될 수 없습니다.");
        addBaseBallNumbers = new boolean[endNumber - startNumber + 2];
    }

    public String generate(int digit) {
        return generateBaseBallNumbers(digit);
    }

    /**
     * 전달된 수만큼의 자리수를 랜덤한 숫자를 생성시키는 함수(중복 X)
     * @param digit 생성시킬 자리수
     */
    private String generateBaseBallNumbers(int digit) {
        StringBuilder baseballNumbers = new StringBuilder();
        int count = baseballNumbers.toString().length();

        while(count < digit) {
            baseballNumbers.append(getBaseBallNumber());
            count = baseballNumbers.toString().length();
        }
        cleanUp();
        return baseballNumbers.toString();
    }

    /**
     * 랜덤 숫자 추가함수
     */
    private String getBaseBallNumber() {
        int number = Randoms.pickNumberInRange(startNumber, endNumber);

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
        return addBaseBallNumbers[number];
    }

    /**
     * 중복 체크를 위한 상태 저장함수
     * @param number 랜덤 숫자
     */
    private void setBaseBallNumbers(int number) {
        addBaseBallNumbers[number] = true;
    }

    private void cleanUp() {
        int length = addBaseBallNumbers.length;

        for(int i = 0; i< length; i++) {
            addBaseBallNumbers[i] = false;
        }
    }
}

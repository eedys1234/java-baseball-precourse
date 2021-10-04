package baseball.ui;

import nextstep.utils.Console;

/**
 * @author eedys1234
 * @version 1.0
 * @since 1.0
 * 사용자로부터 데이터를 전달받는 클래스
 */
public class Input {

    /**
     * 사용자로부터 숫자에 대한 정보를 받는 함수
     * @return
     */
    public static String receiveNumberFromUser() {
        return Console.readLine();
    }

    /**
     * 사용자로부터 재시작여부에 대한 정보를 받는 함수
     * @return
     */
    public static String receiveOpinionFromUser() {
        return Console.readLine();
    }
}

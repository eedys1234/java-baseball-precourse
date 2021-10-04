package baseball.ui;

/**
 * @author eedys1234
 * @version 1.0
 * @since 1.0
 * 데이터를 Output 하는 클래스
 */
public class Output {

    private static String BASEBALL_GAME_START_MESSAGE = "Baseball 게임이 시작되었습니다.";
    private static String BASEBALL_GAME_END_MESSAGE = "게임 끝";
    private static String GAME_RESTART_STOP_MESSAGE = "게임을 재시작하고 싶으시면 '1', 게임을 종료하고 싶으시면 '2'를 입력해주세요.";
    private static String ERROR_MESSAGE = "[ERROR] : ";
    public static String INVALID_BASEBALLS_SIZE_MESSAGE = "Baseball 길이가 적절하지 않습니다.";
    public static String INVALID_OPINION_MESSAGE = "1 또는 2를 입력해주세요.";
    public static String INVALID_BASEBALL_MESSAGE = "1~9까지 입력해주세요.";

    public static String GAME_RESTART = "1";
    public static String GAME_STOP = "2";
    public static String STRIKE = "스트라이크";
    public static String BALL = "볼";
    public static String NOTHING = "낫싱";

    /**
     * 게임 재시작,종료에 대한 메시지 출력
     */
    public static void printGameResume() {
        System.out.println(GAME_RESTART_STOP_MESSAGE);
    }

    /**
     * 게임에 대한 결과 출력
     */
    public static void printBaseballGameResult(String result) {
        System.out.println(result);
    }

    /**
     * 게임이 시작되었다는 메시지 출력
     */
    public static void printBaseballGameStart() {
        System.out.println(BASEBALL_GAME_START_MESSAGE);
    }

    /**
     * 게임이 종료되었다는 메시지 출력
     */
    public static void printBaseballGameEnd() {
        System.out.println(BASEBALL_GAME_END_MESSAGE);
    }

    /**
     * 게임 진행중에 발생한 에러 출력
     */
    public static void printInvalidInputException(String errorMessage) {
        System.out.println(ERROR_MESSAGE + errorMessage);
    }

}

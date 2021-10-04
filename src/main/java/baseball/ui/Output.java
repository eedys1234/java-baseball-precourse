package baseball.ui;

public class Output {

    private static String BASEBALL_GAME_START_MESSAGE = "Baseball 게임이 시작되었습니다.";
    private static String BASEBALL_GAME_END_MESSAGE = "게임 끝";
    private static String INVALID_INPUT_ERROR_MESSAGE = "[ERROR]";
    private static String GAME_RESTART_STOP_MESSAGE = "게임을 재시작하고 싶으시면 1, 게임을 종료하고 싶으시면 2를 입력해주세요.";
    public static String INVALID_BASEBALLS_SIZE_MESSAGE = "Baseball 길이가 적절하지 않습니다.";

    public static String GAME_RESTART = "1";
    public static String GAME_STOP = "2";
    public static String STRIKE = "스트라이크";
    public static String BALL = "볼";
    public static String NOTHING = "낫싱";

    public static void printGameReStartAndStop() {
        System.out.println(GAME_RESTART_STOP_MESSAGE);
    }

    public static void printBaseballGameResult(String result) {
        System.out.println(result);
    }

    public static void printBaseballGameStart() {
        System.out.println(BASEBALL_GAME_START_MESSAGE);
    }

    public static void printBaseballGameEnd() {
        System.out.println(BASEBALL_GAME_END_MESSAGE);
    }

    public static void printInvalidInputException() {
        System.out.println(INVALID_INPUT_ERROR_MESSAGE);
    }

}

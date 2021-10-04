package baseball.ui;

public class Output {

    private static String BASEBALL_GAME_START_MESSAGE = "Baseball 게임이 시작되었습니다.";
    private static String BASEBALL_GAME_END_MESSAGE = "게임 끝";
    private static String INVALID_INPUT_ERROR_MESSAGE = "[ERROR]";
    public static String INVALID_BASEBALLS_SIZE_MESSAGE = "Baseball 길이가 적절하지 않습니다.";

    public static String STRIKE = "스트라이크";
    public static String BALL = "볼";
    public static String NOTHING = "낫싱";


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

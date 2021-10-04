package baseball.ui;

public class Output {

    private static String GAME_START_MESSAGE = "게임이 시작되었습니다.";
    public static String INVALID_BASEBALLS_SIZE_MESSAGE = "길이가 일치하지 않습니다.";

    public static String STRIKE = "스트라이크";
    public static String BALL = "볼";
    public static String NOTHING = "낫싱";


    public static void printBaseballGameResult(String result) {
        System.out.println(result);
    }

    public static void printBaseballGameStart() {
        System.out.println(GAME_START_MESSAGE);
    }

}

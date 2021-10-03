package baseball.game;

import baseball.player.GamePlayer;
import baseball.player.Player;

/**
 * Baseball 게임을 관리하는 클래스
 */
public class Game {

    private final Player userPlayer;
    private final Player computerPlayer;

    public Game() {
        this.userPlayer = new GamePlayer("user");
        this.computerPlayer = new GamePlayer("computer");
    }

    public Game(Player userPlayer, Player computerPlayer) {
        this.userPlayer = userPlayer;
        this.computerPlayer = computerPlayer;
    }

    public void play() {
        System.out.println("게임이 시작되었습니다.");

    }

    public void stop() {

    }

}

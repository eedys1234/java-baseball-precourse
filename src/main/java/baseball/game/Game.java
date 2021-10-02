package baseball.game;

import baseball.player.GamePlayer;
import baseball.player.Player;
import nextstep.utils.Console;

public class Game {

    private final Player user;
    private final Player computer;

    public Game() {
        user = new GamePlayer("user");
        computer = new GamePlayer("computer");
    }

    public Game(Player firstPlayer, Player secondPlayer) {
        this.user = firstPlayer;
        this.computer = secondPlayer;
    }

    private boolean ready() {
        user.start();
        computer.start();
        return user.isRunning() && computer.isRunning();
    }

    public void run() {
        if(!ready()) {
            throw new IllegalArgumentException("게임 준비가 되지 않았습니다.");
        }
        System.out.println("게임이 시작되었습니다.");
    }

    public void stop() {

    }

    public void inningsDisplay() {

    }
}

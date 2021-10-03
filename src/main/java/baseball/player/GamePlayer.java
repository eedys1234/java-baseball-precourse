package baseball.player;

import baseball.baseball.Baseball;

import java.util.List;

/**
 * Baseball Game에 참가하는 사용자
 */
public class GamePlayer implements Player {

    private final String playerName;
    private List<Baseball> baseballs;

    public GamePlayer(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public void received(List<Baseball> baseballs) {
        this.baseballs = baseballs;
    }

    @Override
    public List<Baseball> openBaseballs() {
        return this.baseballs;
    }

}

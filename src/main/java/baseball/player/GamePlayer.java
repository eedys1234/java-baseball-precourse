package baseball.player;

/**
 * BaseBall Game에 참가하는 사용자
 */
public class GamePlayer implements Player {

    private final String playerName;
    private boolean isRunning = false;

    public GamePlayer(String playerName) {
        this.playerName = playerName;
    }
    
    @Override
    public void start() {
        if(isRunning) throw new IllegalStateException("이미 게임을 시작하였습니다.");
        isRunning = true;
    }

    @Override
    public void stop() {
        if(!isRunning) throw new IllegalStateException("이미 게임이 종료되었습니다.");
        isRunning = false;
    }

    public boolean isRunning() {
        return isRunning;
    }
}

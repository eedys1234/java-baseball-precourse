package baseball.player;

public class ComputerPlayer implements Player {

    private final String playerName;
    private boolean isRunning;

    public ComputerPlayer(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public void start() {
        if(isRunning) throw new IllegalStateException("이미 게임을 시작하였습니다.");
        isRunning = true;
    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }
}

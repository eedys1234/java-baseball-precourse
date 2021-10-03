package baseball.player;

import nextstep.utils.Randoms;

public class ComputerPlayer implements Player {

    private final String playerName;
    private boolean isRunning;

    public ComputerPlayer(String playerName) {
        this.playerName = playerName;
    }

    /**
     * 플레이어 시작함수
     */
    @Override
    public void start() {
        if(isRunning) throw new IllegalStateException("이미 게임을 시작하였습니다.");
        isRunning = true;

    }

    /**
     * 플레이어 종료함수
     */
    @Override
    public void stop() {
        if(!isRunning) throw new IllegalStateException("이미 게임이 종료되었습니다.");
        clean();
    }

    /**
     * 플레이어가 게임에 참여여부를 리턴하는 함수
     * @return 플레이어가 게임 참여여부
     */
    @Override
    public boolean isRunning() {
        return isRunning;
    }

    /**
     * 상태값 초기화 함수
     */
    private void clean() {
        isRunning = false;
    }
}

package baseball.game;

import baseball.ui.Output;

/**
 * @author eedys1234
 * @version 1.0
 * @since 1.0
 * 재시작, 종료 여부를 판별하는 클래스
 */
public class ResumeOpinion {

    private String opinion;

    public ResumeOpinion(String opinion) {
        validateOpinion(opinion);
        this.opinion = opinion;
    }

    /**
     * 재시작 여부를 판별하는 함수
     * @return
     */
    private boolean isRestart() {
        return this.opinion.equals(Output.GAME_RESTART);
    }

    /**
     * 종료 여부를 판별하는 함수
     * @return
     */
    private boolean isStop() {
        return this.opinion.equals(Output.GAME_STOP);
    }

    /**
     * 입력되지 않은지 판별하는 함수
     * @return
     */
    private boolean isEmpty() {
        return this.opinion.isEmpty();
    }

    /**
     * 재시작, 종료 여부를 판별하는 함수
     * @return
     */
    public boolean isResume() {
        return !isEmpty() && isRestart() && !isStop();
    }

    /**
     * 1(재시작), 2(종료) 이외에 값이 들어오지 유효성 검사하는 함수
     * @param opinion 1, 2
     */
    private void validateOpinion(String opinion) {
        if(!opinion.equals(Output.GAME_RESTART) && !opinion.equals(Output.GAME_STOP)) {
            throw new IllegalArgumentException(Output.INVALID_OPINION_MESSAGE);
        }
    }
}

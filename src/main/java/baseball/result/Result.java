package baseball.result;

import baseball.ui.Output;

public class Result {

    public String getResult(int strikeCount, int ballCount) {
        StringBuilder result = new StringBuilder();

        result.append(createStrikeString(strikeCount));
        result.append(createBallString(ballCount));

        if(result.toString().length() == 0) {
            result.append(Output.NOTHING);
        }

        return result.toString();
    }

    private String createStrikeString(int strikeCount) {
        if(strikeCount > 0) return String.format("%d%s", strikeCount, Output.STRIKE);
        return "";
    }

    private String createBallString(int ballCount) {
        if(ballCount > 0) return String.format("%d%s", ballCount, Output.BALL);
        return "";
    }

}

package baseball.player;

import baseball.baseball.Baseball;

import java.util.List;

public interface Player {

    void received(List<Baseball> baseballNumbers);
    List<Baseball> openBaseballs();
}

package baseball;

import baseball.baseball.Baseball;
import baseball.baseball.BaseballGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballGeneratorTest {

    private int startNumber = 1;
    private int endNumber = 9;

    @DisplayName("생성된_숫자의_길이가_3자리수")
    @Test
    public void 생성된_숫자의_길이가_3자리수() {
        int digit = 3;
        List<Baseball> baseballs = BaseballGenerator.generateRandom();
        assertThat(baseballs.size()).isEqualTo(digit);
    }

    @DisplayName("생성된_숫자가_지정된_범위내에_존재")
    @Test
    public void 생성된_숫자가_지정된_범위내에_존재() {
        List<Baseball> baseballs = BaseballGenerator.generateRandom();

        for(int i=0;i<baseballs.size();i++)
        {
            int number = baseballs.get(i).getBaseballNumber();
            assertThat(number).isGreaterThanOrEqualTo(startNumber);
            assertThat(number).isLessThanOrEqualTo(endNumber);
        }
    }

    @DisplayName("생성된_숫자가_중복되지_않는지")
    @Test
    public void 생성된_숫자가_중복되지_않는지() {
        List<Baseball> baseballs = BaseballGenerator.generateRandom();
        boolean[] checkNumbers = new boolean[endNumber - startNumber + 2];

        for(int i=0;i<baseballs.size();i++)
        {
            int number = baseballs.get(i).getBaseballNumber();
            checkNumbers[number] = !checkNumbers[number];
            assertThat(checkNumbers[number]).isTrue();
        }

    }

}

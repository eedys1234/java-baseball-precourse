package baseball;

import baseball.number.BaseBallNumberGenerator;
import baseball.number.NumberGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseBallNumberGeneratorTest {

    private NumberGenerator numberGenerator;
    private int startNumber = 1;
    private int endNumber = 9;

    @BeforeEach
    public void setup() {
        numberGenerator = new BaseBallNumberGenerator(startNumber, endNumber);
    }

    @DisplayName("생성된_숫자의_길이가_3자리수")
    @Test
    public void 생성된_숫자의_길이가_3자리수() {
        int digit = 3;
        String random = numberGenerator.generate(digit);
        assertThat(random.length()).isEqualTo(3);
    }

    @DisplayName("생성된_숫자가_지정된_범위내에_존재")
    @Test
    public void 생성된_숫자가_지정된_범위내에_존재() {
        int digit = 3;
        String random = numberGenerator.generate(digit);

        for(int i=0;i<random.length();i++)
        {
            int number = random.charAt(i) - 48;
            assertThat(number).isGreaterThanOrEqualTo(startNumber);
            assertThat(number).isLessThanOrEqualTo(endNumber);
        }
    }

    @DisplayName("생성된_숫자가_중복되지_않는지")
    @Test
    public void 생성된_숫자가_중복되지_않는지() {
        int digit = 3;
        String random = numberGenerator.generate(digit);
        boolean[] checkNumbers = new boolean[endNumber - startNumber + 2];

        for(int i=0;i<random.length();i++)
        {
            int number = random.charAt(i) - 48;
            checkNumbers[number] = !checkNumbers[number];
            assertThat(checkNumbers[number]).isTrue();
        }

    }

}

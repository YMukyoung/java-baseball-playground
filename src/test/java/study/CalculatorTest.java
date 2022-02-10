package study;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	Calculator cal = new Calculator();
    
    @Test
    void calculator() {
    	int testValue = cal.calculate("2 + 3 * 4 / 2");
    	
    	assertThat(testValue).isEqualTo(10);
    }
}

package study;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BallTest {
	Ball ball;

	@BeforeEach
	void setup() {
		ball = new Ball(1, 4);
	}

	@Test
	void 숫자_1에서9_체크() {
		assertThat(ball.checkNumber(1)).isTrue();
		assertThat(ball.checkNumber(0)).isFalse();
		assertThat(ball.checkNumber(10)).isFalse();
		assertThat(ball.checkNumber(9)).isTrue();
	}

	@Test
	void nothing() {
		assertThat(ball.play(new Ball(1, 5))).isEqualTo(BallStatus.getNothing());
	}

	@Test
	void ball() {
		assertThat(ball.play(new Ball(2, 4))).isEqualTo(BallStatus.getBall());
	}

	@Test
	void strike() {
		assertThat(ball.play(new Ball(1, 4))).isEqualTo(BallStatus.getStrike());
	}
}

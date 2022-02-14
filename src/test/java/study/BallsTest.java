package study;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class BallsTest {
	
	@Test
	void result_nothing() {
		Balls comBalls = new Balls(Arrays.asList(1,2,3));
		Balls userBalls = new Balls(Arrays.asList(4,5,6));
		
		assertThat(comBalls.play(userBalls).getBallCount()).isEqualTo(0);
		assertThat(comBalls.play(userBalls).getStrikeCount()).isEqualTo(0);
	}

	@Test
	void result_1strike_1ball() {
		Balls comBalls = new Balls(Arrays.asList(1,2,3));
		Balls userBalls = new Balls(Arrays.asList(1,3,6));
		
		assertThat(comBalls.play(userBalls).getBallCount()).isEqualTo(1);
		assertThat(comBalls.play(userBalls).getStrikeCount()).isEqualTo(1);
	}
	
	@Test
	void isGameEnd() {
		Balls comBalls = new Balls(Arrays.asList(1,2,3));
		Balls userBalls = new Balls(Arrays.asList(1,2,3));
		
		assertThat(comBalls.play(userBalls).getBallCount()).isEqualTo(0);
		assertThat(comBalls.play(userBalls).getStrikeCount()).isEqualTo(3);
		assertThat(comBalls.play(userBalls).isGameEnd()).isTrue();
	}
	
	@Test
	void nothing() {
		Balls com = new Balls(Arrays.asList(1,2,3));
		Ball user = new Ball(1,4);
			
		assertThat(com.play(user)).isEqualTo(BallStatus.getNothing());
	}
	
	@Test
	void ball() {
		Balls com = new Balls(Arrays.asList(1,2,3));
		Ball user = new Ball(1,2);
		
		assertThat(com.play(user)).isEqualTo(BallStatus.getBall());
	}
	
	@Test
	void strike() {
		Balls com = new Balls(Arrays.asList(1,2,3));
		Ball user = new Ball(1,1);
		
		assertThat(com.play(user)).isEqualTo(BallStatus.getStrike());
	}
}

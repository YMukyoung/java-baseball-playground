package study;

import java.util.ArrayList;
import java.util.List;

public class Balls {

	private List<Ball> answers;

	public Balls(List<Integer> balls) {
		this.answers = new ArrayList<Ball>(); 
		for(int i = 1; i <= balls.size(); i++) {
			this.answers.add(new Ball(i, balls.get(i-1)));
		}
	}

	public PlayResult play(Balls userBalls) {
		PlayResult result = new PlayResult(0,0);
		
		for (Ball answer : answers) {
			BallStatus status = userBalls.play(answer);
			result.report(status);
			result.isGameEnd();
		}
		return result;
	}
	
	public BallStatus play(Ball userBall) {
		return answers.stream()
				    .map(com -> com.play(userBall))
				    .filter(status -> status.isNotNothing())
				    .findFirst()
				    .orElse(BallStatus.getNothing());
	}
}

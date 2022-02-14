package study;

public class Ball {
	
	private int position;
	private int num;

	private int getNum() {
		return num;
	}
	
	public Ball(int position, int num) {
		this.position = position;
		this.num = num;
	}

	public boolean checkNumber(int num) {
		return num >= 1 && num <= 9;
	}

	public BallStatus play(Ball ball) {
		
		if(this.equals(ball)) {
			return BallStatus.getStrike();
		}
		
		if(matchBall(ball)) {
			return BallStatus.getBall();
		}
		
		return BallStatus.getNothing();
	}

	private boolean matchBall(Ball com) {
		return this.getNum() == com.getNum();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ball other = (Ball) obj;
		return num == other.num && position == other.position;
	}
}

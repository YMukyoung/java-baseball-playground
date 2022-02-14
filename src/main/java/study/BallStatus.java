package study;

public enum BallStatus {
	NOTHING, BALL, STRIKE;

	public static BallStatus getNothing() {
		return NOTHING;
	}

	public static BallStatus getBall() {
		return BALL;
	}

	public static BallStatus getStrike() {
		return STRIKE;
	}

	public boolean isNotNothing() {
		return this != NOTHING;
	}

	boolean isStrike() {
		return this == STRIKE;
	}

	boolean isBall() {
		return this == BALL;
	}
}

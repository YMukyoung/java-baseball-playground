package study;

public class PlayResult {

	private int strikeCount = 0;
	private int ballCount = 0;

	public PlayResult(int strikeCount, int ballCount) {
		this.strikeCount = strikeCount;
		this.ballCount = ballCount;
	}

	public int getStrikeCount() {
		return strikeCount;
	}
	
	public int getBallCount() {
		return ballCount;
	}

	public void report(BallStatus status) {
		if(status.isStrike()) {
			strikeCount++;
		}
		
		if(status.isBall()) {
			ballCount++;
		}
		
	}

	public boolean isGameEnd() {
		return strikeCount == 3;
	}
}

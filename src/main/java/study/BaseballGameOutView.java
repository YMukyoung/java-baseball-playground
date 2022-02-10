package study;

public class BaseballGameOutView {
	
	public void showInputMessage() {
		System.out.print(BaseballGameMessage.INPUT_MSG.getMessage());
	}
	
	public void showCorrectMessage() {
		System.out.println(BaseballGameMessage.CORRECT_MSG.getMessage());
	}
	
	public void showRetryQuestionMessage() {
		System.out.println(BaseballGameMessage.RETRY_MSG.getMessage());
	}
	
	public void showStrikeCountMessage(int strikeCount) {
		if(strikeCount == 0) {
			System.out.println();
			return;
		}
		
		System.out.println(String.valueOf(strikeCount) + BaseballGameMessage.STRIKE.getMessage());
	}
	
	public void showBallCountMessage(int ballCount) {
		if(ballCount == 0) return;
		System.out.print(String.valueOf(ballCount) + BaseballGameMessage.BALL.getMessage());
		System.out.print(" ");
	}
	
	public void showResultMessage(int strikeCount, int ballCount) {
		showBallCountMessage(ballCount);
		showStrikeCountMessage(strikeCount);
	}
}

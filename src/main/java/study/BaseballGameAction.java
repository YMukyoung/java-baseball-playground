package study;

public class BaseballGameAction {

	private int strikeCount;
	private int ballCount;
	
	public void initCount() {
		strikeCount = 0;
		ballCount = 0;
	}
	
	public void correctAnswer(BaseballGameOutView gv) {
		gv.showCorrectMessage();
	}
	
	public void gradeYourAnswer(BaseballGameInputView gv) {
		String answer = gv.getAnswer();
		String givenAnswer = gv.getGivenAnswer();
		
		for(int i = 0; i < answer.length(); i++) {
			Character charAnswer =answer.charAt(i); 
			Character charGivenAnswer =givenAnswer.charAt(i);
			
			isStrike(charAnswer, charGivenAnswer);
			isBall(answer, charAnswer, charGivenAnswer);
		}
	}
	
	public void isStrike(Character charAnswer, Character charGivenAnswer) {
		if(charAnswer == charGivenAnswer) {
			strikeCount++;
		}
	}
	
	public void isBall(String answer, Character charAnswer, Character charGivenAnswer) {
		if(charAnswer == charGivenAnswer) {
			return;
		}
		
		if(answer.contains(String.valueOf(charGivenAnswer))) {
			ballCount++;
		}
	}
	
	public void retryBaseballGame(BaseballGameOutView outView, BaseballGameInputView inputView) {
		outView.showRetryQuestionMessage();
		inputView.inputRetryYN();
		
		if(inputView.getIsRetry().equals("1")) {
			initCount();
			startBaseballGame();
		}
	}
	
	public void startBaseballGame(){
		BaseballGameOutView outView = new BaseballGameOutView();
		BaseballGameInputView inputView = new BaseballGameInputView();
		
		outView.showInputMessage();
		inputView.inputAnswer();
		
		while(strikeCount < 3) {
			initCount();
			
			outView.showInputMessage();
			inputView.inputGivenAnswer();
			
			gradeYourAnswer(inputView);
			
			outView.showResultMessage(strikeCount, ballCount);
			
		}
		
		correctAnswer(outView);
		retryBaseballGame(outView, inputView);
	}
}

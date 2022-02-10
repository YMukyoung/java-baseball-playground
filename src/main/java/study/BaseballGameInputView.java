package study;

import java.util.Scanner;

public class BaseballGameInputView {

	private String answer;
	private String givenAnswer;
	private String isRetry;
	
	public String getAnswer() {
		return answer;
	}
	
	public String getGivenAnswer() {
		return givenAnswer;
	}
	
	public String getIsRetry() {
		return isRetry;
	}
	
	Scanner sc = new Scanner(System.in);
	public void inputAnswer() {
		this.answer = sc.nextLine();
	}
	
	public void inputGivenAnswer() {
		this.givenAnswer = sc.nextLine();
	}
	
	public void inputRetryYN() {
		this.isRetry = sc.nextLine();
	}
}

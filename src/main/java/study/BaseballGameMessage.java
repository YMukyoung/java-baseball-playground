package study;

public enum BaseballGameMessage {
	INPUT_MSG("숫자를 입력해 주세요 : "),
	CORRECT_MSG("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
	RETRY_MSG("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
	STRIKE("스트라이크"),
	BALL("볼");

	private String message;
	
	BaseballGameMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
}

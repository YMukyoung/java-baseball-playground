package study;

public class Calculator {
	
	public int plus (int firstNum, int secondNum) {
		return firstNum + secondNum;
	}
	
	public int minus (int firstNum, int secondNum) {
		return firstNum - secondNum;
	}
	
	public int multiple (int firstNum, int secondNum) {
		return firstNum * secondNum;
	}
	
	public int divide (int firstNum, int secondNum) {
		return firstNum / secondNum;
	}
	
	public int calculate(String buho, int firstNum, int secondNum) {
		int result = 0;
		
		if(buho.equals("+")) {
			result = plus(firstNum, secondNum);
		}else if(buho.equals("-")) {
			result = minus(firstNum, secondNum);
		}else if(buho.equals("*")) {
			result = multiple(firstNum, secondNum);
		}else if(buho.equals("/")) {
			result = divide(firstNum, secondNum);
		}
		
		return result;
	}
	
	public int calculate(String input) {
		if(input.length() == 0) return 0;
		
		String[] inputs = input.split(" ");
		int result = Integer.parseInt(inputs[0]);
		
		for(int i = 1; i < inputs.length; i++) {
			if(i % 2 == 0) {	
				String buho = inputs[i-1];
				int secondNum = Integer.parseInt(inputs[i]);
				if(buho.equals("+")) {
					result = plus(result, secondNum);
				}else if(buho.equals("-")) {
					result = minus(result, secondNum);
				}else if(buho.equals("*")) {
					result = multiple(result, secondNum);
				}else if(buho.equals("/")) {
					result = divide(result, secondNum);
				}
			}
		}
		
		return result;
	}
}

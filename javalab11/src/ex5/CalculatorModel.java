//1971040 이현정
//예제5 : mvc 패턴 이해
package ex5;

//그 버튼을 눌렀을 때 수행해주는 것들을 구현한 클래스이다.
public class CalculatorModel {
	private double displayValue;
	private double internalValue;
	private String displayString;
	private String operation;
	private boolean start;
	private boolean dot;

	public CalculatorModel() {
		displayValue = 0.0;
		displayString = "" + displayValue;
		internalValue = 0;
		dot = false;
		start = true;
		operation = "";
	}

	public String getValue() {
		return displayString;
	}

	public void update(String text) {
		if (start) { //시작
			internalValue = displayValue;
			displayValue = 0;
			displayString = "";
			start = false;
			dot = false;
		}
		
		if (text.length() == 1 && "0123456789".indexOf(text) >= 0) {
			displayString += text;
			displayValue = Double.valueOf(displayString);
		} 
		else if (text.equals(".")) {
			if (!dot) {
				dot = true;
				if (displayString.equals("")) {
					displayString = "0";
				}
				displayString += ".";
			}
		} 
		else {
			if (operation.equals("+")) { //+를 받을때 더하기를 실행해준다.
				displayValue = internalValue + displayValue;
			} 
			else if (operation.equals("-")) {
				displayValue = internalValue - displayValue;
			} 
			else if (operation.equals("*")) {
				displayValue = internalValue * displayValue;
			} 
			else if (operation.equals("/")) {
				displayValue = internalValue / displayValue;
			}

			displayString = "" + displayValue;
			internalValue = displayValue;
			operation = text;
			start = true;
		}
	}
}

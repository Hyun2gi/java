//1971040 이현정
//예제5 : mvc 패턴 이해
package ex5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController implements ActionListener {
	private CalculatorModel model;
	private CalculatorView view;

	public CalculatorController(CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;
	}
	
	//menu,button 선택했을 때 -> actionevent 발생
	public void actionPerformed(ActionEvent e) { //뭐가 눌러진지 구별
		String command = e.getActionCommand(); //text 예를 들어 5,two decimal이런거 넘겨줌.
		if (command.equals("Exit")) {
			System.exit(0);
		} 
		else if (command.equals("Two Decimal Digits")) {
			view.setDigits(2);
			view.update(model.getValue());
		} 
		else if (command.equals("Any Decimal Digits")) {
			view.setDigits(-1);
			view.update(model.getValue());
		}else if(command.equals("Clear")) {
			model = new CalculatorModel();
			view.update(model.getValue());
		}
		else {
			model.update(command); //선택된 command 넘김
			view.update(model.getValue());
		}
	}
}

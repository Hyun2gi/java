//1971040 ������
//����5 : mvc ���� ����
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
	
	//menu,button �������� �� -> actionevent �߻�
	public void actionPerformed(ActionEvent e) { //���� �������� ����
		String command = e.getActionCommand(); //text ���� ��� 5,two decimal�̷��� �Ѱ���.
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
			model.update(command); //���õ� command �ѱ�
			view.update(model.getValue());
		}
	}
}

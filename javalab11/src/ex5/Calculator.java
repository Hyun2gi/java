/**

 * The Calculator class along with CalculatorController,
 * CalculatorModel and CalculatorView implements a 
 * simple-minded calculator.
 * The implementation is based on the MVC design pattern.
 * 
 * @author Tom Bylander
*/
//1971040 ������
//����5 : mvc ���� ����
package ex5;

import javax.swing.JFrame;

public class Calculator { //�������ִ� Ŭ����
	public static void main(String[] args) {
		/* create new model, view and controller */
		CalculatorModel model = new CalculatorModel();
		CalculatorView view = new CalculatorView();
		CalculatorController controller = new CalculatorController(model, view);//model, view�� �ٸ������� ���ִ� ��ü����
		
		/* register controller as listener */
		view.registerListener(controller);//controller�Ѱ���. event�� listener����Ѵ�.
		
		/* start it up */
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setSize(400, 300);
		view.setVisible(true);
	}
}

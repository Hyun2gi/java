/**

 * The Calculator class along with CalculatorController,
 * CalculatorModel and CalculatorView implements a 
 * simple-minded calculator.
 * The implementation is based on the MVC design pattern.
 * 
 * @author Tom Bylander
*/
//1971040 이현정
//예제5 : mvc 패턴 이해
package ex5;

import javax.swing.JFrame;

public class Calculator { //구현해주는 클래스
	public static void main(String[] args) {
		/* create new model, view and controller */
		CalculatorModel model = new CalculatorModel();
		CalculatorView view = new CalculatorView();
		CalculatorController controller = new CalculatorController(model, view);//model, view의 다리역할을 해주는 객체생성
		
		/* register controller as listener */
		view.registerListener(controller);//controller넘겨줌. event에 listener등록한다.
		
		/* start it up */
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setSize(400, 300);
		view.setVisible(true);
	}
}

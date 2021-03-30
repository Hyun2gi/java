//1971040 이현정
//예제5 : mvc 패턴 이해
package ex5;

import java.awt.*;
import javax.swing.*;

public class CalculatorView extends JFrame { //시각적 화면구성해준다.
	private JLabel display;
	private JPanel buttonsPanel;
	private JPanel displayPanel2;
	private JMenu exampleMenu;
	private int digits;

	public CalculatorView() {
		super("Simple Calculator");

		JMenuBar menuBar = new JMenuBar(); //메뉴바
		setJMenuBar(menuBar);

		exampleMenu = new JMenu("Menu"); 
		menuBar.add(exampleMenu); //메뉴바에 추가해준다

		//메뉴바에 나오는 것들을 추가해주는 코드
		JMenuItem twoDigitsButton = new JMenuItem("Two Decimal Digits");
		exampleMenu.add(twoDigitsButton); 

		JMenuItem anyDigitsButton = new JMenuItem("Any Decimal Digits");
		exampleMenu.add(anyDigitsButton);
		
		JMenuItem ClearButton = new JMenuItem("Clear"); //실습 1에서 추가한것
		exampleMenu.add(ClearButton);
		
		JMenuItem exitButton = new JMenuItem("Exit"); //버튼 추가. 나가는 기능을 해준다.
		exampleMenu.add(exitButton);

		JPanel displayPanel = new JPanel(); //label을 담고 있게 해주는 panel
		add(displayPanel, BorderLayout.NORTH); //north에 라벨 추가
		
		displayPanel2 = new JPanel();
		add(displayPanel2, BorderLayout.SOUTH); //south에 라벨 추가
		
		JButton clear = new JButton("clear"); //버튼생성 실습1에서 추가했음.
		displayPanel2.add(clear); // panel2에 추가해준다. south label에 추가되어서 나오게 된다.
		

		display = new JLabel("0.0"); //처음에 0.0을 보여준다.
		displayPanel.add(display); //이걸 panel에 넣음.
		digits = -1;

		buttonsPanel = new JPanel();
		add(buttonsPanel, BorderLayout.CENTER);
		buttonsPanel.setLayout(new GridLayout(4, 4, 0, 0)); //계산기타자(?)부분을 만들어준다. 버튼들을 담고 있는데 행 4개 열 4개이다.

		String[] buttonStrings = { "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", ".", "=", "/" };

		for (String s : buttonStrings)
			buttonsPanel.add(new JButton(s));
		
	}

	public void registerListener(CalculatorController controller) { //버튼 선택하면 어떤 리스너를 가져올지
		Component[] components = buttonsPanel.getComponents(); //버튼 모두 가져온다.
		for (Component component : components) {
			if (component instanceof AbstractButton) { //instanceof를 통해 해당 버튼의 타입이 맞는지 확인을 한 후에
				AbstractButton button = (AbstractButton) component;
				button.addActionListener(controller); //버튼 누르면 나오는 action에 관련된 listener를 add
			}
		}

		components = exampleMenu.getMenuComponents();
		for (Component component : components) {
			if (component instanceof AbstractButton) {
				AbstractButton button = (AbstractButton) component;
				button.addActionListener(controller); //버튼 누르면 나오는 action에 관련된 listener를 add
			}
		}
		
		components = displayPanel2.getComponents();
		for(Component component : components) {
			if(component instanceof AbstractButton) {
				AbstractButton button = (AbstractButton) component;
				button.addActionListener(controller);
			}
		}
		
		
	}

	public void update(String value) {
		if (digits < 0)
			display.setText(value); //소수점 제한x
		else {
			String format = "%." + digits + "f"; //소수점
			String text = String.format(format, Double.valueOf(value));
			display.setText(text);
		}
	}

	public void setDigits(int digits) {
		this.digits = digits;
	}
}

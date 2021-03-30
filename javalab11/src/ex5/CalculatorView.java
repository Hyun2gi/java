//1971040 ������
//����5 : mvc ���� ����
package ex5;

import java.awt.*;
import javax.swing.*;

public class CalculatorView extends JFrame { //�ð��� ȭ�鱸�����ش�.
	private JLabel display;
	private JPanel buttonsPanel;
	private JPanel displayPanel2;
	private JMenu exampleMenu;
	private int digits;

	public CalculatorView() {
		super("Simple Calculator");

		JMenuBar menuBar = new JMenuBar(); //�޴���
		setJMenuBar(menuBar);

		exampleMenu = new JMenu("Menu"); 
		menuBar.add(exampleMenu); //�޴��ٿ� �߰����ش�

		//�޴��ٿ� ������ �͵��� �߰����ִ� �ڵ�
		JMenuItem twoDigitsButton = new JMenuItem("Two Decimal Digits");
		exampleMenu.add(twoDigitsButton); 

		JMenuItem anyDigitsButton = new JMenuItem("Any Decimal Digits");
		exampleMenu.add(anyDigitsButton);
		
		JMenuItem ClearButton = new JMenuItem("Clear"); //�ǽ� 1���� �߰��Ѱ�
		exampleMenu.add(ClearButton);
		
		JMenuItem exitButton = new JMenuItem("Exit"); //��ư �߰�. ������ ����� ���ش�.
		exampleMenu.add(exitButton);

		JPanel displayPanel = new JPanel(); //label�� ��� �ְ� ���ִ� panel
		add(displayPanel, BorderLayout.NORTH); //north�� �� �߰�
		
		displayPanel2 = new JPanel();
		add(displayPanel2, BorderLayout.SOUTH); //south�� �� �߰�
		
		JButton clear = new JButton("clear"); //��ư���� �ǽ�1���� �߰�����.
		displayPanel2.add(clear); // panel2�� �߰����ش�. south label�� �߰��Ǿ ������ �ȴ�.
		

		display = new JLabel("0.0"); //ó���� 0.0�� �����ش�.
		displayPanel.add(display); //�̰� panel�� ����.
		digits = -1;

		buttonsPanel = new JPanel();
		add(buttonsPanel, BorderLayout.CENTER);
		buttonsPanel.setLayout(new GridLayout(4, 4, 0, 0)); //����Ÿ��(?)�κ��� ������ش�. ��ư���� ��� �ִµ� �� 4�� �� 4���̴�.

		String[] buttonStrings = { "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", ".", "=", "/" };

		for (String s : buttonStrings)
			buttonsPanel.add(new JButton(s));
		
	}

	public void registerListener(CalculatorController controller) { //��ư �����ϸ� � �����ʸ� ��������
		Component[] components = buttonsPanel.getComponents(); //��ư ��� �����´�.
		for (Component component : components) {
			if (component instanceof AbstractButton) { //instanceof�� ���� �ش� ��ư�� Ÿ���� �´��� Ȯ���� �� �Ŀ�
				AbstractButton button = (AbstractButton) component;
				button.addActionListener(controller); //��ư ������ ������ action�� ���õ� listener�� add
			}
		}

		components = exampleMenu.getMenuComponents();
		for (Component component : components) {
			if (component instanceof AbstractButton) {
				AbstractButton button = (AbstractButton) component;
				button.addActionListener(controller); //��ư ������ ������ action�� ���õ� listener�� add
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
			display.setText(value); //�Ҽ��� ����x
		else {
			String format = "%." + digits + "f"; //�Ҽ���
			String text = String.format(format, Double.valueOf(value));
			display.setText(text);
		}
	}

	public void setDigits(int digits) {
		this.digits = digits;
	}
}

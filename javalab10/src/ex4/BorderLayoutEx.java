//1971040 ������
//����4 : borderLayout ��ġ������ Ȱ��
package ex4;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(30,20));
		c.add(new Button("add"),BorderLayout.NORTH);
		c.add(new Button("div"), BorderLayout.WEST);
		c.
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}

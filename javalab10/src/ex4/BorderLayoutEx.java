//1971040 이현정
//예제4 : borderLayout 배치관리자 활용
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

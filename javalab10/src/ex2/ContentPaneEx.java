//1971040 ������
//����2 : 3���� ��ư ������Ʈ �߰�
package ex2;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane�� JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,150);
		JButton btn1 = new JButton("OK");
		JButton btn2 = new JButton("Cancel");
		JButton btn3 = new JButton("Ignore");
		
		Container c = getContentPane();
		c.setBackground(Color.ORANGE);
		c.setLayout(new FlowLayout());
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		setSize(400,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ContentPaneEx();
	}

}

//1971040 ������
//����6 : Dialog & Event Handling
//1971040 ������
//�ǽ� 1: dvd ui �����
package pm1;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogTest extends JFrame {
	
	back dig1;
	customer dig2;
	dvdMyDialog dig3;
	rent dig4;
	find dig5;
	
	public DialogTest() {
		super("DiaglogEx ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 40));
		JButton btn1 = new JButton("dvd��ȯ");
		JButton btn2 = new JButton("�� ���");
		JButton btn3 = new JButton("dvd ���");
		JButton btn4 = new JButton("�뿩�޴�");
		JButton btn5 = new JButton("�˻��޴�");
		dig1 = new back(this, "dvd��ȯ");
		dig2 = new customer(this, "�� ���");
		dig3 = new dvdMyDialog(this, "dvd ���");
		dig4 = new rent(this, "�뿩�޴�");
		dig5 = new find(this, "�˻��޴�");
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dig1.setVisible(true);
			}
		}
			);
		
	
	btn2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dig2.setVisible(true);
		}
	}
		);


	btn3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dig3.setVisible(true);
		}
			}
	);


	btn4.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		dig4.setVisible(true);
			}
		}
	);
	
	btn5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dig5.setVisible(true);
				}
			}
		);
	
	c.add(btn1);
	c.add(btn2);
	c.add(btn3);
	c.add(btn4);
	c.add(btn5);
	setSize(700,700);
	setVisible(true);

}
	
	public static void main(String[] args) {
		DialogTest dtest = new DialogTest();
	}

}

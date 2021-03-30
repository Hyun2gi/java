//1971040 이현정
//예제6 : Dialog & Event Handling
//1971040 이현정
//실습 1: dvd ui 만들기
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
		super("DiaglogEx 예제 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 40));
		JButton btn1 = new JButton("dvd반환");
		JButton btn2 = new JButton("고객 등록");
		JButton btn3 = new JButton("dvd 등록");
		JButton btn4 = new JButton("대여메뉴");
		JButton btn5 = new JButton("검색메뉴");
		dig1 = new back(this, "dvd반환");
		dig2 = new customer(this, "고객 등록");
		dig3 = new dvdMyDialog(this, "dvd 등록");
		dig4 = new rent(this, "대여메뉴");
		dig5 = new find(this, "검색메뉴");
		
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

//1971040 이현정
//예제6 : Dialog & Event Handling
package ex6;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogTest extends JFrame {
	
	MyDialog dig;
	
	public DialogTest() {
		super("DiaglogEx 예제 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Show Dialog");
		dig = new MyDialog(this, "Test Dialog");
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dig.setVisible(true);
			}
		}
			);
		getContentPane().add(btn);
		setSize(250,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		DialogTest dtest = new DialogTest();
	}

}

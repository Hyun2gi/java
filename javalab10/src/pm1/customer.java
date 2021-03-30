//1971040 이현정
//실습 1: dvd ui 만들기
package pm1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class customer extends JDialog {
	JButton btnOk = new JButton("OK");
	JButton btnCancel = new JButton("Cancel");
	JTextField txtName = new JTextField(10);
	
	public customer(JFrame frame, String title) {
		setTitle("고객등록");
		
		GridLayout grid = new GridLayout(5,2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel(" 이름:"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 생년:"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 주소:"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 전화:"));
		c.add(new JTextField(""));
		setSize(200,200);
		setVisible(true);
		
		btnOk.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String s = txtName.getText();
				JOptionPane.showMessageDialog(frame,"등록되었습니다.");
				setVisible(false);
			}
		});
		
		
		btnCancel.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String s = txtName.getText();
				JOptionPane.showMessageDialog(frame,"취소.");
				setVisible(false);
			}
		});
		add(btnOk);
		add(btnCancel);
	}
	
}



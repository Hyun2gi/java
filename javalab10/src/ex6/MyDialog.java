//1971040 이현정
//예제6 : Dialog & Event Handling
package ex6;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JDialog;

public class MyDialog extends JDialog {
	JTextField txtName = new JTextField(10);
	JButton btnOk = new JButton("OK");
	
	public MyDialog(JFrame frame, String title) {
		super(frame,title);
		setLayout(new FlowLayout());
		add(txtName);
		add(btnOk);
		setSize(200,100);
		
		btnOk.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String s = txtName.getText();
				JOptionPane.showMessageDialog(frame, "Your name is" +s);
				setVisible(false);
			}
		});
	}
}

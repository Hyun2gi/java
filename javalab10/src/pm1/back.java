//1971040 ������
//�ǽ� 1: dvd ui �����
package pm1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class back extends JDialog {
	JButton btnOk = new JButton("OK");
	JButton btnCancel = new JButton("Cancel");
	JTextField txtName = new JTextField(10);
	
	public back(JFrame frame, String title) {
		setTitle("�����");
		
		GridLayout grid = new GridLayout(2,2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel(" ISBN:"));
		c.add(new JTextField(""));
		setSize(200,200);
		setVisible(true);
		
		btnOk.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String s = txtName.getText();
				JOptionPane.showMessageDialog(frame,"��ϵǾ����ϴ�.");
				setVisible(false);
			}
		});
		
		
		btnCancel.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String s = txtName.getText();
				JOptionPane.showMessageDialog(frame,"���.");
				setVisible(false);
			}
		});
		add(btnOk);
		add(btnCancel);
	}
	
}



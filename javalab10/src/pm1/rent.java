//1971040 ������
//�ǽ� 1: dvd ui �����
package pm1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class rent extends JDialog {
	JTextField txtName = new JTextField(10);
	JButton btnOk = new JButton("OK");
	JButton btnCancel = new JButton("Cancel");
	
	public rent(JFrame frame, String title) {
		super(frame,title);
		GridLayout grid = new GridLayout(3,2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel("ID:"));
		c.add(new JTextField(""));
		c.add(new JLabel("ISBN:"));
		c.add(new JTextField(""));
		
		
		btnOk.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String s = txtName.getText();
				JOptionPane.showMessageDialog(frame,"�뿩�Ϸ�Ǿ����ϴ�.");
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
		setSize(200,200);
	}
}



//1971040 ������
//�ǽ� 1: dvd ui �����
package pm1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

public class find extends JDialog {
	private String[] str = {"���˻�","��ü���˻�","�뿩��ϰ˻�","dvd�˻�","��üdvd�˻�" };
	JTextField txtName = new JTextField(10);
	JButton btnOk = new JButton("OK");
	JButton btnCancel = new JButton("Cancel");
	
	public find(JFrame frame, String title) {
		super(frame,title);
		setLayout(new FlowLayout());
		GridLayout grid = new GridLayout(3,2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel(" �˻�:"));
		JComboBox<String> combo = new JComboBox<String>(str);
		c.add(combo, BorderLayout.NORTH);
		setSize(300,200);
		
		
		btnOk.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String s = txtName.getText();
				JOptionPane.showMessageDialog(frame,"��� ��� ���");
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
		
		combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				// int index = combo.getSelectedIndex();
			}
		});
		add(btnOk);
		add(btnCancel);
	}
}



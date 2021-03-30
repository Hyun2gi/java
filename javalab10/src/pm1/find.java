//1971040 이현정
//실습 1: dvd ui 만들기
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
	private String[] str = {"고객검색","전체고객검색","대여목록검색","dvd검색","전체dvd검색" };
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
		c.add(new JLabel(" 검색:"));
		JComboBox<String> combo = new JComboBox<String>(str);
		c.add(combo, BorderLayout.NORTH);
		setSize(300,200);
		
		
		btnOk.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String s = txtName.getText();
				JOptionPane.showMessageDialog(frame,"목록 결과 출력");
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



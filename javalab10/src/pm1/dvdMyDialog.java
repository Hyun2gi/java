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

public class dvdMyDialog extends JDialog {
	private String[] str = {"1.액션","2.코믹","3.로맨틱","4.드라마","5.기타" };
	JTextField txtName = new JTextField(10);
	JButton btnOk = new JButton("OK");
	JButton btnCancel = new JButton("Cancel");
	
	public dvdMyDialog(JFrame frame, String title) {
		super(frame,title);
		setLayout(new FlowLayout());
		GridLayout grid = new GridLayout(6,2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel(" ISBN:"));
		c.add(new JTextField(""));
		c.add(new JLabel(" title:"));
		c.add(new JTextField(""));
		c.add(new JLabel(" producer:"));
		c.add(new JTextField(""));
		c.add(new JLabel(" manufactureContry:"));
		c.add(new JTextField(""));
		c.add(new JLabel(" genere:"));
		JComboBox<String> combo = new JComboBox<String>(str);
		c.add(combo, BorderLayout.NORTH);
		setSize(300,200);
		
		
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



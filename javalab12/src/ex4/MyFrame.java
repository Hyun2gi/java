//1971040 ������
//���� 4 : Ÿ�̸� ������
package ex4;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private int cnt = 1;
	
	public MyFrame() {
		setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		getContentPane().setLayout(new BorderLayout(0,0));
		
		JLabel timerLabel = new JLabel();
		timerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		c.add(timerLabel, BorderLayout.CENTER);
		
		TimerThread th = new TimerThread(timerLabel);
		
		setSize(300,270);
		setVisible(true);
		
		th.start();
		
		JButton btn = new JButton();
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = String.format("���� %d ��° ��ư�� Ŭ���߽��ϴ�", cnt++);
				JOptionPane.showMessageDialog(null, s);
		}
		});
		
		btn.setText("click me");
		c.add(btn, BorderLayout.SOUTH);
		}
	}


//1971040 이현정
//예제 4 : 타이머 스레드
package ex4;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private int cnt = 1;
	
	public MyFrame() {
		setTitle("Thread를 상속받은 타이머 스레드 예제");
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
				String s = String.format("현재 %d 번째 버튼을 클릭했습니다", cnt++);
				JOptionPane.showMessageDialog(null, s);
		}
		});
		
		btn.setText("click me");
		c.add(btn, BorderLayout.SOUTH);
		}
	}


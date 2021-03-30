//1971040 이현정
//예제 5 : 자동차 경주
package ex5;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RaceThread extends Thread {
	private JLabel label;
	private int x,y;
	private JFrame frame;
	
	public RaceThread(JFrame frame, String fname, int x, int y) {
		this.frame = frame;
		this.x = x;
		this.y = y;
		
		label = new JLabel();
		label.setIcon(new ImageIcon(fname));
		label.setBounds(x,y,120,100);
		frame.repaint();
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

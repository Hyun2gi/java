//1971040 ������
//����1 : Swing ������
package ex1;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300x300 ���� ������ �����");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}

//1971040 ������
//���� 6 : ������ �����
package ex6;

public class StudentThread extends Thread {
	private SharedBoard board;
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	
	public void run() {
		for(int i=0; i<10;i++) {
			board.add();
		}
	}
}

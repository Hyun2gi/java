//1971040 이현정
//예제 6 : 집계판 만들기
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

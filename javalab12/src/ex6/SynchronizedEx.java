//1971040 이현정
//예제 6 : 집계판 만들기
package ex6;

public class SynchronizedEx {

	public static void main(String[] args) {
		SharedBoard board = new SharedBoard();
		
		Thread th1 = new StudentThread("kitae",board);
		Thread th2 = new StudentThread("hyosoo",board);
		
		th1.start();
		th2.start();
	}

}

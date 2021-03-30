//1971040 이현정
//예제 6 : 집계판 만들기
package ex6;

public class SharedBoard {
	private int sum =0;
	
	public synchronized void add() {
		int n = sum;
		
		n+= 10;
		sum = n;
		
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
	
	public int getSum() {
		return sum;
	}
}

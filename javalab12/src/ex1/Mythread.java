//1971040 이현정
//예제 1 : 스레드 만들기
package ex1;

public class Mythread extends Thread {
	
	public void run() {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum = sum+i;
			System.out.println(i + "더하기 결과:" + sum);
		}
		System.out.println("--------------------");
		System.out.println("1~10 더하기: "+sum);
	}
	
	
}

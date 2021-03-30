//1971040 이현정
//예제 1 : 스레드 만들기
package ex1;

public class MyRunnable implements Runnable{
	public void run() {
		int multiply=0;
		for(int i=1;i<=10;i++) {
			multiply = multiply *i;
			System.out.println(i+"곱하기 결과: "+multiply);
		}
		System.out.println("--------------------");
		System.out.println("1~10 곱하기 : "+multiply);
	}
}

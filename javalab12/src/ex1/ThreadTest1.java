//1971040 이현정
//예제 1 : 스레드 만들기
package ex1;

public class ThreadTest1 {

	public static void main(String[] args) {
		Mythread t1 = new Mythread();
		
		Thread t2 = new Thread(new MyRunnable());
		
		t1.start();
		t2.start();
		
		int sum=0;
		for(int i=0;i<=10;i++) {
			sum =sum-i;
			System.out.println(i+"빼기 결과: "+sum);
		}
		
		System.out.println("---------------------");
		System.out.println("1~10빼기: "+sum);
	}

}

//1971040 이현정
//예제 2 : 스레드 정보 읽기
package ex2;

public class MyThread2 extends Thread {
	public MyThread2(String name) {
		super(name);
	}
	
	public void run() {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("2.현재 스레드 이름 =" + name);
		System.out.println("2.현재 스레드 ID=" + id);
		System.out.println("2.현재 스레드 우선순위 값 =" + priority);
		System.out.println("2.현재 스레드 상태 =" + s);
		
	}
}

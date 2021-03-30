//1971040 이현정
//예제 2 : 스레드 정보 읽기
package ex2;

public class ThreadTest2 {
	public static void main(String [] args) {
		MyThread2 th = new MyThread2("MyThread2");
		th.start();
		
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("1.현재 스레드 이름 =" + name);
		System.out.println("1.현재 스레드 ID=" + id);
		System.out.println("1.현재 스레드 우선순위 값 =" + priority);
		System.out.println("1.현재 스레드 상태 =" + s);
	}
}

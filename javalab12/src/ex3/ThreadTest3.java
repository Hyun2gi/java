//1971040 이현정
//예제 3 : 메인 스레드 정보 출력 끝날 떄까지 대기
package ex3;

public class ThreadTest3 {
	
	public volatile static boolean iswritten = false;
	
	public static void main(String[] args) {
		Object keyObj = new Object();
		MyThread3 th = new MyThread3("MyThread2",keyObj);
		th.start();
		
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		synchronized(keyObj) {
			System.out.println("1.현재 스레드 이름 = " + name);
			System.out.println("1.현재 스레드 ID = " +id);
			System.out.println("1.현재 스레드 우선순위 값=" + priority);
			System.out.println("1.현재 스레드 상태 = " +s);
			
			try {
				iswritten = true;
				keyObj.notify();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

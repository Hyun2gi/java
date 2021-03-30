//1971040 이현정
//예제 3 : 메인 스레드 정보 출력 끝날 떄까지 대기
package ex3;

public class MyThread3 extends Thread {
	private Object keyObj;
	
	public MyThread3(String name, Object keyObj) {
		super(name);
		this.keyObj = keyObj;
	}
	
	public void run() {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		synchronized(keyObj) {
			try {
				keyObj.wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("2.현재 스레드 이름  = "+name);
		System.out.println("2.현재 스레드 ID = "+id);
		System.out.println("2.현재 스레드 우선순위 값 = " +priority);
		System.out.println("2.현재 스레드 상태 = "+s);
	}
}

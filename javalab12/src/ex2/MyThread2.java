//1971040 ������
//���� 2 : ������ ���� �б�
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
		
		System.out.println("2.���� ������ �̸� =" + name);
		System.out.println("2.���� ������ ID=" + id);
		System.out.println("2.���� ������ �켱���� �� =" + priority);
		System.out.println("2.���� ������ ���� =" + s);
		
	}
}

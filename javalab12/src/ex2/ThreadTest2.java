//1971040 ������
//���� 2 : ������ ���� �б�
package ex2;

public class ThreadTest2 {
	public static void main(String [] args) {
		MyThread2 th = new MyThread2("MyThread2");
		th.start();
		
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("1.���� ������ �̸� =" + name);
		System.out.println("1.���� ������ ID=" + id);
		System.out.println("1.���� ������ �켱���� �� =" + priority);
		System.out.println("1.���� ������ ���� =" + s);
	}
}

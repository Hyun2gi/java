//1971040 ������
//���� 3 : ���� ������ ���� ��� ���� ������ ���
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
			System.out.println("1.���� ������ �̸� = " + name);
			System.out.println("1.���� ������ ID = " +id);
			System.out.println("1.���� ������ �켱���� ��=" + priority);
			System.out.println("1.���� ������ ���� = " +s);
			
			try {
				iswritten = true;
				keyObj.notify();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

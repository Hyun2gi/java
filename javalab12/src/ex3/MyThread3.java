//1971040 ������
//���� 3 : ���� ������ ���� ��� ���� ������ ���
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
		
		System.out.println("2.���� ������ �̸�  = "+name);
		System.out.println("2.���� ������ ID = "+id);
		System.out.println("2.���� ������ �켱���� �� = " +priority);
		System.out.println("2.���� ������ ���� = "+s);
	}
}

//1971040 ������
//���� 1 : ������ �����
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
			System.out.println(i+"���� ���: "+sum);
		}
		
		System.out.println("---------------------");
		System.out.println("1~10����: "+sum);
	}

}

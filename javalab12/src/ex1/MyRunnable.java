//1971040 ������
//���� 1 : ������ �����
package ex1;

public class MyRunnable implements Runnable{
	public void run() {
		int multiply=0;
		for(int i=1;i<=10;i++) {
			multiply = multiply *i;
			System.out.println(i+"���ϱ� ���: "+multiply);
		}
		System.out.println("--------------------");
		System.out.println("1~10 ���ϱ� : "+multiply);
	}
}

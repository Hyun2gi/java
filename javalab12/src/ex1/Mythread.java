//1971040 ������
//���� 1 : ������ �����
package ex1;

public class Mythread extends Thread {
	
	public void run() {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum = sum+i;
			System.out.println(i + "���ϱ� ���:" + sum);
		}
		System.out.println("--------------------");
		System.out.println("1~10 ���ϱ�: "+sum);
	}
	
	
}

//1971040 ������
//���� 3 : �������̽�
package ex3;

public class WodkTest {

	public static void main(String[] args) {
		BuggerCook hcook = new HotelCook();
		BuggerCook pcook = new PartTimeCook();
		BurggerClerk bk = new BurggerClerk();
		
		System.out.println("ȣ�ڽ� �ܹ��� �ֹ���û ����");
		bk.orderBugger(hcook);
		
		System.out.println("ȣ�ڽ� �ܹ��� �ֹ���û ����");
		bk.orderBugger(hcook);
		
		System.out.println("�˹ٽ� �ܹ��� �ֹ���û ����");
		bk.orderSalad(hcook);
		
		System.out.println("�˹ٽ� �ܹ��� �ֹ���û ����");
		bk.orderBugger(pcook);
		
		System.out.println("ȣ�ڽ� ������ �ֹ���û ����");
		bk.orderSalad(hcook);
		

	}

}

//1971040 ������
//���� 3 : �������̽�
package ex3;

public class BurggerClerk {
	
	public void orderBugger(BuggerCook cook) {
		System.out.println("�ܹ��� �ֹ�");
		cook.makeBurger();
	}
	
	public void orderSalad(BuggerCook cook) {
		System.out.println("������ �ֹ�");
		cook.makeSalad();
	}

}

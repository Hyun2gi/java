//1971040 ������
//���� 2 : ����ó��
package ex2;

public class ExceptionTest2 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		try {
			int result = 10/num;
			System.out.println("result = " + result);
		}catch(ArithmeticException e) {
			System.out.println("������ 0���� ������ �� �ſ�.");
		}
		System.out.println("���α׷� ��� �����");

	}

}

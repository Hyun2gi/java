//1971040 ������
//���� 2 : ����ó��
package ex2;

public class ExceptionTest3 {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			int result = 10/num;
			System.out.println("result = " +result);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ڸ� �ϳ� �Է��� �ּ���.");
		}
		catch(NumberFormatException e) {
			System.out.println("���ڸ� ���� Ÿ������ �Է��� �ּ���.");
		}
		catch(ArithmeticException e) {
			System.out.println("������ 0���� ������ �� �ſ�.");
		}
		finally {
			System.out.println("�ݵ�� ������ ����");
		}

	}

}

//1971040 ������

//����1 : scanner ��� , �̸�, ����, ����, ü�� �������θ� �Է� �ް� �ٽ� ���
package ex1;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ������ �и��Ͽ� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("�̸���" + name + ",");
		
		String city = scanner.next();
		System.out.print("���ô�" + city + ",");
		
		int age = scanner.nextInt();
		System.out.print("���̴�" + city + ",");
		
		double weight = scanner.nextDouble();
		System.out.print("ü����" + weight + ",");
		
		boolean single = scanner.nextBoolean();
		System.out.print("���� ���δ�" + single + ",");
		
		scanner.close();

	}

}

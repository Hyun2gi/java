//1971040 ������
//���� 5 : ����Ÿ��
package ex5;

import java.util.Scanner;

public class EnumDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��ȭ�� ���ϼ���(1.�޷�, 2.����, 3.��, 4. ����) >>");
		int choice = scan.nextInt();
		
		Currency cur;
		if(choice == 1) cur = Currency.DOLLAR;
		else if (choice == 2) cur = Currency.EURO;
		else if (choice ==3 ) cur = Currency.YEN;
		else cur = Currency.YUAN;
		
		switch(cur) {
		case DOLLAR :
			System.out.println("�޷� ȯ�� :" + cur.getValue() + "��"); break;
		case EURO :
			System.out.println("���� ȯ�� :" + cur.getValue() + "��"); break;
		case YEN :
			System.out.println("�޷�ȯ�� :" + cur.getValue() + "��"); break;
		case YUAN :
			System.out.println("�޷�ȯ�� :" + cur.getValue() + "��"); break;
		}
		scan.close();

	}

}

//1971040 ������
// �ǽ� 2 : ����� ���� ����ó��
package pm2;

import java.util.Scanner;

public class errorex {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		BankAccount b = new BankAccount();
		while(true) {
			System.out.println("������ �Ͻðڽ��ϱ�?");
			System.out.println("1. ���� ���� ��� 2. ���� ����  3. ���� �Ա�");
			System.out.println("�������� 0�� �Է��ϼ���.");
			n = sc.nextInt();
			if(n==0) {
				break;
			}
			switch(n) {
			case 1: 
				System.out.println("�ܾ� : " + b.money +"��");
				break;
			case 2 :
				try {
					System.out.println("�� �����Ͻðڽ��ϱ�? : ");
					n = sc.nextInt();
					if(b.money-n<0) throw new NotEnoughMoneyException();
					else b.money-= n;
					System.out.println(n+"���� ����Ǿ����ϴ�.");
					System.out.println("���� �ܾ� : "+b.money);
				}catch(NotEnoughMoneyException e) {
					System.out.println(e.getMessage());
					System.out.println("���� �ܾ� : "+b.money);
				}
				break;
			case 3 :
				try {
					System.out.println("�� �Ա��Ͻðڽ��ϱ�? : ");
					n = sc.nextInt();
					if(n<0) throw new InvalidMoneyException();
					else b.money+=n;
					System.out.println(n+"���� �ԱݵǾ����ϴ�.");
					System.out.println("���� �ܾ� : "+b.money);
				}catch(InvalidMoneyException e) {
					System.out.println(e.getMessage());
					System.out.println("���� �ܾ� : "+b.money);
				}
				break;
				}
			}
			
		}

	}



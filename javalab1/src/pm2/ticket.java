//1971040 ������
//�ǽ� 2 : ���� ǥ ����
package pm2;

import java.util.Scanner;

public class ticket {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�? û�ҳ�? ���? : ");
		String what = scan.next();
		
		switch(what) {
		case"�":
		case"û�ҳ�":
		case"���":
			System.out.println(what + " ��� �����մϴ�.");
			break;
		default :
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			break;
		}
		
		scan.close();
		
	}

}



// 1971040 ������
// �ǽ� 5 : �� �Ǹŷ� ���ϱ�2 , ����Ī ������ �̷��� �Է�
package pm5;

import java.util.Scanner;

public class phone2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String phone;
		int n;
		String a[] = {"������", "����", "��Ƽ�ӽ�", "��̳�", "������"};
		int b[] = {0, 0, 0, 0, 0};
		
		
		while(true) {
			phone = sc.next();
			n = sc.nextInt();
			if(phone.equals("���̴�")) {
				break;
			}
			for(int i=0;i<a.length;i++) {
				if(a[i].equals(phone)) {
					b[i]+=n;
				}
			}
			
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}

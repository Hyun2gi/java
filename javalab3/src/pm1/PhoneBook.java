//1971040 ������

//�ǽ�1 : ��ȭ��ȣ��
package pm1;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο��� >> ");
		int n;
		n = sc.nextInt();
		Phone p[] = new Phone[n];
		String name, phoneNum;
		for(int i=0;i<p.length;i++) {
			name = sc.next();
			phoneNum = sc.next();
			p[i] = new Phone(name, phoneNum);
		}
		
		while(true) {
			System.out.print("�˻��� �̸� >>");
			name = sc.next();
			if(name.equals("�׸�"))
				break;
			int check=0;
			for(int i=0;i<p.length;i++) {
				if(p[i].isYourName(name)) {
					System.out.println(p[i].getPhoneNum());
					check=1;
					break;
				}
			}
			if(check==0) {
				System.out.println(name+"�� �����ϴ�.");
			}
		}
	}

}

//1971040 이현정

//실습1 : 전화번호부
package pm1;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 >> ");
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
			System.out.print("검색할 이름 >>");
			name = sc.next();
			if(name.equals("그만"))
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
				System.out.println(name+"이 없습니다.");
			}
		}
	}

}

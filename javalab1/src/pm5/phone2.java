// 1971040 이현정
// 실습 5 : 폰 판매량 구하기2 , 폰명칭 폰개수 이렇게 입력
package pm5;

import java.util.Scanner;

public class phone2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String phone;
		int n;
		String a[] = {"갤럭시", "베가", "옵티머스", "루미나", "아이폰"};
		int b[] = {0, 0, 0, 0, 0};
		
		
		while(true) {
			phone = sc.next();
			n = sc.nextInt();
			if(phone.equals("끝이다")) {
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

//1971040 이현정
// 실습 4 : 폰 판매량 구하기1 , 폰 명칭 적고 총 개수 
package pm4;

import java.util.Scanner;
public class phone1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countList[] = {0,0,0,0,0};
		String phoneList[] = {"갤럭시", "베가", "옵티머스", "루미나", "아이폰"};
		
		while(true) {
			String name = sc.next();
			if(name.equals("끝났다!!!")) {
				break;
			}
			for(int i=0;i<phoneList.length;i++) {
				if(phoneList[i].equals(name)) {
					countList[i]++;
					break;
				}
			}
		}
		
		for(int i=0;i<phoneList.length;i++) {
			System.out.println(countList[i]);
		}
	}

}

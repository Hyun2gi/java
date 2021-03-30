//1971040 이현정
//실습2 : 기사확대(이차원 배열 활용 문제)
package pm2;

import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m11,m12,m21,m22;
		System.out.println("숫자 4개 입력>>");
		m11 = sc.nextInt();
		m12 = sc.nextInt();
		m21 = sc.nextInt();
		m22 = sc.nextInt();
		String[][]array = new String[m11][m12];
		for(int i=0;i<m11;i++) {
				String s = sc.next();
				array[i] = s.split("");
		}
		int count1=1, count2=1;
		for(int i=0;i<m11;i++) {
			while(count1<=m21) {
				for(int j=0;j<m12;j++) {
					while(count2<=m22) {
						System.out.print(array[i][j] +" ");
						count2++;
					}
					count2=1;
				}
				count1++;
				System.out.println();
			}
			count1=1;
		}

	}

}

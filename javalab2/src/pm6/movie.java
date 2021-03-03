//1971040 이현정

//실습 6 : 극장예약시스템
package pm6;

import java.util.Scanner;

public class movie {

	public static void main(String[] args) {
		System.out.print("좌석을 예약하시겠습니까?(yes or no) : ");
		Scanner sc = new Scanner(System.in);
		int s[][] = new int[5][7];
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[i].length;j++) {
				s[i][j] = 0;
			}
		}
		String check;
		int line;
		int seat;
		while(true) {
			check = sc.next();
			if(check.equals("no")) {
				break;
			}
			System.out.print("좌석 몇번째줄? : ");
			line= sc.nextInt();
			while(line<0||line>s.length) {
				System.out.println("다시입력하시오.");
				line = sc.nextInt();
			}
			for(int i=0;i<s[line-1].length;i++) {
				System.out.println(s[line-1][i]);
			}
			System.out.println("좌석은? : ");
			seat = sc.nextInt();
			if(s[line-1][seat-1]==1) {
				System.out.println("이미 예약된 좌석입니다.");
			}else {
				s[line-1][seat-1] = 1;
				System.out.println("예약되었습니다.");
			}
		}
	}

}

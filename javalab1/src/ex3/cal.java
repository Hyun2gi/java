//1971040 이현정

//예제 3 : 산술연산, 500초는 몇 시간 몇 분, 몇 초인가. 
package ex3;

import java.util.Scanner;

public class cal {

	public static void main(String[] args) {
		String type;
		Scanner sc = new Scanner(System.in);
		double ondo;
		type = sc.next();
		ondo = sc.nextInt();
		switch(type) {
		case "섭씨" :
			ondo = ondo*9.0/5.0 + 32.0;
			
			break;
		case "화씨" :
			ondo = (ondo-32.0)*5.0/9.0;
			break;
		}
		System.out.println("%s 온도는 %f",);
		
	}

}

//1971040 이현정
//예제 5 : 열거타입
package ex5;

import java.util.Scanner;

public class EnumDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("통화를 택하세요(1.달러, 2.유로, 3.엔, 4. 위안) >>");
		int choice = scan.nextInt();
		
		Currency cur;
		if(choice == 1) cur = Currency.DOLLAR;
		else if (choice == 2) cur = Currency.EURO;
		else if (choice ==3 ) cur = Currency.YEN;
		else cur = Currency.YUAN;
		
		switch(cur) {
		case DOLLAR :
			System.out.println("달러 환율 :" + cur.getValue() + "원"); break;
		case EURO :
			System.out.println("유로 환율 :" + cur.getValue() + "원"); break;
		case YEN :
			System.out.println("달러환율 :" + cur.getValue() + "원"); break;
		case YUAN :
			System.out.println("달러환율 :" + cur.getValue() + "원"); break;
		}
		scan.close();

	}

}

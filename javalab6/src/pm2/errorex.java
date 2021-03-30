//1971040 이현정
// 실습 2 : 사용자 정의 예외처리
package pm2;

import java.util.Scanner;

public class errorex {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		BankAccount b = new BankAccount();
		while(true) {
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1. 통장 정보 출력 2. 현금 인출  3. 예금 입금");
			System.out.println("끝내려면 0을 입력하세요.");
			n = sc.nextInt();
			if(n==0) {
				break;
			}
			switch(n) {
			case 1: 
				System.out.println("잔액 : " + b.money +"원");
				break;
			case 2 :
				try {
					System.out.println("얼마 인출하시겠습니까? : ");
					n = sc.nextInt();
					if(b.money-n<0) throw new NotEnoughMoneyException();
					else b.money-= n;
					System.out.println(n+"원이 인출되었습니다.");
					System.out.println("현재 잔액 : "+b.money);
				}catch(NotEnoughMoneyException e) {
					System.out.println(e.getMessage());
					System.out.println("현재 잔액 : "+b.money);
				}
				break;
			case 3 :
				try {
					System.out.println("얼마 입금하시겠습니까? : ");
					n = sc.nextInt();
					if(n<0) throw new InvalidMoneyException();
					else b.money+=n;
					System.out.println(n+"원이 입금되었습니다.");
					System.out.println("현재 잔액 : "+b.money);
				}catch(InvalidMoneyException e) {
					System.out.println(e.getMessage());
					System.out.println("현재 잔액 : "+b.money);
				}
				break;
				}
			}
			
		}

	}



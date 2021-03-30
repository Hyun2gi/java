//1971040 이현정
// 실습 3 : 주사위 게임
package pm3;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		System.out.println("*********************************");
		System.out.println("Major: Computer Engineering");
		System.out.println("ID : ???");
		System.out.println("Name: ???");
		System.out.println("*********************************");
		
		Scanner sc = new Scanner(System.in);
		
		Dice dice = new Dice();
		Person p1 = new Person('1',sc);
		Person p2 = new Person('2',sc);
		
		char choice = 'y';
		
		while(choice == 'y') {
			dice.setDiceNum();
			p1.inputGuessNum();
			p2.inputGuessNum();
			System.out.println("Dice Number:" + dice.getDiceNum());
			int baseNum = dice.getDiceNum();
			int p1Num = p1.getGuessNum();
			int p2Num = p2.getGuessNum();
			
			if(diff(baseNum,p1Num)>diff(baseNum,p2Num))
				System.out.println("Person2 won!");
			else if (diff(baseNum,p1Num)<diff(baseNum,p2Num))
				System.out.println("Person1 won!");
			else
				System.out.println("tie");
			
			System.out.println("Repeat?(y/n)");
			choice = sc.next().charAt(0);
		}
		
		sc.close();
	}
	
	public static int diff(int a, int b) {
		return a> b? a-b : b-a;
	}

}

//1971040 이현정
//실습 5 : 음료수 자판기
package pm5;

import java.util.Scanner;

public class MenuOrderTest {

	public static void main(String[] args) {
		int inmoney;
		int m;
		int menu;
		String s;
		Scanner sc = new Scanner(System.in);
		MenuOrder me = new MenuOrder();
		System.out.println("Input price for Coke");
		m = sc.nextInt();
		me.setCokePrice(m);
		System.out.println("Input price for Lemonade");
		m = sc.nextInt();
		me.setLemonPrice(m);
		System.out.println("Input price for Coffee");
		m = sc.nextInt();
		me.setCoffeePrice(m);
		System.out.println("--- Input Money ---");
		inmoney = sc.nextInt();
		me.showMenu();
		menu = sc.nextInt();
		me.drinkCost(menu, inmoney);
		me.showResult();
		System.out.println("Do you want to continue?(y/n)");
		s = sc.next();
		while(s.equals("y")) {
			System.out.println("--- Input Money ---");
			inmoney = sc.nextInt();
			me.showMenu();
			menu = sc.nextInt();
			me.drinkCost(menu, inmoney);
			me.showResult();
			System.out.println("Do you want to continue?(y/n)");
			s = sc.next();
		}

	}

}

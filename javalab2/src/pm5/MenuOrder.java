// 1971040 이현정

// 실습5 : 음료수 자판기
package pm5;

public class MenuOrder {
	private int cokePrice;
	private int lemonPrice;
	private int coffeePrice;
	int change;
	int menu;
	public int getCokePrice() {
		return cokePrice;
	}
	public int getLemonPrice() {
		return lemonPrice;
	}
	public int getCoffeePrice() {
		return coffeePrice;
	}
	public void setCokePrice(int m) {
		cokePrice = m;
	}
	public void setLemonPrice(int m) {
		lemonPrice = m;
	}
	public void setCoffeePrice(int m) {
		coffeePrice = m;
	}
	public void showMenu() {
		System.out.println("---Select Drink---");
		System.out.println("0 : Coke." + getCokePrice());
		System.out.println("1 : Lemonade." + getLemonPrice());
		System.out.println("2 : Coffee." + getCoffeePrice());
	}
	public void drinkCost(int menu, int inmoney) {
		switch(menu) {
		case 0 :
			change = inmoney-cokePrice;
			break;
		case 1 :
			change = inmoney-lemonPrice;
			break;
		case 2 :
			change = inmoney-coffeePrice;
			break;
		}
	}
	public void showResult() {
		switch(menu) {
		case 0 :
			System.out.println("You selected Coke");
			System.out.printf("Your change is %d won.\n", change);
			break;
		case 1 :
			System.out.println("You selected Lemonade");
			System.out.printf("Your change is %d won.", change);
			break;
		case 2 :
			System.out.println("You selected Coffee");
			System.out.printf("Your change is %d won.", change);
			break;
		}
	}

}

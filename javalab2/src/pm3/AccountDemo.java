// 1971040 이현정
// 실습3 : 은행계정관리
package pm3;

public class AccountDemo {

	public static void main(String[] args) {
		Account c1 = new Account("Kim",1000,0.03);
		Account c2 = new Account("Lee",0.04);
		Account c3 = new Account("Park",2000,0.05);
		
		c1.showAll();
		c1.deposit(300);
		c1.withdraw(100);
		c1.computeTotal(5);
		c1.showOwner();
		c1.showBalance();
		
		c2.showAll();
		c2.deposit(300);
		c2.withdraw(100);
		c2.computeTotal(5);
		c2.showOwner();
		c2.showBalance();
		
		c3.showAll();
		c3.deposit(300);
		c3.withdraw(100);
		c3.computeTotal(5);
		c3.showOwner();
		c3.showBalance();
		

	}

}

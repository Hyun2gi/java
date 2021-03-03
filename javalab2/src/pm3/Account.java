// 1971040 이현정
// 실습3 : 은행계정관리
package pm3;

public class Account {
	private int balance;
	private String owner;
	private double rate;
	
	Account(String owner, int balance, double rate) {
		this.owner = owner;
		this.balance = balance;
		this.rate = rate;
	}
	
	Account(String owner, double rate) {
		this(owner,0,rate);
	}
	
	void deposit(int m) {
		balance+=m;
	}
	
	void withdraw(int m) {
		balance-=m;
	}
	
	void computeTotal(int m) {
		balance += balance*rate*m/12.0;
	}
	
	void computeTotal() {
		balance += balance*rate/12.0;
	}
	
	void showAll() {
		System.out.println("Owner =" + owner);
		System.out.println("Balance =" + balance);
		System.out.println("Rate =" + rate);
	}
	
	void showOwner() {
		System.out.println("Owner =" + owner);
	}
	
	void showBalance() {
		System.out.println("Balance =" + balance);
	}
	
	void showRate() {
		System.out.println("Rate ="+rate);
	}
}

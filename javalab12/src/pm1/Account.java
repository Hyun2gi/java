//1971040 이현정
//실습1: 은행잔고
package pm1;

public class Account {
	int balance = 1000;
	
	public void withdraw(int money) {
		if(balance<0) {
			synchronized(this) {
				try {
					this.wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		balance -= money;
	}
	
	public void deposit(int money) {
		balance += money;
		if(balance >0) {
					synchronized(this) {
						this.notify();
					}
		}
	}
}

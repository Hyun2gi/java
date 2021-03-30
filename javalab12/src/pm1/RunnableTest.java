//1971040 이현정
//실습1: 은행잔고
package pm1;

public class RunnableTest implements Runnable {
	Account account = new Account();
	

	@Override
	public void run() {
		while(account.balance > 0) {
			int money = (int) (Math.random() * 3 + 1) * 100;
			account.withdraw(money);
			System.out.println(Thread.currentThread().getId() + " : balance : " + account.balance);
		}
		account.deposit(1000);
	}

}

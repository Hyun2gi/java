//1971040 이현정
//예제 3 : 인터페이스
package ex3;

public class BurggerClerk {
	
	public void orderBugger(BuggerCook cook) {
		System.out.println("햄버거 주문");
		cook.makeBurger();
	}
	
	public void orderSalad(BuggerCook cook) {
		System.out.println("샐러드 주문");
		cook.makeSalad();
	}

}

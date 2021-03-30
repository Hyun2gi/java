//1971040 이현정
//예제 3 : 인터페이스
package ex3;

public class WodkTest {

	public static void main(String[] args) {
		BuggerCook hcook = new HotelCook();
		BuggerCook pcook = new PartTimeCook();
		BurggerClerk bk = new BurggerClerk();
		
		System.out.println("호텔식 햄버거 주문요청 들어옴");
		bk.orderBugger(hcook);
		
		System.out.println("호텔식 햄버거 주문요청 들어옴");
		bk.orderBugger(hcook);
		
		System.out.println("알바식 햄버거 주문요청 들어옴");
		bk.orderSalad(hcook);
		
		System.out.println("알바식 햄버거 주문요청 들어옴");
		bk.orderBugger(pcook);
		
		System.out.println("호텔식 샐러드 주문요청 들어옴");
		bk.orderSalad(hcook);
		

	}

}

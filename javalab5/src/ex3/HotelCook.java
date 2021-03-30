//1971040 이현정
//예제 3 : 인터페이스
package ex3;

public class HotelCook implements BuggerCook {

	@Override
	public void makeBurger() {
		System.out.println("호텔급 햄버거 요리 중");

	}

	@Override
	public void makeSalad() {
		System.out.println("호텔급 샐러드 요리 중");

	}

}

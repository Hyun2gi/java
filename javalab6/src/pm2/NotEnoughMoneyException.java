//1971040 이현정
// 실습 2 : 사용자 정의 예외처리
package pm2;

public class NotEnoughMoneyException extends Exception {
	public String getMessage() {
		return "NotEnoughMoneyException: !!잔액이 충분하지 않습니다.";
	}

}

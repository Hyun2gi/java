//1971040 이현정
// 실습 2 : 사용자 정의 예외처리
package pm2;

public class InvalidMoneyException extends Exception {
	public String getMessage() {
		return "InvalidMoneyException : !!입금 액수가 잘 못 되었습니다.";
	}

}

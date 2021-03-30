//1971040 이현정
//예제 2 : 예외처리
package ex2;

public class ExceptionTest2 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		try {
			int result = 10/num;
			System.out.println("result = " + result);
		}catch(ArithmeticException e) {
			System.out.println("정수를 0으로 나누면 안 돼요.");
		}
		System.out.println("프로그램 계속 실행됨");

	}

}

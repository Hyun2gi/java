//1971040 이현정
//예제 3 : 예외처리
package ex3;

import java.util.Scanner;

public class ExceptionTest4 {
	public int inputData() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100 사이의 값을 입력하세요 !");
		int val = sc.nextInt();
		if(val < 1 || val > 100) {
			throw new Exception();
		}
		
		return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionTest4 et = new ExceptionTest4();
		try {
			int val = et.inputData();
			System.out.println("입력값: " + val);
		}
		catch(Exception e) {
			System.out.println("입력값이 범위를 벗어났습니다.");
		}

	}

}

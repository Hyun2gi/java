package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int divisor = 0;
		int dividend =0;
		System.out.println("나뉨수");
		dividend = rd.nextInt();
		System.out.println("나뉫수");
		divisor = rd.nextInt();
		try {
			System.out.println(dividend+"과"+divisor+"로 나누면 몫은 " + dividend/divisor+"입니다");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		}

	}

}

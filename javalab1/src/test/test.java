package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int divisor = 0;
		int dividend =0;
		System.out.println("������");
		dividend = rd.nextInt();
		System.out.println("������");
		divisor = rd.nextInt();
		try {
			System.out.println(dividend+"��"+divisor+"�� ������ ���� " + dividend/divisor+"�Դϴ�");
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� ����");
		}

	}

}

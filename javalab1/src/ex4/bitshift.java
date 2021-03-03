//1971040 이현정
//예제 4 : 비트 연산자와 시프트 연산자
package ex4;

public class bitshift {

	public static void main(String[] args) {
		short a = (short)0x55ff;
		short b = 0x00ff;
		
		System.out.printf("%x\n", a & b);
		System.out.printf("%x\n", a | b);
		System.out.printf("%x\n", a ^ b);
		System.out.printf("%x\n", ~a);
		byte c = 20;
		byte d = -8;
		
		System.out.println(c << 2);
		System.out.println(c >> 2);
		System.out.println(d >> 2);
		System.out.printf("%x\n", d >>> 2);

	}

}

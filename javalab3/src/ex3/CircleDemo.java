//1971040 이현정
//예지 3 : 원 면적, 원주 구하는 클래스
package ex3;
import java.util.Scanner;
public class CircleDemo {

	public static void main(String[] args) {
		double r;
		Scanner keyboard = new Scanner(System.in);
		r = keyboard.nextDouble();
		System.out.println("area"+Circle.area(r));
		System.out.println("Circumference:"+Circle.circum(r));

	}

}

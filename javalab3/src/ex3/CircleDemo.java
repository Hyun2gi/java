//1971040 ������
//���� 3 : �� ����, ���� ���ϴ� Ŭ����
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

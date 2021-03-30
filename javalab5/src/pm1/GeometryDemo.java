//1971040 이현정
//실습 1 : 도형 면적/ 둘레 구하기
package pm1;

import java.util.Scanner;

public class GeometryDemo {

	public static void main(String[] args) {
		double side, a, b,c, radius;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input radius for a circle");
		radius = sc.nextDouble();
		
		System.out.println("Input length for a square");
		side = sc.nextDouble();
		
		System.out.println("Input a for a triangle");
		a = sc.nextDouble();
		
		System.out.println("Input b for a triangle");
		b = sc.nextDouble();
		
		System.out.println("Input c for a triangle");
		c = sc.nextDouble();
		
		Triangle t = new Triangle(a,b,c);
		Circle circle = new Circle(radius);
		Square s = new Square(side);
		
		System.out.println("<Circle>");
		System.out.println("Area :" +circle.area());
		System.out.println("Circumference : " + circle.perimeter());
		
		System.out.println("<Square>");
		System.out.println("Area :" + s.area());
		System.out.println("Circumference : " + s.perimeter());
		
		System.out.println("<Triangle>");
		System.out.println("Area :" +t.area());
		System.out.println("Circumference : " + t.perimeter());
		
		
		

	}

}

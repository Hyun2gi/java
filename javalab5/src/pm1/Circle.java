//1971040 이현정
//실습 1 : 도형 면적/ 둘레 구하기
package pm1;

public class Circle implements Geometry {
	double r;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		r = radius;
	}

	@Override
	public double area() {
		return r*r*PI;
	}

	@Override
	public double perimeter() {
		return 2.0*r*PI;
	}

}

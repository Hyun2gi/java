//1971040 이현정
//실습 1 : 도형 면적/ 둘레 구하기
package pm1;

public class Square implements Geometry {
	double s;
	
	public Square() {
		
	}
	
	public Square(double side) {
		s = side;
	}

	@Override
	public double area() {
		return s*s;
	}

	@Override
	public double perimeter() {
		return 4*s;
	}

}

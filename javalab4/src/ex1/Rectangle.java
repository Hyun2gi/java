//1971040 이현정
//예제1 : 2차원 도형
package ex1;

public class Rectangle extends TwoDShape {
	public boolean isSquare() {
		if(width==height) return true;
		else return false;
	}
	
	public double area() {
		return width * height;
	}

}

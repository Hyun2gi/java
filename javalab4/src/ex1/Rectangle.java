//1971040 ������
//����1 : 2���� ����
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

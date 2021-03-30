//1971040 이현정
//예제 4 : 인터페이스
package ex4;

public class Rectangle implements ShapesInterface {
	int width, height;
	double area;
	
	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}

	@Override
	public void computerArea() {
		area = width*height;

	}

	@Override
	public void show() {
		System.out.println("Rectangle : ");
		System.out.println(width + " " + height + " " + area);

	}

}

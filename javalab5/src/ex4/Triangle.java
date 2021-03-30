//1971040 이현정
//예제 4 : 인터페이스
package ex4;

public class Triangle implements ShapesInterface {
	int width, height;
	double area;
	
	public Triangle(int w, int  h) {
		width =w;
		height = h;
	}

	@Override
	public void computerArea() {
		area = (width + height) /2.0;
	}

	@Override
	public void show() {
		System.out.println("Triangle : ");
		System.out.println(width + " " + height + " " + area);

	}

}

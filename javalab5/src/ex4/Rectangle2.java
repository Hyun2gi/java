//1971040 ������
//���� 4 : �������̽�
package ex4;

public class Rectangle2 implements ShapesInterface {
	int width, height;
	double area;
	
	public Rectangle2(int w) {
		width = w;
		height = w;
	}

	@Override
	public void computerArea() {
		area = width*width;

	}

	@Override
	public void show() {
		System.out.println("Rectangle2 : ");
		System.out.println(width + " " + height + " " + area);

	}

}

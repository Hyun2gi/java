//1971040 ������
//�ǽ� 1 : ���� ����/ �ѷ� ���ϱ�
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

//1971040 ������
//�ǽ� 1 : ���� ����/ �ѷ� ���ϱ�
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

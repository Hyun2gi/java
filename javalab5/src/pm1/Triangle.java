//1971040 ������
//�ǽ� 1 : ���� ����/ �ѷ� ���ϱ�
package pm1;
import java.util.*;
public class Triangle implements Geometry {
	double a;
	double b;
	double c;
	
	public Triangle() {
	}
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double area() {
		double s = (a+b+c)/2.0;
		double area = s*(s-a)*(s-b)*(s-c);
		return Math.sqrt(area) ;
	}

	@Override
	public double perimeter() {
		return a+b+c;
	}

}

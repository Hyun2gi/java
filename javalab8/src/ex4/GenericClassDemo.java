//1971040 ������
//���� 4 : ���ʸ� Ŭ����
package ex4;
import java.util.*;
public class GenericClassDemo {

	public static void main(String[] args) {
		MyClass<Point> s = new MyClass<Point>();
		s.set(new Point(1,2));
		System.out.println(s.get().toString());
	}

}

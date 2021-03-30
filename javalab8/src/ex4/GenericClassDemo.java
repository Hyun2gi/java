//1971040 이현정
//예제 4 : 제너릭 클래스
package ex4;
import java.util.*;
public class GenericClassDemo {

	public static void main(String[] args) {
		MyClass<Point> s = new MyClass<Point>();
		s.set(new Point(1,2));
		System.out.println(s.get().toString());
	}

}

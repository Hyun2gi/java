//1971040 이현정
//예제4 : Collection - ArrayList<E>
package ex4;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Double> v = new ArrayList<Double>();
		double c = 0.0;
		for(int i=0;i<10;i++) {
			c = ((double)i*10);
			v.add(c);
		}
		
		double sum = 0.0;
		for(int i=0;i<v.size();i++) {
			sum+=v.get(i);
		}
		
		System.out.println(sum);
		
	}
}

//1971040 ������
//����3 : Iterator�� ����� ���� �˻�
package ex3;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(2,25);
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

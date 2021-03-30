//1971040 이현정
//예제 2 : collection - vector<E>
package ex2;
import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("k");
		a.add("j");
		a.add("america");
		a.add("china");
		a.add("canada");
		a.add("britain");
		
		
		for(int i=0; i <a.size();i++) {
			a.remove(a.get(i));
		}
		
		Iterator<String> it = a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

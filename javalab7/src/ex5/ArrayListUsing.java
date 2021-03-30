//1971040 이현정
//예제5 : ArrayList 메소드 활용
package ex5;
import java.util.*;
public class ArrayListUsing {

	public static void main(String[] args) {
		ArrayList<Integer> mArrayList = new ArrayList<Integer>();
		
		mArrayList.add(10);
		mArrayList.add(20);
		mArrayList.add(30);
		mArrayList.add(10);
		mArrayList.add(50);
		System.out.println();
		
		for(int i = 0; i<mArrayList.size();i++) {
			System.out.println("one index " + i+" : value " + mArrayList.get(i));
		}
		System.out.println();
		
		mArrayList.remove(0);
		
		for(int i=0;i<mArrayList.size();i++) {
			System.out.println("two index " + i + " : value" + mArrayList.get(i));
		}
		System.out.println();
		
		mArrayList.add(0,7777);
		
		for(int i = 0;i<mArrayList.size();i++) {
			System.out.println("three index" + i + ": value " + mArrayList.get(i));
		}
		System.out.println();
		
		mArrayList.set(0, 77779);
		for(int i=0; i<mArrayList.size();i++) {
			System.out.println("four index " + i + ": value" +mArrayList.get(i));
		}
		System.out.println();
		
		Integer checkNumber = new Integer(99999);
		boolean isFind = mArrayList.contains(checkNumber);
		
		if(!isFind) {
			mArrayList.add(checkNumber);
			System.out.println("five : 99999 - not found - so, add \n");
		}else {
			System.out.println("five : 99999 - already exist \n");
		}
		
		for(Integer val : mArrayList) {
			System.out.println("five : value: " +val);
		}
		System.out.println();
		
		int index = mArrayList.indexOf(checkNumber);
		System.out.println("six : index" + index + "\n");
		
		mArrayList.remove(index);
		
		mArrayList.clear();
		System.out.println("seven : size " + mArrayList.size() + "\n");
		
		boolean isEmpty = mArrayList.isEmpty();
		System.out.println("eight : empty" + isEmpty + "\n");
		
	}

}

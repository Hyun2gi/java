//1971040 이현정
//예제 7 : volatile 테스트
package ex7;

public class VolatileTest {

	public static void main(String[] args) {
		ChangeListener listenerObj = new ChangeListener();
		ChangeMaker makerObj = new ChangeMaker();
		SharedObject obj = new SharedObject();
		
		listenerObj.sharedObj = obj;
		makerObj.sharedObj = obj;
		
		listenerObj.start();
		makerObj.start();
	}

}

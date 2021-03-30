//1971040 이현정
//예제 7 : volatile 테스트
package ex7;

public class ChangeMaker extends Thread {
	public SharedObject sharedObj;
	
	public void run() {
		int local_value = sharedObj.MY_INT;
		
		while(sharedObj.MY_INT < 5 ) {
			String s = String.format("Incrementing MY_INT to %d", local_value + 1);
			System.out.println(s);
			sharedObj.MY_INT = ++local_value;
			try {
				Thread.sleep(500);
			}catch(InterruptedException e ) {
				e.printStackTrace();
			}
		}
	}
}

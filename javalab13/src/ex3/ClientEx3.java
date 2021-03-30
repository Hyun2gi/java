//1971040 이현정
//예제 3 : 스레드 이용한 1:1 채팅
package ex3;

import java.net.Socket;

public class ClientEx3 {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket("localhost",9001);
			
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			thread1.start();
			thread2.start();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

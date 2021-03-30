//1971040 이현정
//예제 3 : 스레드 이용한 1:1 채팅
package ex3;

import java.net.ServerSocket;
import java.net.Socket;

public class Server3 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9001);
			socket = serverSocket.accept();
			
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			thread1.start();
			thread2.start();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				serverSocket.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}

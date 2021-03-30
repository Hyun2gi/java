//1971040 이현정
//예제 3 : 스레드 이용한 1:1 채팅
package ex3;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;

public class SenderThread extends Thread{
	Socket socket = null;
	
	public SenderThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String str = in.nextLine();
				if(str.equalsIgnoreCase("bye")) break;
				out.println(str);
				out.flush();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

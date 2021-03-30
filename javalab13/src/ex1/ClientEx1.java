//1971040 이현정
//예제 1 : 간단한 인사 메세지 전송
package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class ClientEx1 {

	public static void main(String[] args) {
		Socket socket = null;
		String ipAddr = "localhost";
		
		try {
			socket = new Socket(ipAddr,9000);
			System.out.println("2.Request");
			
			Scanner in = new Scanner(socket.getInputStream());
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			out.println("4.Send form Client: Hello, Server!!!");
			out.flush();
			
			String strIn = in.nextLine();
			System.out.println(strIn);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				socket.close();
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}

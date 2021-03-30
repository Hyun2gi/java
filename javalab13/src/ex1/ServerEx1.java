//1971040 이현정
//예제 1 : 간단한 인사 메세지 전송
package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx1 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9000);
			socket = serverSocket.accept();
			System.out.println("3.Accept");
			
			Scanner in = new Scanner(socket.getInputStream());
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			String strIn = in.nextLine();
			System.out.println(strIn);
			
			out.println("3.Send from server: Hello, Client!!!");
			out.flush();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				socket.close();
				serverSocket.close();
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}

//1971040 ������
//���� 2 : 1:1 ä�� ���α׷�
package ex2;
import java.io.*;
import java.net.*;
import java.util.*;
import java.io.IOException;
public class ServerEx2 {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			listener = new ServerSocket(9999);
			System.out.println("������ ��ٸ��� �ֽ��ϴ�......");
			socket = listener.accept();
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("Ŭ���̾�Ʈ���� bye�� ������ �����Ͽ����ϴ�.");
					break;
				}
				System.out.println("Ŭ���̾�Ʈ : " + inputMessage);
				System.out.println("������ >>");
				String outputMessage = scanner.nextLine();
				out.write(outputMessage + "\n");
				out.flush();
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				socket.close();
				listener.close();
			}catch (IOException e) {
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ������ �߻��߽��ϴ�.");
			}
		}
	}
}
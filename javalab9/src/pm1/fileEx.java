//1971040 ������
//�ǽ� 1  : ��ȭ��ȣ
package pm1;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.io.BufferedReader;
public class fileEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("phone.txt");
		try {
			FileWriter fw = new FileWriter(file);
			FileReader fr = new FileReader(file);
			String str;
			System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
			while(true) {
				str = sc.next();
				if(str.equals("�׸�")) {
					break;
				}
				fw.write(str);
			}
			System.out.println(file.getPath()+"�� ����մϴ�.");
			int c;
			while((c=fr.read())!=-1) {
				System.out.println((char)c);
			}
			fr.close(); fw.close();
			}catch(Exception e) {
				System.out.println();
			}
			
	}

}

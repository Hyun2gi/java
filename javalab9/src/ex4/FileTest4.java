//1971040 ������
//���� 4 : ���� ��Ʈ�� �̿��� ���
package ex4;
import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class FileTest4 {

	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("c:\\javalab\\test.txt");
			BufferedOutputStream bi = new BufferedOutputStream(System.out,5);
			while((c = fin.read())!= -1) {
				bi.write(c);
			}
			
			new Scanner(System.in).nextLine();
			
			bi.flush();
			fin.close();
			bi.close();
		}catch(Exception e) {
			System.out.println();
		}
	}

}

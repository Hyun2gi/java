//1971040 ������
//���� 1 : file Ŭ����
package ex1;
import java.io.File;

public class FileTest1 {

	public static void main(String[] args) {
		System.out.println("c: ����̺��� ��ü ���� ���");
		
		File file = new File("C:\\");
		String[] str = file.list();
		
		for(String f : str) {
			File subfile = new File(file,f);
			
			if(subfile.isDirectory())
		}

	}

}

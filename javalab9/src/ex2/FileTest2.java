//1971040 이현정
//예제 2 : 텍스트 파일 복사
package ex2;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class FileTest2 {

	public static void main(String[] args) {
		File src = new File("c:\\javalab\\lab9.txt");
		File dest = new File("c:\\javalab\\\\myinfo.txt");
		try {
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(dest);
		
		while(true) {
			int c = fr.read();
			if(c== -1) {
				break;
			}
			fw.write((char)c);
		}
		fr.close(); fw.close();
		}catch(Exception e) {
			System.out.println();
		}
		
	}
}

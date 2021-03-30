//1971040 이현정
//예제 3 : 이미지 파일 복사
package ex3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest3 {

	public static void main(String[] args) {
		File src = new File("c:\\javalab\\img1.jpg");
		File dest = new File("c:\\javalab\\Spider-Man.jpg");
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			while(true) {
				if((c=fi.read())==-1) {
					break;
				}
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
		}catch(Exception e) {
			System.out.println();
		}
	}
}

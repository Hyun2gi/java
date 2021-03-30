//1971040 이현정
//예제 3 : 이미지 파일 복사
package ex3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileTest3_2 {

	public static void main(String[] args) {
		File src = new File("c:\\javalab\\img1.jpg");
		File dest = new File("c:\\javalab\\desert.jpg");
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf = new byte[1024*10];
			while(true) {
				int n = fi.read(buf);
				
			}
			
			System.out.println(src.getPath() + "를 "+dest.getPath()+"로 복사하였습니다.");
		}catch(IOException e) { System.out.println("파일 복사 오류");}

	}

}

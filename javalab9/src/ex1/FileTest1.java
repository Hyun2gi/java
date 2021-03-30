//1971040 이현정
//예제 1 : file 클래스
package ex1;
import java.io.File;

public class FileTest1 {

	public static void main(String[] args) {
		System.out.println("c: 드라이브의 전체 파일 출력");
		
		File file = new File("C:\\");
		String[] str = file.list();
		
		for(String f : str) {
			File subfile = new File(file,f);
			
			if(subfile.isDirectory())
		}

	}

}

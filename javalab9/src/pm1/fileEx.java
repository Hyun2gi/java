//1971040 이현정
//실습 1  : 전화번호
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
			System.out.println("전화번호 입력 프로그램입니다.");
			while(true) {
				str = sc.next();
				if(str.equals("그만")) {
					break;
				}
				fw.write(str);
			}
			System.out.println(file.getPath()+"를 출력합니다.");
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

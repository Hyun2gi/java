//1971040 이현정

//실습 2 : 한영사전
package pm2;
import java.util.Scanner;
public class DictionaryDemo {

	public static void main(String[] args) {
		System.out.println("한영 단어 검색 프로그램입니다.");
		Scanner sc = new Scanner(System.in);
		String kor;
		while(true) {
			System.out.print("한글단어?");
			kor = sc.next();
			if(kor.equals("그만")) {
				break;
			}
			String eng = Dictionary.korToEngWord(kor);
			if(eng==null) {
				System.out.println("그런단어없음");
			}else {
				System.out.println(kor+"는"+eng);
			}
		}

	}

}

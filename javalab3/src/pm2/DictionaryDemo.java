//1971040 ������

//�ǽ� 2 : �ѿ�����
package pm2;
import java.util.Scanner;
public class DictionaryDemo {

	public static void main(String[] args) {
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		Scanner sc = new Scanner(System.in);
		String kor;
		while(true) {
			System.out.print("�ѱ۴ܾ�?");
			kor = sc.next();
			if(kor.equals("�׸�")) {
				break;
			}
			String eng = Dictionary.korToEngWord(kor);
			if(eng==null) {
				System.out.println("�׷��ܾ����");
			}else {
				System.out.println(kor+"��"+eng);
			}
		}

	}

}

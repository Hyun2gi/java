//1971040 ������

//�ǽ� 6 : ���忹��ý���
package pm6;

import java.util.Scanner;

public class movie {

	public static void main(String[] args) {
		System.out.print("�¼��� �����Ͻðڽ��ϱ�?(yes or no) : ");
		Scanner sc = new Scanner(System.in);
		int s[][] = new int[5][7];
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[i].length;j++) {
				s[i][j] = 0;
			}
		}
		String check;
		int line;
		int seat;
		while(true) {
			check = sc.next();
			if(check.equals("no")) {
				break;
			}
			System.out.print("�¼� ���°��? : ");
			line= sc.nextInt();
			while(line<0||line>s.length) {
				System.out.println("�ٽ��Է��Ͻÿ�.");
				line = sc.nextInt();
			}
			for(int i=0;i<s[line-1].length;i++) {
				System.out.println(s[line-1][i]);
			}
			System.out.println("�¼���? : ");
			seat = sc.nextInt();
			if(s[line-1][seat-1]==1) {
				System.out.println("�̹� ����� �¼��Դϴ�.");
			}else {
				s[line-1][seat-1] = 1;
				System.out.println("����Ǿ����ϴ�.");
			}
		}
	}

}

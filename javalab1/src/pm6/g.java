//1971040 ������
//�ǽ� 6 : ����� ����
package pm6;
import java.util.Scanner;
public class g {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		int num=0;
		for(int i=1;i<=1000;i++) {
			if(i%n1==0&&i%n2==0) {
				num++;
			}
		}
		System.out.println("�� ���� ����� ������"+num+"�Դϴ�.");
	}

}
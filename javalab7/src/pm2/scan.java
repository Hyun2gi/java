//1971040 ������
//�ǽ�2 : ���Ȯ��(������ �迭 Ȱ�� ����)
package pm2;

import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m11,m12,m21,m22;
		System.out.println("���� 4�� �Է�>>");
		m11 = sc.nextInt();
		m12 = sc.nextInt();
		m21 = sc.nextInt();
		m22 = sc.nextInt();
		String[][]array = new String[m11][m12];
		for(int i=0;i<m11;i++) {
				String s = sc.next();
				array[i] = s.split("");
		}
		int count1=1, count2=1;
		for(int i=0;i<m11;i++) {
			while(count1<=m21) {
				for(int j=0;j<m12;j++) {
					while(count2<=m22) {
						System.out.print(array[i][j] +" ");
						count2++;
					}
					count2=1;
				}
				count1++;
				System.out.println();
			}
			count1=1;
		}

	}

}

//1971040 ������
// �ǽ� 4 : �� �Ǹŷ� ���ϱ�1 , �� ��Ī ���� �� ���� 
package pm4;

import java.util.Scanner;
public class phone1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countList[] = {0,0,0,0,0};
		String phoneList[] = {"������", "����", "��Ƽ�ӽ�", "��̳�", "������"};
		
		while(true) {
			String name = sc.next();
			if(name.equals("������!!!")) {
				break;
			}
			for(int i=0;i<phoneList.length;i++) {
				if(phoneList[i].equals(name)) {
					countList[i]++;
					break;
				}
			}
		}
		
		for(int i=0;i<phoneList.length;i++) {
			System.out.println(countList[i]);
		}
	}

}

//1971040 ������
//�ǽ� 2 : �л� ���� �����ϰ� �˻�
package pm2;
import java.util.*;
public class StudentManager {

	public static void main(String[] args) {
		HashMap<String,SchoolInfo> student = new HashMap<String,SchoolInfo>();
		Scanner sin = new Scanner(System.in);
		System.out.println("�̸� �а� �й������� �л� 5���� ������ �Է��Ͻÿ�.");
		for(int i=0;i<5;i++) {
			String name = sin.next();
			String dept = sin.next();
			String SchoolID = sin.next();
			SchoolInfo sc = new SchoolInfo(dept,SchoolID);
			student.put(name, sc);
		}
		while(true) {
			System.out.println("�˻��� �л� �̸��� �Է��Ͻÿ�. �������� �̸��� '��'�̶�� �Է��Ͻÿ�.");
			String n = sin.next();
			if(n.equals("��")) {
				break;
			}
			SchoolInfo st = student.get(n);
			System.out.println(st.getDept()+ " "+ st.getSchoolID());
		}

	}

}

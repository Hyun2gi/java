//1971040 이현정
//실습 2 : 학생 정보 저장하고 검색
package pm2;
import java.util.*;
public class StudentManager {

	public static void main(String[] args) {
		HashMap<String,SchoolInfo> student = new HashMap<String,SchoolInfo>();
		Scanner sin = new Scanner(System.in);
		System.out.println("이름 학과 학번순서로 학생 5명의 정보를 입력하시오.");
		for(int i=0;i<5;i++) {
			String name = sin.next();
			String dept = sin.next();
			String SchoolID = sin.next();
			SchoolInfo sc = new SchoolInfo(dept,SchoolID);
			student.put(name, sc);
		}
		while(true) {
			System.out.println("검색할 학생 이름을 입력하시오. 끝내려면 이름을 '끝'이라고 입력하시오.");
			String n = sin.next();
			if(n.equals("끝")) {
				break;
			}
			SchoolInfo st = student.get(n);
			System.out.println(st.getDept()+ " "+ st.getSchoolID());
		}

	}

}

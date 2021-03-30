//1971040 이현정
//실습 2 : 학생 정보 저장하고 검색
package pm2;

public class SchoolInfo {
	private String dept;
	private String SchoolID;
	public SchoolInfo(String dept, String SchoolID) {
		this.dept = dept;
		this.SchoolID = SchoolID;
	}
	public String getDept() {
		return dept;
	}
	public String getSchoolID() {
		return SchoolID;
	}
}

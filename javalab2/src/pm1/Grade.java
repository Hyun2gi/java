// 1971040 이현정
// 실습1 : 성적처리
package pm1;

public class Grade {
	int math;
	int science;
	int english;
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public double average() {
		double avg;
		avg = (math+science+english)/3.0;
		return avg;
	}

}

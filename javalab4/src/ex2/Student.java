//1971040 이현정
//예제2 : person 클래스
package ex2;

public class Student extends Person {
	public Student(String name) {
		super(name);
	}
	
	public String getPhone() {
		return "Student " + super.getPhone();
	}

}

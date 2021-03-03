//1971040 이현정
//예제2 : person 클래스
package ex2;

public class Professor extends Person {
	
	public Professor(String name) {
		super(name);
	}
	
	public String getPhone() {
		return "Professor" + super.getPhone();
	}

}

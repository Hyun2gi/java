//1971040 이현정
//예제2 : person 클래스
package ex2;

public class Person {
	private String name;
	private String phone;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String toString() {
		return "[name=" + name +", phone=" +phone+"]";
	}

}

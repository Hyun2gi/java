//1971040 ������
//����2 : person Ŭ����
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

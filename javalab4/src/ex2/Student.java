//1971040 ������
//����2 : person Ŭ����
package ex2;

public class Student extends Person {
	public Student(String name) {
		super(name);
	}
	
	public String getPhone() {
		return "Student " + super.getPhone();
	}

}

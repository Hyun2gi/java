//1971040 ������
//����2 : person Ŭ����
package ex2;

public class Professor extends Person {
	
	public Professor(String name) {
		super(name);
	}
	
	public String getPhone() {
		return "Professor" + super.getPhone();
	}

}

//1971040 ������
//���� 6 : User ��ü ����
package ex6;
import java.io.*;
public class User implements Serializable {
	public String id;
	public String name;
	public int age;
	
	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "���̵�="+id+","+"�̸�= " +name+", ����= "+age;
	}
}

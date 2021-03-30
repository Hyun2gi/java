//1971040 이현정
//예제 6 : User 객체 저장
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
		return "아이디="+id+","+"이름= " +name+", 나이= "+age;
	}
}

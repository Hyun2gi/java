//1971040 이현정
//실습 2 : 강아지 정보 저장
package pm2;
import java.io.*;
public class Pet implements Serializable {
	private String name;
	private int age;
	private double weight;
	
	public void setPet(String newName, int newAge, double newWeight) {
		this.name = newName;
		this.age = newAge;
		this.weight = newWeight;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public void setWeight(double newWeight) {
		this.weight = newWeight;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
}

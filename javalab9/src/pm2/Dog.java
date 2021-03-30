//1971040 이현정
//실습 2 : 강아지 정보 저장
package pm2;
import java.io.*;
public class Dog extends Pet implements Serializable{
	private String breed;
	private boolean boosterShot;
	
	Dog(String name,int age, double weight, String breed, boolean boosterShot) { 
		setPet(name, age, weight);
		this.breed = breed;
		this.boosterShot = boosterShot;
	}
	
	void setBreed(String breed) {
		this.breed = breed;
	}
	
	void setBoosterShot(boolean boosterShot) {
		this.boosterShot = boosterShot;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public Boolean getBoosterShot() {
		return boosterShot;
	}
	
	public String toString() {
		return getName()+"    "+getAge()+"    "+getWeight()+"    "+getBreed()+"    "+getBoosterShot();
	}
}

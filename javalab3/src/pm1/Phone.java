//1971040 이현정

//실습 1 : 전화번호부
package pm1;

public class Phone {
	private String name;
	private String phoneNum;
	
	public Phone() {
		this("anonymous",000);
	}
	
	public Phone(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	public boolean isYourName(String name) {
		if(this.name.equals(name)) {
			return true;
		}
		return false;
	}
	
	public String getPhoneNum() {
		return this.phoneNum;
	}
}

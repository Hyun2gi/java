//1971040 이현정
//예제2 : person 클래스
package ex2;

public class PersonDemo {

	public static void main(String[] args) {
		Professor gil = new Professor("Hong, GilDong");
		gil.setPhone("011-1234-5678");
		System.out.println(gil.getPhone());
		
		Person hong = gil;
		System.out.println(hong.getPhone());
		
		System.out.println();
		
		Person na = new Student("Na, Ewha");
		na.setPhone("010-4321-9876");
		System.out.println(na.getPhone());
		
		System.out.println();
		
		whoAmI("hong", hong);
		whoAmI("na",na);

	}
	
	public static void whoAmI(String instName, Person who) {
		System.out.println(instName + " info: "+ who.toString());
		
		if(who instanceof Professor) {
			System.out.println(instName + "is instance of \"Professor\" Class.");
		}
		if(who instanceof Student) {
			System.out.println(instName + "is instance of \"Student\" Class.");
		}
		
		System.out.println();
	}

}

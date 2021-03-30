//1971040 이현정
//예제 3 : HashMap
package ex3;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> loginData = new HashMap<String,String>();
		
		loginData.put("89123","김승우");
		loginData.put("04123", "차태현");
		loginData.put("13323", "윤동구");
		
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		String name = sc.next();
		
		if(!loginData.containsKey(id)) {
			System.out.println("아이디가 존재하지 않습니다.");
		}
	}

}

//1971040 ������
//���� 3 : HashMap
package ex3;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> loginData = new HashMap<String,String>();
		
		loginData.put("89123","��¿�");
		loginData.put("04123", "������");
		loginData.put("13323", "������");
		
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		String name = sc.next();
		
		if(!loginData.containsKey(id)) {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
		}
	}

}

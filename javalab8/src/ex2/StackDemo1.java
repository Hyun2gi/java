//1971040 ������
//����2 : stack Ŭ����
package ex2;
import java.util.*;
public class StackDemo1 {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		String d = "{ } { ( ( { } ) ) { ( { ( ( ) ( ) ) } }";
		StringTokenizer dt = new StringTokenizer(d);
		int check = 0;
		while(dt.hasMoreTokens()) {
			String a = dt.nextToken();
			if(a.equals("(")||a.equals("{")) {
				s.push(a);
			}else {
				if(s.empty() == true) {
					check = 1;
					break;
				}else {
					String b = s.pop();
					if(b.equals("(")&&a.equals(")")||b.equals("{")&&a.equals("}")) ;
					else {
						check = 2;
						break;
					}
				}
			}
		}
		switch(check) {
		case 0 :
			if(!s.empty()) {
				System.out.println("������ ��ȣ ����");
			}
		}
		
	}

}

//1971040 이현정
//실습 1 : palindrome 식별하기
package pm1;
import java.util.Stack;
import java.util.Scanner;
import java.util.StringTokenizer;

public class palindrome {

	public static void main(String[] args) {
		System.out.println("[palimdrome 검사 프로그램]");
		
		Scanner sc = new Scanner(System.in);
		Stack<String> st = new Stack<String>();
		
		while(true) {
			System.out.print("문자열 입력 >> ");
			String str = sc.nextLine();
			if(str.equals("0")) {
				break;
			}
			StringTokenizer stk = new StringTokenizer(str);
			int check  = 0; // check = 1
			while(stk.hasMoreTokens()) {
				String s1 = stk.nextToken();
				if(s1.equals("#")) {
					check = 1;
					while(stk.hasMoreElements()) {
						s1 = stk.nextToken();
						if(st.empty()) {
							check = 2; // 길이가 안맞음
							break;
						}
						String s2 = st.pop();
						if(!s1.equals(s2)) {
							check = 2; //대칭아님.
							break;
						}
					}
				}
				if(check==2||check ==1) {
					break;
				}
				st.push(s1);
			}
			if(!st.isEmpty()) {
				check = 2;
			}
			if(check==2) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
	}

}

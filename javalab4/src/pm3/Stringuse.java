//1971040 이현정
//실습 3: 클래스 라이브러리 활용(String)
package pm3;
import java.util.Scanner;

public class Stringuse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str1, str2;
		str1 = sc.next();
		str2 = sc.next();
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		String s1[] = str1.split("");
		String s2[] = str2.split("");
		
		int c=0;
		int check=1;
		while(c<s1.length) {
			for(int i=0;i<s1.length;i++) {
				if(s1[c].equals(s2[i])) {
					s2[i] = " ";
					check=1;
					break;
				}else {
					check =0;
				}
			}
			if(check==0) {
				System.out.println("F");
				break;
			}
			c++;
		}
		if(check==1) {
			System.out.println("T");
		}
	}

}

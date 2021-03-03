//1971040 이현정
// 실습 7 : 음의 순서 판별
package pm7;
import java.util.Scanner;
public class s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] str = s.split(" ");
		int[]a = new int[str.length];
		for(int i=0;i<a.length;i++) {
			a[i] = Integer.parseInt(str[i]);
		}
		int check=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				check=1;
				break;
			}
		}
		if(check==1) {
			for(int i=0;i<a.length-1;i++) {
				if(a[i]<a[i+1]) {
					check=2;
					break;
				}
			}
		}
		switch(check) {
		case 0 :
			System.out.println("ascending");
			break;
		case 1 :
			System.out.println("descending");
			break;
		case 2:
			System.out.println("mixed");
			break;
		}
}
}

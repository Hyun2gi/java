//1971040 이현정
//예제 7 : wrapper클래스
package ex7;

import java.util.Scanner;

public class SomeClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		str = sc.nextLine();
		
		int sum = 0;
		int i =0;
		
		while(i<str.length())
		{
			if(48 <= str.charAt(i)&& str.charAt(i) <=57)
				sum+= Integer.parseInt(str.substring(i,i+1));
			
			i++;
		}
		System.out.println("최종 합 :: " +sum);
		sc.close();

	}

}

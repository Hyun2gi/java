// 1971040 이현정
//실습 3 : 숫자 저장과 합계 계산
package pm3;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		int A[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<A.length;i++) {
			A[i] = sc.nextInt();
		}
		int max = A[0];
		int sum=0;
		for(int i=0;i<A.length;i++) {
			if(A[i]>max) {
				max = A[i];
			}
			sum += A[i];
		}
		System.out.printf("%d   %d",max,sum);
	}

}
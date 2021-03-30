//1971040 이현정
//예제 6 : 제너릭 메소드 만들기
package ex6;

public class PrintAllClass {
	public static void printAll(Integer a[]) {
		int i;
		for(i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void printAll(Double a[]) {
		int i;
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void printAll(String a[]) {
		int i;
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
 }

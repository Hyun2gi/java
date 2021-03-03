//1971040 이현정
//예지 2 : Time 객체 배열
package ex2;
import java.util.Scanner;
import java.math.*;
class Time {
	int hour;
	int minute;
	int second;
}

public class TimeTest {
	public static int randNum(int n) {
		return(int)(Math.random()*n);
	}
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("How many times do you want to generate?");
		int n = kbd.nextInt();
		Time[] t = new Time[n];
		int i;
		for(i=0; i<t.length ; i++) {
			t[i] = new Time();
			t[i].hour = randNum(24);
			t[i].minute = randNum(60);
			t[i].second = randNum(60);
		}
		for(i=0; i<t.length ; i++) {
			System.out.println(t[i].hour);
			System.out.println(t[i].minute);
			System.out.println(t[i].second);
		}
		
	}
}
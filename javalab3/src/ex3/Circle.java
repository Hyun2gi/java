//1971040 이현정
//예지 3 : 원 면적, 원주 구하는 클래스
package ex3;
public class Circle {
	public static final double PI = 3.14159;
	
	public static double area(double radius) {
		return (PI*radius*radius);
	}
	public static double circum(double radius) {
		return (PI*(radius+radius));
	}

}

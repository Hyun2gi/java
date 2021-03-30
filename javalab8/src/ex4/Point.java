package ex4;

public class Point<T1,T2> {
	T1 a;
	T2 b;
	public Point(T1 a, T2 b) {
		this.a = a;
		this.b = b;
	}
	
	public String toString() {
		return "(" + a + "," + b+ ")";
	}
}
